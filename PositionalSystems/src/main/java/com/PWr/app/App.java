package com.PWr.app;





public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to 'Positional Systems Converter'");
        
        SystemsConverter converter = new SystemsConverter();
        CommandLine cmd = new CommandLine(converter);
        
        while (true) {
            try {
                cmd.getExecuteCommand();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
