package Exams.Fitness;

import java.time.LocalDate;

public final class Client {
    private final String name;
    private final String surname;
    private final LocalDate birthday;

    public Client(String name, String surname, String bornYear) {
        if (name == null || name.trim().length() < 3)
            throw new IllegalArgumentException("Имя не может быть null или короче 3 символов!");
        if (surname == null || surname.trim().length() < 3)
            throw new IllegalArgumentException("Фамилия не может быть null или короче 3 символов!");
        this.name = name;
        this.surname = surname;
        this.birthday = LocalDate.parse(bornYear, Const.formatter);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getClientInfo() {
        return getName() + " " + getSurname();
    }
}
