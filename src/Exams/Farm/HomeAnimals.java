package Exams.Farm;

public abstract class HomeAnimals extends Animals implements HomeAnimalsAble {
    protected int health;
    protected int resourceCount;
    protected final int minHealth = 1;
    protected final int maxHealth = 100;
    protected final int minResourceCount = 1;
    protected final int maxResourceCount = 20;

    public HomeAnimals(String name) {
        super(name);
        setHealth();
        setResourceCount();
    }

    public int getHealth() {
        return health;
    }

    public int getResourceCount() {
        return resourceCount;
    }

    public void setHealth() {
        this.health = minHealth + (int) (Math.random() * ((maxHealth - minHealth) + 1));
    }

    public void setResourceCount() {
        this.resourceCount = minResourceCount + (int) (Math.random() * ((maxResourceCount - minResourceCount) + 1));
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
