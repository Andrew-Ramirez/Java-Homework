package com.company;

public class Person {
    private String name;
    private int age;
    private String location;
    private String job;

    public Person() {

    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person(String name, int age, String location, String job) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJob() {
        return job;
    }

    public void setType(String job) {
        this.job = job;
    }

    public Boolean isHungry() {
        return true;
    }

    public String isComplaining() {
        return this.name + " is probably hungry";
    }
}
