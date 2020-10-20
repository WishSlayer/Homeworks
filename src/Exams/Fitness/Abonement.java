package Exams.Fitness;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Abonement {
    private LocalDate finishDate;
    private String abonementType;
    private Client client;

    public Abonement(Client client, String finishDate,
                     String abonementType) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        if (LocalDate.parse(finishDate, formatter).isBefore(Const.startDate)
                || LocalDate.parse(finishDate, formatter).isEqual(Const.startDate))
            throw new IllegalArgumentException(
                    "Дата окончания абонемента не может быть раньше или такой же как дата регистрации!"
            );
        this.finishDate = LocalDate.parse(finishDate, formatter);
        this.abonementType = abonementType;
    }
}
