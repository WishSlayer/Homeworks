package HomeWork3;
/*
Найти количество вхождений одной строки в другую.
Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
 */

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        int num = string2.split(string1).length - 1;
        System.out.println("Слово \"" + string1 + "\" встречается " + num + " раз");
    }
}
