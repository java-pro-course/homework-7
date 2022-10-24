class Animal {
    String animal_title;
    String name;
    int age;
    int height;
    int weight;

    public Animal(String animal_title, String name, int age, int weight, int height) {
        this.animal_title = animal_title;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;}


        public void getInfo() {
            System.out.println(animal_title);
            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
            System.out.println(weight);
        }
}
public class Main {
    public static void main(String[] args) {
        Animal Jesy = new Animal("jack russell", "Jesy", 2, 30, 5);
        Jesy.getInfo();
    }}

