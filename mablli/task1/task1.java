import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.getInfo();
    }

 public static Scanner in = new Scanner(System.in);
}

class Human {
    String gender = "male";
    String name = "John";
    int height = 178;
    String eyesColor = "blue";
    String hairColor = "dark";

    public void getInfo() {
        System.out.println(gender + "; " + name + "; " + height + "; " + eyesColor + "; " + hairColor + ".");
    }
}

