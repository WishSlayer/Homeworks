package HomeWork3;
/*
Написать функцию, которая проверяет, является ли строка палиндромом.
Палиндром — это число, буквосочетание, слово или текст,
которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
 */
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(string1);
        String string2 = sb.reverse().toString().replaceAll(" ", "");
        if (string1.replaceAll(" ", "").equalsIgnoreCase(string2)) {
            System.out.println("Строка является палиндромом!");
        }
        else System.out.println("Строка не является палиндромом!");
    }
}
