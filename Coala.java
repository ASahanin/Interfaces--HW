package interfaces;

public class Coala extends Animal implements Climable{

        public Coala(String name, int age, double weight) {
            super(name, age, weight);
        }

    private Climable climable;

        @Override
        public void climb() {
            System.out.println("Coala can climb too!");
        }

    public Climable getClimable() {
        return climable;
    }

    public void setClimable(Climable climable) {
        this.climable = climable;
    }
}
