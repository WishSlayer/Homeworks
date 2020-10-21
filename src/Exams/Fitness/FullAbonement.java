package Exams.Fitness;

import java.time.LocalTime;

public final class FullAbonement extends Abonement {
    public FullAbonement(Client client) {
        super(client);
        this.finishDate = this.startDate.plusMonths(6);
        this.finishTraining = LocalTime.of(22, 0);
        this.allowedZones = new Zones[] {Zones.GYM, Zones.WATERPOOL, Zones.GROUP_SPORT};
    }
}
