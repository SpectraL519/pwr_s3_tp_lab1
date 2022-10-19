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

    public void setMainSystem (int base) {
        if (base > 1 && base < 17)  { this.p0 = base; }
        else    { System.out.println("Could not set the main system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
    }

    public int getMainSystem () {
        return this.p0;
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
        if (base > 1 && base < 17) {
            if (this.p0 == 0) { 
                System.out.println("Could not convert! First set the main system base");
                return "Error";
            }
    
            int decimal = -1;
            if (this.p0 != 10)  { decimal = convertToDecimal(number); }
            else {
                try { decimal = Integer.valueOf(number); }
                catch (Exception e) { return e.getMessage(); }
            }
    
            if (decimal == -1) { return "Error"; }
            else {
                if (base != 10) { number = convertToNonDecimal(decimal, base); }
                else { return Integer.toString(decimal); }
            }
        }
        else {
            System.out.println("Could not convert! The given base is not supported (must be in range [2, 16])");
            return "Error";
        }

        return number;
    }
}

