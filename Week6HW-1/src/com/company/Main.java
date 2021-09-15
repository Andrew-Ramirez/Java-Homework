package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("The valid characters for this survey are ");
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        System.out.println("\n");
        System.out.println("What is your name?");
        Scanner inputs = new Scanner(System.in);
        String name = inputs.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Would you like to continue this survey? This survey will be used to generate your lucky winning numbers for the powerball! (Type y or yes to continue)");
        Scanner response = new Scanner(System.in);
        String resp = response.nextLine();
        Boolean looper = true;
        while(looper) {
            if (resp.equals("y") || resp.equals("yes")) {
                System.out.println("Thank you for continuing the survey!");
                System.out.println("What is the name of your favorite pet? (Make one up if you've never had one!");
                Scanner pet = new Scanner(System.in);
                String petName = pet.nextLine();
                System.out.println("What is the age of your favorite pet? Again, make it up if you don't have one!");
                Boolean ageTest = true;
                int petAge = 0;
                while (ageTest) {
                    Scanner age = new Scanner(System.in);
                    if (age.hasNextInt()) {
                        petAge = age.nextInt();
                        ageTest = false;
                    } else {
                        System.out.println("Please input a valid number");
                    }
                }
                System.out.println("What is your lucky number?");
                Boolean luckTest = true;
                int luckNum = 0;
                while (luckTest) {
                    Scanner luck = new Scanner(System.in);
                    if (luck.hasNextInt()) {
                        luckNum = luck.nextInt() % 75 + 1;
                        luckTest = false;
                    } else {
                        System.out.println("Please input a valid number");
                    }
                }
                System.out.println("Do you have a favorite Quarterback? Please enter Yes or No");
                int qbNumber = 0;
                Boolean qbTest = true;
                while (qbTest) {
                    Scanner qbExist = new Scanner(System.in);
                    String qbEx = qbExist.nextLine();
                    if (qbEx.equals("Yes")) {
                        Boolean qbnumTest = true;
                        System.out.println("What's their jersey Number?");
                        while (qbnumTest) {
                            Scanner qbNum = new Scanner(System.in);
                            if (qbNum.hasNextInt()) {
                                qbNumber = qbNum.nextInt() % 75;
                                qbnumTest = false;
                            } else {
                                System.out.println("Please input a valid number");
                            }
                        }
                        qbTest = false;
                    } else if (qbEx.equals("No")) {
                        qbNumber = 0;
                        qbTest = false;
                    } else {
                        System.out.println("Please enter Yes or No");
                    }
                }
                System.out.println("What are the last two digits of the model year of your car? If you don't have one, make one up!");
                Boolean carTest = true;
                int carYear = 0;
                while (carTest) {
                    Scanner car = new Scanner(System.in);
                    if (car.hasNextInt()) {
                        carYear = car.nextInt();
                        if (carYear > 99 || carYear < 0) {
                            System.out.println("Plese input a positive 1 or 2-digit number");
                        } else {
                            carTest = false;
                        }
                    } else {
                        System.out.println("Please input a valid number");
                    }
                }
                System.out.println("What is the first name of your favorite Actor/Actress?");
                Scanner fav = new Scanner(System.in);
                String favAct = fav.nextLine();
                System.out.println("Finally, please enter a number between 1 and 50. (Sometimes, you have to create your own luck!");
                Boolean ranTest = true;
                int ranChoice = 0;
                while (ranTest) {
                    Scanner ran = new Scanner(System.in);
                    if (ran.hasNextInt()) {
                        ranChoice = ran.nextInt();
                        if (ranChoice > 50 || ranChoice < 1) {
                            System.out.println("Plese input a number between 1 and 50");
                        } else {
                            ranTest = false;
                        }
                    } else {
                        System.out.println("Please input a valid number, between 1 and 50");
                    }
                }
                int fromPetName = 0;
                if (petName.length() > 2) {
                    fromPetName = petName.charAt(2) % 65 + 1;
                }
                if (petName.length() < 3) {
                    String temp = petName.repeat(3);
                    fromPetName = temp.charAt(2) % 65 + 1;
                }
                int fromCar = (carYear + luckNum) % 65 + 1;
                int fromChoice = ranChoice;
                int fromAct = favAct.charAt(0) % 65 + 1;
                int lastTemp = favAct.length() - 1;
                int fromActOther = favAct.charAt(lastTemp) % 65 + 1;
                int fromLife = 42;
                int fromPetCar = (petAge + carYear)%65+1;
                int fromLots = (qbNumber + petAge + ranChoice)%65+1;
                int[] luckyNumArr = {fromPetName, fromCar, fromChoice, fromAct, fromActOther, fromLife, fromPetCar, fromLots};
                System.out.println("Lottery Numbers: " + luckyNumArr[0] + " " + luckyNumArr[1] + " " +  luckyNumArr[2] + " " + luckyNumArr[3] + " " + luckyNumArr[4] + " " + "Magic Ball: " + luckNum);
                System.out.println("Best of luck!");
                System.out.println("Would you like to try again? Please enter Yes or No");
                Boolean repTest = true;
                while (repTest) {
                    Scanner rep = new Scanner(System.in);
                    String repCheck = rep.nextLine();
                    if (repCheck.equals("Yes")) {
                    repTest = false;
                    }
                    if(repCheck.equals("No")) {
                        System.out.println("Come back again!");
                        repTest = false;
                        looper = false;
                    }
                    else{
                        System.out.println("Please enter Yes or No");
                    }
                }

            }
            else{
                System.out.println("Come back another time to finish the survey!");
                looper = false;
            }
        }
    }
}
