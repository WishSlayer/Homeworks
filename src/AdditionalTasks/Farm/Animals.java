package AdditionalTasks.Farm;

abstract public class Animals {
    protected String name;
    protected int weight;
    protected int speed;

    public Animals(String name, int weight, int speed) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.length() < 3)
            throw new IllegalArgumentException("Имя не может быть null и короче 3 символов!");
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0)
            throw new IllegalArgumentException("Вес не модет быть");
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
