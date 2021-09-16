package com.company;

public class Main {

    public static void main(String[] args) {
	Pet myPet = new Pet("George", 10, "My house", "Dog");
    myPet.setName("Jorge");
    System.out.println(myPet.getName());
    System.out.println(myPet.isComplaining());
    System.out.println(myPet.isHungry());

    Person myPerson = new Person("not George",30, "the streets", "vibes");
    myPerson.setName("not Jorge");
    System.out.println(myPerson.getName());
    System.out.println(myPerson.isComplaining());
    System.out.println(myPerson.isHungry());

    Calculator myTest = new Calculator(5,5);
    System.out.println(myTest.add());
    System.out.println(myTest.subtract());
    System.out.println(myTest.multiply());
    System.out.println(myTest.divide());
    //I made this just square the first number since idk what else it would expect
    System.out.println(myTest.square());


    MagicCalc otherTest = new MagicCalc(10,10);
    System.out.println(otherTest.sqrt());
    System.out.println(otherTest.sin());
    System.out.println(otherTest.cos());
    System.out.println(otherTest.tan());
    System.out.println(otherTest.factorial());
    // To check that I can actually access original class
    System.out.println(otherTest.add());
    }

}
