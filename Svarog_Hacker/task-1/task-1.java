package com.company;

class Human{
    String gender = "female";
    String name = "Hecuba";
    String surname = "Morpho";
    int height = 170;
    int age = 16;
    String heir_color = "red";
    String eyes_color = "green";
    String profession = "witch";
    String pet = "cat";

    public void getInfo(){
        System.out.println("The gender is " + this.gender);
        System.out.println("The name is " + this.name);
        System.out.println("The surname is " + this.surname);
        System.out.println("The height is " + this.height);
        System.out.println("The age is " + this.age);
        System.out.println("The heir color is " + this.heir_color);
        System.out.println("The eyes color is " + this.eyes_color);
        System.out.println("The profession is " + this.profession);
        System.out.println("The pet is " + this.pet);
    }
}

public class Main {

    public static void main(String[] args) {
        Human hecuba = new Human();
        hecuba.getInfo();
    }
}
