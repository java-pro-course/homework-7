import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.name = "Dog";
        animal1.nickname = "Mike";
        animal1.age = 4;
        animal1.weight = 12;
        animal1.height = 40;

        animal1.getInfo();
    }

 public static Scanner in = new Scanner(System.in);
}

class Animal {
    String name;
    String nickname;
    int age;
    int weight;
    int height;

    Animal() {
    }

    public void getInfo() {
        System.out.println(this.name + "; " + this.nickname + "; " + this.age + "; " + this.weight + "; " + this.height + ".");
    }
}
