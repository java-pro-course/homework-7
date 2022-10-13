class Car {
    String brand;
    String color;
    int price;
    int power;
    int weight;

    public Car(String brand, String color, int price, int power, int weight) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.power = power;
        this.weight = weight;
    }

    public Car() {}

    public void getInfo() {
        System.out.println("Object car. Brand: " + brand);
        System.out.println("Object car. Color: " + color);
        System.out.println("Object car. Price: " + price);
        System.out.println("Object car. Power: " + power);
        System.out.println("Object car. Weight: " + weight);
    }
}

class House {
    String address = "Krasnaya Ploshad, 1";
    int countRooms = 1;
    int floors = 3;
    int entranceCount = 2;
}

public class Main {
    public static void main(String[] args) {
        // Пример с объявлением объекта и дальнейшим присваиванием значения для полей объекта
        System.out.println("EXAMPLE #1");
        Car car = new Car(); // объявляем объект класса Car
        car.brand = "Mercedes"; // присваиваем значение определенных свойств для класса Car
        car.color = "White";
        car.price = 10000000;
        car.power = 500;
        car.weight = 1;

        System.out.println("Object car. Brand: " + car.brand);
        System.out.println("Object car. Color: " + car.color);

        System.out.println("---------------------------------");

        // Пример объявления объекта без явного присваивания (должны подставиться значения по 
умолчанию)
        System.out.println("EXAMPLE #2");

        House house = new House();
        System.out.println("House object. Address: " + house.address);
        System.out.println("House object. Count rooms: " + house.countRooms);

        System.out.println("---------------------------------");

        // Пример вызова метода класса
        System.out.println("EXAMPLE #3");

        Car codemikaCar = new Car();
        codemikaCar.brand = "Codemika";
        codemikaCar.color = "Purple";
        codemikaCar.price = 10000000;
        codemikaCar.power = 10000000;
        codemikaCar.weight = 10;

        codemikaCar.getInfo();

        System.out.println("---------------------------------");

        // Пример объявления объекта с конструктором
        System.out.println("EXAMPLE #4");
        Car carConstructor = new Car("Volvo", "Blue", 1000, 100, 1);
        carConstructor.getInfo();
    }
}
