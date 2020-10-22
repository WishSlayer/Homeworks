package Exams.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class Const {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static LocalDate startDate = LocalDate.now();
    public static LocalTime startTime = LocalTime.now();
    public static LocalTime startTraining = LocalTime.of(8,0);
}
