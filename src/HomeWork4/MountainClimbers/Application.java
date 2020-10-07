package HomeWork4.MountainClimbers;
/*
Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.
Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
Группа для восхождения на гору создаётся со следующими характеристиками:
идёт набор в группу или нет;
массив альпинистов;
гора;
должна быть возможность добавить альпиниста в группу, если набор ещё идёт
В методе main (отдельного класса) создать:
3 группы для восхождений на 3 различных горы.
В первой группе 3 альпиниста (набор закрыт)
Во второй и третьей группах по 2 альпиниста (набор в эти группы закрыт)
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */

public class Application {
    public static void main(String[] args) {
        Climber climberIvan = new Climber("Иван", "Москва");
        Climber climberDmitriy = new Climber("Дмитрий", "Санкт-Петербург");
        Climber climberKsenya = new Climber("Ксения", "Рязань");
        Climber climberAnna = new Climber("Анна", "Новгород");
        Climber climberDarya = new Climber("Дарья", "Псков");
        Climber climberVladimir = new Climber("Владимир", "Тагил");
        Climber climberPetr = new Climber("Петр", "Москва");

        Mountain mountainTibet = new Mountain("Тибет", "Россия", 110);
        Mountain mountainAlpi = new Mountain("Альпы", "Франция", 120);
        Mountain mountainTahtali = new Mountain("Тахталы", "Турция", 200);

        System.out.println("Объявлен набор в группу для восхождения на "
                + mountainTibet.getName()
                + ", максимальное количество человек: 3");
        Group groupTibet = new Group( 3, mountainTibet);
        groupTibet.addClimber(climberIvan);
        groupTibet.addClimber(climberDmitriy);
        groupTibet.addClimber(climberKsenya);
        System.out.println(groupTibet);
        System.out.println(groupTibet.climbersToString());

        System.out.println("Объявлен набор в группу для восхождения на "
                + mountainAlpi.getName()
                + ", максимальное количество человек: 2");
        Group groupAlpi = new Group( 2, mountainAlpi);
        groupAlpi.addClimber(climberAnna);
        groupAlpi.addClimber(climberDarya);
        System.out.println(groupAlpi);

        System.out.println("Объявлен набор в группу для восхождения на "
                + mountainTahtali.getName()
                + ", максимальное количество человек 2");
        Group groupTahtali = new Group( 2, mountainTahtali);
        groupTahtali.addClimber(climberVladimir);
        groupTahtali.addClimber(climberPetr);
        System.out.println(groupTahtali);

    }
}
