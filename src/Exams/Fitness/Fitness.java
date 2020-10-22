package Exams.Fitness;

public final class Fitness {
    private final Abonement[] waterPoolClients = new Abonement[20];
    private final Abonement[] gymClients = new Abonement[20];
    private final Abonement[] groupSportClients = new Abonement[20];

    public void closeFitness() {
        for (Abonement waterPoolClient : waterPoolClients) {
            if (waterPoolClient != null)
                stopTraining(waterPoolClient);
        }
        for (Abonement gymClient : gymClients) {
            if (gymClient != null)
                stopTraining(gymClient);
        }
        for (Abonement groupSportClient : groupSportClients) {
            if (groupSportClient != null)
                stopTraining(groupSportClient);
        }
        System.out.println("Фитнес клуб закрылся! Все посетители покинули его!");
    }

    public void stopTraining(Abonement abonement) {
        if (abonement.getCurrentZone() != null) {
            switch (abonement.getCurrentZone()) {
                case GYM: {
                    for (int i = 0; i < gymClients.length; i++) {
                        if (abonement == gymClients[i]) {
                            gymClients[i] = null;
                            abonement.setCurrentZone(null);
                            break;
                        }
                    }
                }
                case GROUP_SPORT: {
                    for (int i = 0; i < groupSportClients.length; i++) {
                        if (abonement == groupSportClients[i]) {
                            groupSportClients[i] = null;
                            abonement.setCurrentZone(null);
                            break;
                        }
                    }
                }
                case WATERPOOL: {
                    for (int i = 0; i < waterPoolClients.length; i++) {
                        if (abonement == waterPoolClients[i]) {
                            waterPoolClients[i] = null;
                            abonement.setCurrentZone(null);
                            break;
                        }
                    }
                }
            }
        } else System.out.println(abonement.getAbonementInfo() + " в настоящее время не зарегистрирован в какой-либо зоне");
    }

    public void addAbonement(Abonement abonement, Zones zone) {
        if (abonement == null)
            throw new IllegalArgumentException("Нельзя зарегистрировать абонемент равный null!");

        if (checkAbonementZone(abonement, zone) && checkAbonementDateTime(abonement)) {
            if (abonement.getCurrentZone() == null) {
                switch (zone) {
                    case GYM: {
                        for (int i = 0; i < this.gymClients.length; i++) {
                            if (this.gymClients[i] == null) {
                                this.gymClients[i] = abonement;
                                abonement.setCurrentZone(Zones.GYM);
                                break;
                            }
                            if (i == this.gymClients.length - 1)
                                System.out.println("Зона " + zone + " заполнена!");
                        }
                        break;
                    }
                    case GROUP_SPORT: {
                        for (int i = 0; i < this.groupSportClients.length; i++) {
                            if (this.groupSportClients[i] == null) {
                                this.groupSportClients[i] = abonement;
                                abonement.setCurrentZone(Zones.GROUP_SPORT);
                                break;
                            }
                            if (i == this.groupSportClients.length - 1)
                                System.out.println("Зона " + zone + " заполнена!");
                        }
                        break;
                    }
                    case WATERPOOL: {
                        for (int i = 0; i < this.waterPoolClients.length; i++) {
                            if (this.waterPoolClients[i] == null) {
                                this.waterPoolClients[i] = abonement;
                                abonement.setCurrentZone(Zones.WATERPOOL);
                                break;
                            }
                            if (i == this.waterPoolClients.length - 1)
                                System.out.println("Зона " + zone + " заполнена!");
                        }
                        break;
                    }
                }
                System.out.println(abonement.getAbonementInfo() + " зарегистрирован в зоне: "
                        + abonement.getCurrentZone() + " "
                        + Const.startTime);
            }
            else System.out.println(abonement.getAbonementInfo() + " в настоящее время зарегистрирован в зоне "
                    + abonement.getCurrentZone() + ". Невозможно зарегистрировать абонемент в двух зонах одновременно!!!" );
        }
    }

    private boolean checkAbonementZone(Abonement abonement, Zones zone) {
        for (int i = 0; i < abonement.getAllowedZones().length; i++) {
            if (zone.equals(abonement.getAllowedZones()[i])) {
                return true;
            }
        }
        System.out.println(abonement.getAbonementInfo() + " - нет доступа в данную зону!");
        return false;
    }

    private boolean checkAbonementDateTime(Abonement abonement) {
        if (Const.startDate.isBefore(abonement.finishDate) || Const.startDate.isEqual(abonement.finishDate)) {
            if (Const.startTime.isAfter(abonement.startTraining) && Const.startTime.isBefore(abonement.finishTraining))
                return true;
            else {
                System.out.println(abonement.getAbonementInfo() + " - доступ запрещен, так как время посещения не соответствует");
                return false;
            }
        }
        else {
            System.out.println(abonement.getAbonementInfo() + " - доступ запрещен, так как срок действия абонемента закончился!");
            return false;
        }
    }

    public void getInfoGym() {
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время в тренажерном зале зарегистрированы: \n");
        for (Abonement gymClient : gymClients) {
            if (gymClient != null)
                sb.append(gymClient.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getInfoWaterPool() {
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время в бассейне зарегистрированы: \n");
        for (Abonement waterPoolClient : waterPoolClients) {
            if (waterPoolClient != null)
                sb.append(waterPoolClient.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getInfoGroupSport() {
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время на групповых занятиях зарегистрированы: \n");
        for (Abonement groupSportClient : groupSportClients) {
            if (groupSportClient != null)
                sb.append(groupSportClient.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getFullInfo() {
        System.out.println("Информация о посетителях фитнес клуба: ");
        getInfoGym();
        getInfoWaterPool();
        getInfoGroupSport();
    }

}
