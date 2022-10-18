package com.PWr.app;





public class SystemsConverter {
    private int main_sys_base;

    private int index;
    private int[] new_sys_bases;



    public SystemsConverter () {
        this.index = 0;
        this.new_sys_bases = new int[10];
    }

    public void setMainSystem(int base) {
        if (base > 1 && base < 17)  { this.main_sys_base = base; }
        else    { System.out.println("Could not add a new system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
    }

    public void addSystem(int base) {
        if (this.index < 10) {
            if (base > 1 && base < 17)  { this.new_sys_bases[this.index] = base; }
            else    { System.out.println("Could not add a new system base (" + base + ")!\nSystem base must be in range [2, 16]!"); }
        }
        else    { System.out.println("Could not add a new system base! The limit has been reached!"); }
    }
}

