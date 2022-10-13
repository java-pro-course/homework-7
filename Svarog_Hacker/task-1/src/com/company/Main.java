package com.company;

package com.company;

class Animal {
    String title;
    String nickname;
    String fur_color;
    String eyes_color;
    int age;
    int length;
    double height;
    int weight;
    boolean slave;
    package com.company;
    public void getInfo(){
        System.out.println("The title is " + this.title);
        System.out.println("The nickname is " + this.nickname);
        System.out.println("The fur color is " + this.fur_color);
        System.out.println("The eyes color is " + this.eyes_color);
        System.out.println("The age is " + this.age);
        System.out.println("The length is " + this.length);
        System.out.println("The height is " + this.height);
        System.out.println("The weight is " + this.weight);
        System.out.println("The slave is " + this.slave);
    }
}
public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.title = "Black_Panthera"
        a.nickname = "Bagira"
        a.fur_color = "Black"
        a.eyes_color = "Green"
        a.age = "9"
        a.length = 2
        a.height = 1.5
        a.weight = 30
        a.slave = false;
        a.getInfo();
    }
}
