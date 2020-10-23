package Exams.Farm;

public class WildAnimals extends Animals implements WildAnimalsAble {
    private final int strength;

    public WildAnimals(String name, int weight, int speed, int strength) {
        super(name, weight, speed);
        if (strength <= 0 || strength >= 30)
            throw new IllegalArgumentException("Сила животного не может <= 0 или >= 30 Н!");
        this.strength = strength;
    }

    @Override
    public int attackAnimal() {
        return 0;
    }
}
