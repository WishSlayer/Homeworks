package Exams.Farm;

public abstract class HomeAnimals extends Animals implements HomeAnimalsAble {
    protected int health;
    protected int resourceCount;

    public HomeAnimals(String name, int weight, int speed, int health, int resourceCount) {
        super(name, weight, speed);
        if (health <= 0 || health >= 200)
            throw new IllegalArgumentException("Здоровье животного не может <= 0 или >= 200 пунктов!");
        if (resourceCount <= 0 || resourceCount >= 50)
            throw new IllegalArgumentException("Количество ресурсов животного не может <= 0 или >= 50 пунктов!");
        this.health = health;
        this.resourceCount = resourceCount;
    }

    @Override
    public boolean run() {
        return false;
    }

    @Override
    public int plusHealth() {
        return 0;
    }
}
