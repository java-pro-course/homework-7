package com.company;

class Animal {
    String name;
    String nickname;
    int age;
    int height;
    int weight;

    public void getInfo() {
        System.out.println("Object dog. Name: " + name);
        System.out.println("Object dog. nickname: " + nickname);
        System.out.println("Object dog. Age: " + age);
        System.out.println("Object dog. Height: " + height);
        System.out.println("Object dog. Weight: " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Собака";
        dog.nickname = "Шарик";
        dog.age = 2;
        dog.height = 40;
        dog.weight = 12;
        dog.getInfo();
    }
}
