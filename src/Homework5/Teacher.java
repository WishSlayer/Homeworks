package Homework5;

public class Teacher extends Human implements TeachAble {
    private String taughtSubject;

    public Teacher(String name, int age, String taughtSubject) {
        super(name, age);
        setTaughtSubject(taughtSubject);
    }

    public String getTaughtSubject() {
        return taughtSubject;
    }

    public void setTaughtSubject(String taughtSubject) {
        if (taughtSubject == null || taughtSubject.trim().length() < 3)
            throw new IllegalArgumentException("Преподаваемый предмет не может быть null и короче 3 символов!");
        this.taughtSubject = taughtSubject;
    }

    @Override
    public void teach(Student student) {
        student.study();
        System.out.println("Учитель " + this.name
                + " обучил студента " + student.name
                + " предмету " + taughtSubject
                + " и повысил уровень знаний студента до " + student.getLevel());
    }
}
