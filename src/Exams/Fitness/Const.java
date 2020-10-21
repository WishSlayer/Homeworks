package Exams.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class Const {
    public static final String waterpool = "Бассейн";
    public static final String gym = "Тренажерный зал";
    public static final String groupSport = "Групповые занятия";
    public static final String onceAbonement = "Разовый";
    public static final String daylyAbonement = "Дневной";
    public static final String fullAbonement = "Полный";
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy в HH:mm");
    public static LocalDate startDate = LocalDate.now();
    public static LocalTime startTime = LocalTime.now();
    public static LocalTime startTraining = LocalTime.of(8,0);
}
