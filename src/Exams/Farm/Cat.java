package Exams.Farm;

public final class Cat extends HomeAnimals {
    private final boolean canBeEaten = false;

    public Cat(String name, int weight, int speed, int health, int resourceCount) {
        super(name, weight, speed, health, resourceCount);
        this.resourceCount = 0;
    }
}
