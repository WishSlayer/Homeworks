package HomeWork6.Workers;
/*
Дано:
enum должностей Position,
класс User со следующими полями: String fulName; int salary; Position position;
несколько массивов, в каждом массиве будут храниться объекты класса User с одинаковыми должностями
Пользователь вводит свои имя, фамилию и первую букву должности.
Ваша задача создать объект типа User и поместить его в соответствующий массив.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int numUsers = 5;
        User[] directors = new User[numUsers];
        User[] managers = new User[numUsers];
        User[] engineers = new User[numUsers];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String userLine = scanner.nextLine();

        String[] newString = userLine.split(" ");
        String fullName = newString[0] + " " + newString[1];
        String pos = newString[2];

        User user1 = new User(fullName, pos);
        directors[1] = user1;

        System.out.println(user1.getFullName() + " " + user1.getSalary() + " " + user1.getPosition());

        System.out.println(Arrays.toString(directors));
    }
}
