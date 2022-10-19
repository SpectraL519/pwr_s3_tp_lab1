package com.PWr.app;





public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to 'Positional Systems Converter'");
        
        SystemsConverter converter = new SystemsConverter();
        CommandLine cmd = new CommandLine(converter);
        
        while (true) {
            cmd.getExecuteCommand();
        }
    }
}
