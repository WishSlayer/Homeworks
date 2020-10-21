package Exams.Fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public final class Fitness {
    private final Abonement[] waterpoolClients = new Abonement[20];
    private final Abonement[] gymClients = new Abonement[20];
    private final Abonement[] groupSportClients = new Abonement[20];

    public void closeFitness() {
        for (Abonement waterpoolClient : waterpoolClients) {
            if (waterpoolClient != null)
                stopTraining(waterpoolClient);
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
            System.out.println(abonement.getAbonementInfo() + " - закончена регистрация в зоне " + abonement.getCurrentZone());
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
                    for (int i = 0; i < waterpoolClients.length; i++) {
                        if (abonement == waterpoolClients[i]) {
                            waterpoolClients[i] = null;
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

        if (checkAbonementZone(abonement, zone) && checkAbonemetDate(abonement)) {
            if (abonement.getCurrentZone() == null) {
                switch (zone) {
                    case GYM : {
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
                        for (int i = 0; i < this.waterpoolClients.length; i++) {
                            if (this.waterpoolClients[i] == null) {
                                this.waterpoolClients[i] = abonement;
                                abonement.setCurrentZone(Zones.WATERPOOL);
                                break;
                            }
                            if (i == this.waterpoolClients.length - 1)
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

    private boolean checkAbonemetDate(Abonement abonement) {
        LocalDate currentDate = Const.startDate;
        LocalTime currentTime = Const.startTime;
        if (currentDate.isBefore(abonement.finishDate) || currentDate.isEqual(abonement.finishDate)) {
            if (currentTime.isAfter(abonement.startTraining) && currentTime.isBefore(abonement.finishTraining))
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

    public void getInfoGym(){
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время в тренажерном зале зарегистрированы: \n");
        for (Abonement abonement : gymClients) {
            if (abonement != null)
                sb.append(abonement.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getInfoWaterpool(){
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время в бассейне зарегистрированы: \n");
        for (Abonement abonement : waterpoolClients) {
            if (abonement != null)
                sb.append(abonement.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getInfoGroupSport(){
        StringBuilder sb = new StringBuilder();
        sb.append("В настоящее время на групповых занятиях зарегистрированы: \n");
        for (Abonement abonement : groupSportClients) {
            if (abonement != null)
                sb.append(abonement.getAbonementInfo()).append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getFullInfo(){
        System.out.println("Информация о посетителях фитнес клуба: ");
        getInfoGym();
        getInfoWaterpool();
        getInfoGroupSport();
    }

}
