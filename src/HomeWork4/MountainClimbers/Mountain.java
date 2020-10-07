package HomeWork4.MountainClimbers;

// класс Гора
public class Mountain {
    private String name; // название горы
    private String country; // страна расположения горы
    private int height; // высота горы

    // конструктор
    public Mountain(String name, String country, int height) {
        setName(name);
        setCountry(country);
        setHeight(height);
    }

    // методы геттер и сеттер для имени горы
    public String getName() {
        return name;
    }

    public void setName(String name) { // проверка условия - название горы не может быть меньше 4-ех символов
        if (name == null || name.trim().length() < 4)
            throw new IllegalArgumentException("Длина названия горы не может быть меньше 4-ех символов!");
        this.name = name;
    }

    // методы геттер и сеттер для страны в которой расположена гора
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) { // проверка условия - название страны не может быть меньше 4-ех символов
        if (country == null || country.trim().length() < 4)
            throw new IllegalArgumentException("Длина названия страны не может быть меньше 4-ех символов!");
        this.country = country;
    }

    // методы геттер и сеттер для высоты горы
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) { // проверка условия - высота горы не может быть меньше 100 метров
        if (height < 100)
            throw new IllegalArgumentException("Высота горы не может быть меньше 100 метров!");
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
