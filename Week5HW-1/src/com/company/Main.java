package com.company;

public class Main {

    public static void main(String[] args) {
        int uninitialized;
        System.out.println(uninitialized);
        int badInt = "string";
        int otherBadInt = 987987987987987987;
        short badShort = 123456789;
        boolean badBoolean = "this isn't a boolean";
        char badChar = "take that";


        int @badName = 4;
        int !badName = 4;
        int 3notGoodName = 4;
        int ^badname = 7;
    }
}
