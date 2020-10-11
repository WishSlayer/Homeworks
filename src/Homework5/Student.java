package Homework5;

public class Student extends Human implements StudyAble {
    private String studyingSubject;
    private int level;

    public Student(String name, int age, String studyingSubject) {
        super(name, age);
        setStudyingSubject(studyingSubject);
    }

    public String getStudyingSubject() {
        return studyingSubject;
    }

    public void setStudyingSubject(String studyingSubject) {
        if (studyingSubject == null || studyingSubject.trim().length() < 3)
            throw new IllegalArgumentException("Изучаемый предмет не может быть null и короче 3 символов!");
        this.studyingSubject = studyingSubject;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void study() {
        if (level < 100)
            level += 10;
    }
}
