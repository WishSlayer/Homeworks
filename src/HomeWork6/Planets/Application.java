package HomeWork6.Planets;
/*
Задача: написать enum, который перечисляет планеты Солнечной системы
и возвращает массу планеты, ее радиус и радиус орбиты.
 */

public class Application {
    public static void main(String[] args) {
        Planets[] planets = Planets.values();

        for (Planets planet : planets) {
            System.out.println("Название планеты: " + planet.name()
                    + ". Масса планеты: " + planet.getPlanetWeight()
                    + ". Радиус планеты: " + planet.getPlanetRadius()
                    + ". Радиус орбиты: " + planet.getOrbitRadius());
        }
    }
}
