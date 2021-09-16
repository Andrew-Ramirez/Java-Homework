package com.company;

public class Calculator {
    public int int1;
    public int int2;

    public Calculator(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public double sqrt() {
        return Math.sqrt(int1);
    }

    public int add() {
        return int1+int2;
    }

    public int subtract() {
        return int1 - int2;
    }

    public int multiply() {
        return int1*int2;
    }

    public int divide() {
        return int1/int2;
    }

    public int square() {
        return int1*int1;
    }
}
