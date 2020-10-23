package Exams.Farm;

public final class Cow extends HomeAnimals {
    private final boolean canBeEaten = true;

    public Cow(String name) {
        super(name);
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }
}
