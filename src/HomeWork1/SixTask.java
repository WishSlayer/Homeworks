package HomeWork1;
/*
Программа загадывает число в диапазоне [1;9]
Пользователь вводит число с клавиатуры
Программа в зависимости от введенного числа выводит в консоль следующее:
"загаданное число больше"
"загаданное число меньше"
"Вы угадали" (программа завершает работу)
если введен 0, выводит "выход из программы" (программа завершает работу)
 */
import java.util.Scanner;

public class SixTask {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 9;
        int num = minValue + (int) ((Math.random() * (maxValue - minValue)) + 1);
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я загадал число в диапазоне от 1 до 9 включительно, попробуй угадать его!");
        int num2 = 1;
        while (num2 != 0) {
            System.out.println("Введите ваше число: ");
            num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("Выход из программы!");
                break;
            }
            else if (num2 > num) System.out.println("Загаданное число меньше " + num2);
            else if (num2 < num) System.out.println("Загаданное число больше " + num2);
            else {
                System.out.println("Вы угадали загаданное число! Это число: " + num2 + ". Поздравляю!");
                break;
            }
        }
    }
}
