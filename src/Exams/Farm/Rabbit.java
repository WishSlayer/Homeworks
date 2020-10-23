package Exams.Farm;

public final class Rabbit extends HomeAnimals {
    private final boolean canBeEaten = true;

    public Rabbit(String name) {
        super(name);
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }
}
