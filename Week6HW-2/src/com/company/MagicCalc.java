package com.company;

public class MagicCalc extends Calculator{
    public MagicCalc(int int1, int int2) {
        super(int1, int2);
    }

    public double sin() {
        return Math.sin(int1);
    }

    public double cos() {
        return Math.cos(int1);
    }

    public double tan() {
        return Math.tan(int1);
    }

    public int factorial() {
        int fact = 1;
        for(int i=1; i<int1+1; i++) {
            fact *=i;
        }
        return fact;
    }
}
