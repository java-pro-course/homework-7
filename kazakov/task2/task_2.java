class Animal {
    String type;
    String name;
    int age;
    int weight;
    int height;

    public Animal(String type, String name, int age, int weight, int height) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Type: " + type + "\n" + "Name: " + name);
        System.out.println("Info-----------------");
        System.out.println("Age: " + age + " y.o." + "\n" + "Weight: " + weight + " kg" + "\n" + "Height: " + height + " cm");
    }
}

public class Main {
        public static void main(String[] args) {
            Animal Bob = new Animal("rock", "Bob", 3000, 1000, 400);
            Bob.getInfo();
        }
    }
