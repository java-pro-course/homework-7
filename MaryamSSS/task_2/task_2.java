package com.company;

class Animal {
    String title;
    String name;
    int age;
    int height;
    int weight;

    public void getInfo() {
        System.out.println("Object information: ");
        System.out.println("__________________________");
        System.out.println("Название: " + title);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Масса: " + weight);
    }
}

public class Main {

    public static void main(String[] args) {
	Animal Doggy = new Animal();
	Doggy.title = "Дворняга";
	Doggy.name = "Пёсик";
	Doggy.age = 3;
	Doggy.height = 30;
	Doggy.weight = 25;
	Doggy.getInfo();
    }
}
