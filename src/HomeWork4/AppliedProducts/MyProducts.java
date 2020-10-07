package HomeWork4.AppliedProducts;

import HomeWork4.MountainClimbers.Climber;

import java.util.Arrays;

// класс мои продукты
public class MyProducts {
    private int maxBelki;
    private int maxJiri;
    private int maxYglevodi;
    private int maxCalories;
    private NutritionalValue[] myProducts;

    public MyProducts(int maxBelki, int maxJiri, int maxYglevodi, int maxCalories, int productsCount) {
        setMaxBelki(maxBelki);
        setMaxJiri(maxJiri);
        setMaxYglevodi(maxYglevodi);
        setMaxCalories(maxCalories);
        myProducts = new NutritionalValue[productsCount];
    }

    public int getMaxBelki() {
        return maxBelki;
    }

    public void setMaxBelki(int maxBelki) {
        this.maxBelki = maxBelki;
    }

    public int getMaxJiri() {
        return maxJiri;
    }

    public void setMaxJiri(int maxJiri) {
        this.maxJiri = maxJiri;
    }

    public int getMaxYglevodi() {
        return maxYglevodi;
    }

    public void setMaxYglevodi(int maxYglevodi) {
        this.maxYglevodi = maxYglevodi;
    }

    public int getMaxCalories() {
        return maxCalories;
    }

    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public void addProduct(NutritionalValue newProduct) {
        if (newProduct != null) {
            if (newProduct.getBelki() <= maxBelki
                    && newProduct.getJiri() <= maxJiri
                    && newProduct.getYglevodi() <= maxYglevodi
                    && newProduct.getCalories() <= maxCalories) {
                for (int i = 0; i < myProducts.length; i++) {
                    if (myProducts[i] == null) {
                        myProducts[i] = newProduct;
                        System.out.println("В список добавлен продукт: " + newProduct.getName());
                        return;
                    }
                }
            }
            else if (newProduct.getBelki( ) > maxBelki)
                System.out.println("Добавление " + newProduct.getName() + " невозможно, превышено максимально допустимое количество белка");
            else if (newProduct.getJiri( ) > maxJiri)
                System.out.println("Добавление " + newProduct.getName() + " невозможно, превышено максимально допустимое количество жиров");
            else if (newProduct.getYglevodi( ) > maxYglevodi)
                System.out.println("Добавление " + newProduct.getName() + " невозможно, превышено максимально допустимое количество углеводов");
            else if (newProduct.getCalories( ) > maxCalories)
                System.out.println("Добавление " + newProduct.getName() + " невозможно, превышено максимально допустимое количество калорий");
        } else throw new IllegalArgumentException("Недопустимый продукт (равен null)");
    }

    public String showProducts() { // Посмотрите пожалуйста, не выводит значения в Application
        StringBuilder sb = new StringBuilder();
        sb.append("Список разрешенных продуктов: \n");
        for (NutritionalValue nutritionalValue : myProducts) {
            if (nutritionalValue != null)
                sb.append(nutritionalValue).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "MyProducts{" +
                "maxBelki=" + maxBelki +
                ", maxJiri=" + maxJiri +
                ", maxYglevodi=" + maxYglevodi +
                ", maxCalories=" + maxCalories +
                ", myProducts=" + Arrays.toString(myProducts) +
                '}';
    }
}
