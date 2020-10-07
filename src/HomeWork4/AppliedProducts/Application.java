package HomeWork4.AppliedProducts;

import java.util.Scanner;

/*
Список разрешенных продуктов
Класс Пищевая Ценность
Свойства: имя продукта / белки / жиры / углеводы / калории
Минимум 4 конструктора
Реализовать необходимые проверки входящих данных
Создать не менее 4 экземпляров данного класса (объектов)
Класс Мои Продукты
Свойства: разрешенное количество белков / жиров / углеводов / калорий / список разрешенных продуктов (массив)
Реализовать метод, который принимает на вход название продукта и добавляет его в список разрешенных,
если характеристики продукта полностью соответствуют заявленным разрешениям,
в противном случае сообщить, по какой причине продукт не может быть добавлен в список
Реализовать метод, который показывает список разрешенных продуктов
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимально разрешенное количество белков: ");
        int maxBelki = scanner.nextInt();
        System.out.println("Введите максимально разрешенное количество жиров: ");
        int maxJiri = scanner.nextInt();
        System.out.println("Введите максимально разрешенное количество углеводов: ");
        int maxYglevodi = scanner.nextInt();
        System.out.println( "Введите максимально разрешенное количество калорий: ");
        int maxCalories = scanner.nextInt();
        System.out.println("Введите максимальное количество продуктов в списке: ");
        int maxCount = scanner.nextInt();

        MyProducts myProducts = new MyProducts(maxBelki, maxJiri, maxYglevodi, maxCalories, maxCount);

        NutritionalValue apple = new NutritionalValue("яблоко", 5, 2, 0, 100);
        NutritionalValue meat = new NutritionalValue("свинина", 2, 3, 8, 400);
        NutritionalValue bread = new NutritionalValue("хлеб", 1, 1, 1, 120);
        NutritionalValue sweets = new NutritionalValue("конфеты", 0, 0, 1, 600);
        NutritionalValue carrot = new NutritionalValue("морковь", 1, 2, 3, 50);

        myProducts.addProduct(apple);
        myProducts.addProduct(meat);
        myProducts.addProduct(bread);
        myProducts.addProduct(sweets);
        myProducts.addProduct(carrot);

        myProducts.showProducts();
    }
}
