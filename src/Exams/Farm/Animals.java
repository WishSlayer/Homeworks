package Exams.Farm;

public abstract class Animals {
    protected final String name;
    protected int weight;
    protected int speed;
    protected final int minWeight = 3;
    protected final int maxWeight = 30;
    protected final int minSpeed = 15;
    protected final int maxSpeed = 30;

    public Animals(String name) {
        if (name == null || name.trim().length() < 3)
            throw new IllegalArgumentException("Имя животного не может быть null или короче 3-ех символов!");
        this.name = name;
        setWeight();
        setSpeed();
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setWeight() {
        this.weight = minWeight + (int) (Math.random() * ((maxWeight - minWeight) + 1));
    }

    public void setSpeed() {
        this.speed = minSpeed + (int) (Math.random() * ((maxSpeed - minSpeed) + 1));
    }
}
