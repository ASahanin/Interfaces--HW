package interfaces;

public class Monkey extends Animal implements Climable, Sit, EatFruits{
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("I can climb!");
    }

    @Override
    public void sit() {
        System.out.println("I can sit on a back of an another animal!");
    }

    @Override
    public void eatFruits() {
        System.out.println("I can eat fruits!");
    }
}
