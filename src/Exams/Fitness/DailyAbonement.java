package Exams.Fitness;

import java.time.LocalTime;

public final class DailyAbonement extends Abonement {
    public DailyAbonement(Client client) {
        super(client);
        this.finishDate = this.startDate.plusMonths(6);
        this.finishTraining = LocalTime.of(16, 0);
        this.allowedZones = new Zones[] {Zones.GYM, Zones.GROUP_SPORT};
    }
}
