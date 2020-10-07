package HomeWork4.MountainClimbers;

// класс Альпинист
public class Climber {
    private String name; // имя алпиниста
    private String address; // адрес альпиниста

    // конструктор
    public Climber(String name, String address) {
        setName(name);
        setAddress(address);
    }

    // геттер и сеттер для name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 3)
            throw new IllegalArgumentException("Имя альпиниста не может быть короче 3-ех символов!");
        this.name = name;
    }

    // геттер и сеттер для address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().length() < 5)
            throw new IllegalArgumentException("Адрес альпиниста не может быть короче 5 символов!");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
