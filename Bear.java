package interfaces;

public class Bear extends Animal implements Climable{
    public Bear(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("I can climb!");
    }

}
