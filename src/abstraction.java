abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}