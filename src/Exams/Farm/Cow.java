package Exams.Farm;

public final class Cow extends HomeAnimals {
    private final boolean canBeEaten = true;

    public Cow(String name, int weight, int speed, int health, int resourceCount) {
        super(name, weight, speed, health, resourceCount);
    }
}
