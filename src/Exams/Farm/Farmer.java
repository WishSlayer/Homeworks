package Exams.Farm;

public final class Farmer implements FarmerAble {
    private int resourceAmount = 5;

    @Override
    public int pickUpResource() {
        return 0;
    }

    @Override
    public boolean eatAnimal() {
        return true;
    }

    @Override
    public int feedAnimal() {
        return 0;
    }

    @Override
    public boolean chaseWildAnimal() {
        return false;
    }
}
