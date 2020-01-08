package interfaces;

public class Main {
    public static void main(String[] args) {
    Monkey monkey= new Monkey("Monkey", 13, 20.23);
    Bear bear = new Bear("Bear", 5, 47.5);
    monkey.climb();
    bear.climb();
    monkey.sit();
    monkey.eatFruits();
    }
}
