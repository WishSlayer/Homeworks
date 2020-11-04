package HomeWork8.compare;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {

        // сортировать по значениям свойств: price, color, brand
        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(blackOpel);
        carArrayList.add(redOpel);
        carArrayList.add(yellowMazda);
        carArrayList.add(greenMazda);

        System.out.println("Изначальный ArrayList:");
        System.out.println(carArrayList.toString());

        Comparator<Car> priceColorBrandComparator = new PriceComparator()
                .thenComparing(new ColorComparator())
                .thenComparing(new BrandComparator());
        carArrayList.sort(priceColorBrandComparator);

        System.out.println("Отсортированный ArrayList:");
        System.out.println(carArrayList.toString());
    }
}