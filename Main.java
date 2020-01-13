package interfaces;

public class Main {
    public static void main(String[] args) {
        Eatable banana = new Banana();
        Eatable apple = new Apple();

    Monkey monkey= new Monkey("Monkey", 13, 20.23);
    Climable coala = new Coala("Bear", 5, 47.5);
    monkey.climb();
    coala.climb();

    monkey.setClimable(coala);
    monkey.eat(banana);
    monkey.eat(apple);

    }
}
