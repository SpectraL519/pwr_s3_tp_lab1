package com.PWr.app;





public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to 'Positional Systems Converter'");

        System.out.println("Conversion test:");

        SystemsConverter converter = new SystemsConverter();

        converter.setMainSystem(2);
        System.out.println("(1111)2 = (" + converter.convert("1111", 10) + ")10");
        System.out.println("(1111)2 = (" + converter.convert("1111", 16) + ")16");

        converter.setMainSystem(3);
        System.out.println("\n(120)3 = (" + converter.convert("120", 10) + ")10");
        System.out.println("(120)3 = (" + converter.convert("120", 8) + ")8");
    }
}
