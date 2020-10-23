package Exams.Farm;

public final class Cat extends HomeAnimals {
    private final boolean canBeEaten = false;

    public Cat(String name) {
        super(name);
        this.resourceCount = 0;
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }
}
