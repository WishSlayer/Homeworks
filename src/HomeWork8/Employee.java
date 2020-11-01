package HomeWork8;
// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Employee> employeeList = employeeGenerator(4);
        System.out.println(employeeList.toString());

        System.out.println("Отсортированный по имени: ");
        Comparator<Employee> employeeNameComparator = new NameComparator();
        employeeList.sort(employeeNameComparator);
        System.out.println(employeeList);

        System.out.println("Отсортированный по имени и зарплате: ");
        Comparator<Employee> employeeNameSalaryComparator = new NameComparator()
                .thenComparing(new SalaryComparator());
        employeeList.sort(employeeNameSalaryComparator);
        System.out.println(employeeList);

        System.out.println("Отсортированный по имени, зарплате, возрасту и компании: ");
        Comparator<Employee> employeeNameSalaryAgeCompanyComparator = new NameComparator()
                .thenComparing(new SalaryComparator())
                .thenComparing(new AgeComparator())
                .thenComparing(new CompanyComparator());
        employeeList.sort(employeeNameSalaryAgeCompanyComparator);
        System.out.println(employeeList);
    }

    private final String name;
    private final String company;
    private final int salary;
    private final int age;

    // TODO: конструктор, геттеры и сеттеры
    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + ", Компания: " + getCompany()
                + ", Возраст: " + getAge()
                + ", Зарплата: " + getSalary();
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[(int) (Math.random() * names.length)],
                    companies[(int) (Math.random() * companies.length)],
                    10000 + (int) (Math.random() * ((100000 - 10000) + 1)),
                    21 + (int) (Math.random() * ((60 - 21) + 1))
                    )); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }

}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}