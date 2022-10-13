package com.company;

class Human {
    String name;
    String surname;
    int age;
    int height;
    int weight;

    public void getInfo() {
        System.out.println("Object Human. Name: " + name);
        System.out.println("Object Human. Surname: " + surname);
        System.out.println("Object Human. Age: " + age);
        System.out.println("Object Human. Height: " + height);
        System.out.println("Object Human. Weight: " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Human petya = new Human();
        petya.name = "Петя";
        petya.surname = "Иванов";
        petya.age = 20;
        petya.height = 180;
        petya.weight = 75;
        petya.getInfo();
    }
}
