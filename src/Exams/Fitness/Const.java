package Exams.Fitness;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public final class Const {
    public static final String waterpool = "Бассейн";
    public static final String gym = "Тренажерный зал";
    public static final String group = "Групповые занятия";
    public static final String onceTimeAbonement = "Разовый";
    public static final String dayTimeAbonement = "Дневной";
    public static final String freeTimeAbonement = "Полный";
    public static int passID = 1;
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy в HH:mm");
    public static LocalDate startDate = LocalDate.of(2020, Month.OCTOBER, 14);
}
