class Human {
    String gender = "woman";
    String name = "Tanya";
    String height = "175";
    String color_eye = "green";
    String color_hair = "brown";


    public void getInfo() {
        System.out.println("gender: " + gender);
        System.out.println("name: " + name);
        System.out.println("height: " + height);
        System.out.println("color_eye: " + color_eye);
        System.out.println("color_gair: " + color_hair);
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.getInfo();
    }}
