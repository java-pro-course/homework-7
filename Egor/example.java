class Human {
    String floor;
    String name;
    int height;
    String eyes;
    String hair;

    public void getInfo() {
        System.out.println("Object Human. floor: " + floor);
        System.out.println("Object Human. name: " + name);
        System.out.println("Object Human. height: " + height);
        System.out.println("Object Human. eyes: " + eyes);
        System.out.println("Object Human. hair: " + hair);
    }
}



public class Main {
    public static void main(String[] args) {
        
        System.out.println("Object #1");
        Human Egor = new Human(); 
        Egor.floor = "male"; 
        Egor.name = "Egor";
        Egor.height = 163;
        Egor.eyes = "Brown";
        Egor.hair = "Black";
        Egor.getInfo();
    }
}


