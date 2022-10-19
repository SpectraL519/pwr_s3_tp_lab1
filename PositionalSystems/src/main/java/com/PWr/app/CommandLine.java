package com.PWr.app;

import java.util.Scanner;





public class CommandLine {
    private Scanner std_in_scanner;
    private SystemsConverter converter;

    private String command;
    private int base;
    private String number;



    public CommandLine (SystemsConverter converter) {
        std_in_scanner = new Scanner(System.in);
        this.converter = converter;
    }

    public void getExecuteCommand () {
        System.out.print("cmd: ");

        this.command = std_in_scanner.next();
        
        switch (this.command) {
            case "setBase":
                this.base = std_in_scanner.nextInt();
                this.converter.setMainSystem(this.base);
                break;

            case "getBase":
                System.out.println(this.converter.getMainSystem());
                break;

            case "convert":
                this.number = std_in_scanner.next();
                this.base = std_in_scanner.nextInt();
                System.out.println("(" + this.number + ")_" + this.converter.getMainSystem() + " = (" + this.converter.convert(this.number, this.base) + ")_" + this.base);
                break;

            case "help":
                System.out.println("\nSystems conversion program commands:");
                System.out.println("\t- setBase <base> : Sets the current main system base to <base> (<base> must be from range [2, 16])");
                System.out.println("\t- getBase : Prints out the current main system base (0 - the main system base has not been set)");
                System.out.println("\t- convert <number> <base> : Converts the <number> from main system to a system of base <base>");
                System.out.println("\t- exit : Exits the program\n");
                break;
            
            case "exit":
                System.exit(0);

            default:
                System.out.println("Invalid command!");
                System.out.println("To get a commands' overview type 'help'");
        }
    }
}
