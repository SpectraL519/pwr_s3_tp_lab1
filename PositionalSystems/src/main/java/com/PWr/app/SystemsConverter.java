package com.PWr.app;





public class SystemsConverter {
    private int p0;
    private char values[];



    public SystemsConverter () {
        this.p0 = 0;

        this.values = new char[16];
        for (int i = 0; i < 10; i++)    { this.values[i] = (char)(i + '0'); }
        for (int i = 0; i < 6; i++)     { this.values[i + 10] = (char)(i + 'A'); }
    }

    public void setMainSystem(int base) {
        if (base > 1 && base < 17)  { this.p0 = base; }
        else    { System.out.println("Could not set the main system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
    }


        private int convertToDecimal (String number) {
            int decimal = 0;

            try     { decimal = Integer.parseInt(number, this.p0); }
            catch (Exception e) { 
                e.printStackTrace();
                return -1;
            }
            
            return decimal;
        }

        private String convertToNonDecimal (int decimal, int base) {
            String new_number = "";

            while (decimal > 0) {
                int mod = decimal % base;
                decimal /= base;

                new_number = this.values[mod] + new_number;
            }

            return new_number;
        }

    public String convert (String number, int base) {
        if (this.p0 == 0) { return "Could not add a new system base! First set the main system base"; }

        int decimal = -1;
        if (this.p0 != 10)  { decimal = convertToDecimal(number); }
        else {
            try { decimal = Integer.valueOf(number); }
            catch (Exception e) { return e.getMessage(); }
        }

        if (decimal == -1) { return "Something went wrong!"; }
        else {
            if (base != 10) { number = convertToNonDecimal(decimal, base); }
            else { return Integer.toString(decimal); }
        }

        return number;
    }
}

