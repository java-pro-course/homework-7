package com.company;

class Animal{
    String title;
    String name;
    int age;
    int weight;
    int height;

    public Animal(String title, String name, int age, int weight, int height) {
        this.title = title;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Animal(){}
     void gitInfo(){
         lnStr("title: " + title);
         lnStr("name:" + name);
         System.out.println("age: " + age);
         System.out.println("weight: " + weight);
         System.out.println("height: " + height);

     }
    void lnStr(String a){
        System.out.println(a);
    }
}



public class Main {
    public static void main(String[] args) {
Animal animal =new Animal("fox", "Fire", 3, 10, 35);
animal.gitInfo();
    }
}
