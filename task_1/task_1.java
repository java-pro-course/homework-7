package com.company;

class Human {
    String gender;
    String name;
    int age;
    int height;
    int weight;
    String skinColor;
    String eyeColor;
    String hairColor;

    public void getInfo() {
        System.out.println("Object information: ");
	System.out.println("__________________________");
        System.out.println("Пол: " + gender);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Масса: " + weight);
        System.out.println("Цвет кожи: " + skinColor);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Цвет волос: " + hairColor);
    }
}

public class Main {

    public static void main(String[] args) {
	Human Vasya = new Human();
	Vasya.gender = "Мужской";
	Vasya.name = "Вася";
	Vasya.age = 17;
	Vasya.height = 165;
	Vasya.weight = 60;
	Vasya.skinColor = "Белый";
	Vasya.eyeColor = "Голубой";
	Vasya.hairColor = "Каштановый";
	Vasya.getInfo();
    }
}
