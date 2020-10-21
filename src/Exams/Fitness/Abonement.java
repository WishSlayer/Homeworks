package Exams.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Abonement {
    protected LocalDate finishDate;
    protected LocalDate startDate = Const.startDate;
    protected LocalTime finishTraining;
    protected LocalTime startTraining = Const.startTraining;
    protected Zones currentZone;
    protected Zones[] allowedZones;
    private final Client client;

    public Abonement(Client client) {
        if (client == null)
            throw new IllegalArgumentException("Клиент не может быть null");
        this.client = client;
    }

    public Zones getCurrentZone() {
        return currentZone;
    }

    public String getAbonementInfo(){
        return "Абонемент клиента " + this.client.getClientInfo();
    }

    public void setCurrentZone(Zones currentZone) {
        this.currentZone = currentZone;
    }

    public Zones[] getAllowedZones() {
        return allowedZones;
    }

}
