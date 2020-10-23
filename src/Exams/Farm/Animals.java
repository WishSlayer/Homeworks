package Exams.Farm;

public abstract class Animals {
    protected final String name;
    protected final int weight;
    protected final int speed;

    public Animals(String name, int weight, int speed) {
        if (name == null || name.trim().length() < 3)
            throw new IllegalArgumentException("Имя животного не может быть null или короче 3-ех символов!");
        if (weight <= 2 || weight >= 100)
            throw new IllegalArgumentException("Вес животного не может быть <= 2 и >= 100 кг!");
        if (speed <= 15 || speed >= 30)
            throw new IllegalArgumentException("Скорость животного не может <= 15 или >= 30 км/ч!");
        this.name = name;
        this.weight = weight;
        this.speed = speed;
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

}
