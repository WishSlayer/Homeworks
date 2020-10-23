package Exams.Farm;

public final class Chicken extends HomeAnimals {
    private final boolean canBeEaten = true;

    public Chicken(String name) {
        super(name);
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }
}
