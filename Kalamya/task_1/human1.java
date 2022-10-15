package com.company;



class Human {
    String gender;
    String Name;
    int height;
    String eyeColor;
    String hairColor;
    String work;

    public Human(String gender, String name, int height, String eyeColor, String hairColor, String work) {
        this.gender = gender;
        this.Name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.work = work;
    }

    public Human() {}

    public void lsInt(int a){
        System.out.println(a);
    }
    public void lsStr(String a){
        System.out.println(a);
    }
    public void getInfo(){
        lsStr("Object gender: " + gender);
        lsStr("Object Name: " + Name);
       System.out.println("Object height: " + height); //Все вместе, придумать войд одновременно для числаи для сло
        lsStr("Object eyeColor: " + eyeColor);
        lsStr("Object hairColor: " + hairColor);
        lsStr("Object work: " + work);
    }

}

public class Main {
    public static void main(String[] args) {
     Human human = new Human("Vertolet", "Pedro", 200, "White", "Black", "Engineer");
human.getInfo();
    }
}
