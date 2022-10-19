package com.PWr.app;





public class SystemsConverter {
    private int p0;

    private int index;
    private int[] P;



    public SystemsConverter () {
        this.p0 = 0;

        this.index = 0;
        this.P = new int[10];
    }

    public void setMainSystem(int base) {
        if (base > 1 && base < 17)  { this.p0 = base; }
        else    { System.out.println("Could not set the main system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
    }

    public void addSystem(int base) {
        if (this.p0 == 0) {
            if (this.index < 10) {
                if (base > 1 && base < 17)  { this.P[this.index] = base; }
                else    { System.out.println("Could not add a new system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
            }
            else    { System.out.println("Could not add a new system base! The limit has been reached!"); }
        }
        else    { System.out.println("Could not add a new system base! First set the main system base"); }
    }


        private String convertToDecimal (String number, int base) {
            int dec_number = 0;

            for (int i = number.length() - 1; i >= 0; i--) {
                try {
                    dec_number += Integer.valueOf(number.charAt(i)) * Math.pow(base, i);
                } 
                catch (NumberFormatException exception) { return exception.getMessage(); }
            }

            return Integer.toString(dec_number);
        }

    public String convert (String number, int base) {
        if (this.p0 == 0) { return "Could not add a new system base! First set the main system base"; }

        if (this.p0 != 10)  { number = convertToDecimal(number, base); }

        if (base != 10) { number = convertToNonDecimal(number, base); }

        return number;
    }
}

