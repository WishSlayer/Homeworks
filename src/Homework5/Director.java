package Homework5;

final public class Director extends Human {
    private boolean isStarted;

    public Director(String name, int age) {
        super(name, age);
    }

    public void startLessons() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Директор " + this.name + " объявил о начале занятий! Учителя начинают обучение учеников!");
        }
        else System.out.println("Занятия уже идут!");
    }

    public void stopLessons() {
        if (isStarted) {
            isStarted = false;
            System.out.println("Директор " + this.name + " объявил об окончании занятий! Ученики получили знания!");
        }
        else System.out.println("Занятия еще не начались!");
    }
}
