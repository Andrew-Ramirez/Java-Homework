package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] example = {3, 2, 5, 43, 4, 45, 26, 20};
        int sum = 0;
        for (int i=0; i<example.length; i++) {
            sum += example[i];
        }
        System.out.println(sum);
        int[] testing = toPower(3,6);
        System.out.println(Arrays.toString(testing));

    }
    public static int[] toPower(int size, int power) {
        int[] test = new int[size];
        for (int i=0; i<size; i++) {
            test[i] = (int) Math.pow(i,power);
        }
        return test;
    }
}
