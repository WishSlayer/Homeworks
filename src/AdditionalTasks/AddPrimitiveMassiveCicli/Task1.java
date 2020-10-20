package AdditionalTasks.AddPrimitiveMassiveCicli;
/*
В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите натуральное трехзначное число:");
            num = scanner.nextInt();
        } while (num < 100 || num > 1000);
        System.out.println(num);
    }
}
