import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Human firstHuman = new Human();
        firstHuman.getInfo();
    }
 public static Scanner in = new Scanner(System.in);

    static class Human {
        String gender = "male";
        String name = "John";
        int height = 178;
        String eyesColor = "blue";
        String hairColor = "dark";

        public void getInfo() {
            System.out.println(gender + "; " + name + "; " + height + "; " + eyesColor + "; " + hairColor + ".");
        }
    }
}
