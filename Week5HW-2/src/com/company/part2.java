package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();
        cars.put("Toyota", "Corolla");
        cars.put("Lamborghini","Terzo Millennio");
        cars.put("Ford","Fiesta");
        cars.put("Honda","Civic");
        cars.put("Nissan","GT-R");
//        System.out.println(cars.get[0]);
        Scanner s = new Scanner(System.in);
        System.out.println("What model car are you looking for?");
        String temp = s.nextLine();
        for (Map.Entry<String, String> entry : cars.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if(Objects.equals(temp, value)) {
                System.out.println("Oh, you're looking for a " + temp + "? Our "+ key +" selection is right over here...");
            }
        }
    }
}
