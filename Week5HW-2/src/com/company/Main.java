package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {0, 0, 0, 0, 0};
	Scanner intInput = new Scanner(System.in);
        System.out.println("Please type in a list of 5 integers (separated by spaces");
        for (int i=0; i<5; i++){
            intArray[i] = intInput.nextInt();
        }
        int sum = 0;
        int prod = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<5; i++){
            sum += intArray[i];
            prod *= intArray[i];
            if(intArray[i]>max) {
                max = intArray[i];
            }
            if(intArray[i]<min) {
                min = intArray[i];
            }
        }
        System.out.print("the sum is " + sum + "\n");
        System.out.print("the product is " + prod + "\n");
        System.out.print("the minimum is " + min + "\n");
        System.out.print("the maximum is " + max + "\n");
    }
}
