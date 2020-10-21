package Exams.Fitness;

import java.time.LocalTime;

public final class OnceAbonement extends Abonement {
    public OnceAbonement(Client client) {
        super(client);
        this.finishDate = this.startDate.plusDays(1);
        this.finishTraining = LocalTime.of(22, 0);
        this.allowedZones = new Zones[] {Zones.WATERPOOL, Zones.GYM};
    }
}
