package com.PWr.app;





public class SystemsConverter {
    private int p0;

    private int index;
    private int[] P;



    public SystemsConverter () {
        this.index = 0;
        this.P = new int[10];
    }

    public void setMainSystem(int base) {
        if (base > 1 && base < 17)  { this.p0 = base; }
        else    { System.out.println("Could not add a new system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
    }

    public void addSystem(int base) {
        if (this.index < 10) {
            if (base > 1 && base < 17)  { this.P[this.index] = base; }
            else    { System.out.println("Could not add a new system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
        }
        else    { System.out.println("Could not add a new system base! The limit has been reached!"); }
    }
}

