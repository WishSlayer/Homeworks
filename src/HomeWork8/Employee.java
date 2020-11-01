package HomeWork8;
// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;
    private String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"};
    private String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"};

    // TODO: конструктор, геттеры и сеттеры
    public Employee() {
        setName();
        setCompany();
        setSalary();
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = names[(int) (Math.random() * names.length)];
    }

    public String getCompany() {
        return company;
    }

    public void setCompany() {
        this.company = companies[(int) (Math.random() * companies.length)];
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = 10000 + (int) (Math.random() * ((100000 - 10000) + 1));
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = 21 + (int) (Math.random() * ((60 - 21) + 1));
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee()); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }
}