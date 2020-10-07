package HomeWork4.MountainClimbers;

import java.util.Arrays;

// класс Группа
public class Group {
    private boolean isFree; // идет ли набор в группу?
    private Climber[] climbers; // массив альпинистов
    private Mountain mountain; // название горы

    // конструктор
    public Group(int maxNumber, Mountain mountain) {
        this.isFree = true;
        this.mountain = mountain;
        this.climbers = new Climber[maxNumber];
    }

    // метод для закрытия группы
    public void closeGroup() {
        isFree = false;
        System.out.println("Прием в группу восхождения на гору " + mountain.getName() + " приостановлен!");
    }

    // метод для добавления человека в группу
    public void addClimber(Climber climber) {
        if (isFree && climber != null){
            for (int i = 0; i < climbers.length; i++) {
                if (climbers[i] == null) {
                    climbers[i] = climber;
                    System.out.println(climber.getName()
                            + " присоединился к группе для восхождения на гору "
                            + mountain.getName());
                    break;
                }
            }
            if (climbers[climbers.length - 1] != null) {
                closeGroup();
            }
        }
        else System.out.println("Прием в группу закрыт!");
    }

    // список группы
    public String climbersToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список группы для восхождерния на " + this.mountain.getName() + ": \n");
        for (Climber climber : climbers) {
            if (climber != null)
                sb.append(climber).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Group{" +
                "isFree=" + isFree +
                ", climbers=" + Arrays.toString(climbers) +
                ", mountain=" + mountain +
                '}';
    }
}
