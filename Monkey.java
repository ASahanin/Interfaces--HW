package interfaces;

public class Monkey extends Animal implements Climable{
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }
    private Climable climable;

    @Override
    public void climb() {
        System.out.println("Monkey can climb.");
    }

    public void eat(Eatable eatable){
        System.out.println("I like eat " + eatable.getName() + ".");
    }

    public Climable getClimable() {
        return climable;
    }

    public void setClimable(Climable climable) {
        this.climable = climable;
    }
}
