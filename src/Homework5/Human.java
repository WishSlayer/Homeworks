package Homework5;

abstract public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 3)
            throw new IllegalArgumentException("Имя не может быть null и быть меньше 3 символов");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 6)
            throw new IllegalArgumentException("Возравст не может быть меньше 6 лет");
        this.age = age;
    }
}
