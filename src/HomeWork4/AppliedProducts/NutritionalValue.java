package HomeWork4.AppliedProducts;

// Класс пищевая ценность
public class NutritionalValue {
    private String name;
    private int belki;
    private int jiri;
    private int yglevodi;
    private int calories;

    // конструктор
    public NutritionalValue(String name, int belki) {
        setName(name);
        setBelki(belki);
    }

    public NutritionalValue(String name, int belki, int jiri) {
        setName(name);
        setBelki(belki);
        setJiri(jiri);
    }

    public NutritionalValue(String name, int belki, int jiri, int yglevodi) {
        setName(name);
        setBelki(belki);
        setJiri(jiri);
        setYglevodi(yglevodi);
    }

    public NutritionalValue(String name, int belki, int jiri, int yglevodi, int calories) {
        setName(name);
        setBelki(belki);
        setJiri(jiri);
        setYglevodi(yglevodi);
        setCalories(calories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 4)
            throw new IllegalArgumentException("Неправильное имя продукта! (не должно быть меньше 4 символов)");
        this.name = name;
    }

    public int getBelki() {
        return belki;
    }

    public void setBelki(int belki) {
        if (belki < 0)
            throw new IllegalArgumentException("Неправильное количество белков!");
        this.belki = belki;
    }

    public int getJiri() {
        return jiri;
    }

    public void setJiri(int jiri) {
        if (jiri < 0)
            throw new IllegalArgumentException("Неправильное количество жиров!");
        this.jiri = jiri;
    }

    public int getYglevodi() {
        return yglevodi;
    }

    public void setYglevodi(int yglevodi) {
        if (yglevodi < 0)
            throw new IllegalArgumentException("Неправильное количество углеводов!");
        this.yglevodi = yglevodi;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 0)
            throw new IllegalArgumentException("Неправильное количество калорий!");
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "NutritionalValue{" +
                "name='" + name + '\'' +
                ", belki=" + belki +
                ", jiri=" + jiri +
                ", yglevodi=" + yglevodi +
                ", calories=" + calories +
                '}';
    }
}
