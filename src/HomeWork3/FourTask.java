package HomeWork3;
/*
Заменить все буквы в слове на строчные, а первую букву на заглавную
Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
 */

import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine();
        System.out.println("Отформатированное слово:");
        String newWord = word.toLowerCase();
        String lastWord = newWord.substring(0, 1).toUpperCase() + newWord.substring(1);
        System.out.println(lastWord);
    }
}
