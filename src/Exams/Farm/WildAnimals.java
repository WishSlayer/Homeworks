package Exams.Farm;

public class WildAnimals extends Animals implements WildAnimalsAble {
    private int strength;
    private final int minStrength = 2;
    private final int maxStrength = 30;

    public WildAnimals(String name) {
        super(name);
        this.strength = strength;
    }

    public void setStrength() {
        this.strength = minStrength + (int) (Math.random() * ((maxStrength - minStrength) + 1));
    }

    @Override
    public int attackAnimal() {
        return 0;
    }
}
