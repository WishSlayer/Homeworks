package HomeWork6.Workers;

public class User {
    private final String fullName;
    private int salary;
    private Position position;

    public User(String fullName, String pos) {
        if (fullName == null || fullName.length() < 5)
            throw new IllegalArgumentException("Полное имя работника не может быть null и короче 5 символов!");
        this.fullName = fullName;
        setPosition(pos);
        setSalary();
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(String pos) {
        if (pos == null || pos.length() < 1)
            throw new IllegalArgumentException("Название должности не может быть null и не может быть короче 1 символа!");
        switch (pos) {
            case "д":
            case "Д":
                this.position = Position.DIRECTOR;
                break;
            case "м":
            case "М":
                this.position = Position.MANAGER;
                break;
            case "И":
            case "и":
                this.position = Position.ENGINEER;
        }
        return;
    }

    public void setSalary() {
        salary = (int) (Math.random() * 100000);
        this.salary = salary;
    }

}
