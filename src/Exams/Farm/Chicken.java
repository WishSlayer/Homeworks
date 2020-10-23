package Exams.Farm;

public final class Chicken extends HomeAnimals {
    private final boolean canBeEaten = true;

    public Chicken(String name, int weight, int speed, int health, int resourceCount) {
        super(name, weight, speed, health, resourceCount);
    }
}
