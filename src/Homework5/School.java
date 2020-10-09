package Homework5;

public class School {
    private final String name;
    private final Director director;
    private Student[] students;
    private Teacher[] teachers;

    public School(String name, Director director) {
        if (name == null || name.trim().length() < 3 || director == null)
            throw new IllegalArgumentException("Название школы не может быть null и быть меньшее 3 символов! " +
                    "И школа не может функционировать без директора!");
        this.name = name;
        this.director = director;
        System.out.println("Создана " + name + " с директором " + director.getName());
    }

    public School(String name, Director director, Student[] students, Teacher[] teachers) {
        if (name == null || name.trim().length() < 3 || director == null)
            throw new IllegalArgumentException("Название школы не может быть null и быть меньшее 3 символов! " +
                    "И школа не может функционировать без директора!");
        this.name = name;
        this.director = director;
        this.students = students;
        this.teachers = teachers;
        System.out.println("Создана " + name + " с директором " + director.getName());
    }

    public void schoolDay() {
        director.startLessons();
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < teachers.length; j++) {
                if (students[i].studyingSubject == teachers[j].taughtSubject) {
                    teachers[j].teach(students[i]);
                }
            }
        }
        director.stopLessons();
    }
}
