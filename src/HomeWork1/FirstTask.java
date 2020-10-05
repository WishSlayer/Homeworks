package HomeWork1;
/*
Пользователь! загадывает число в диапазоне от [1 до 100],
программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
Программа может задавать пользователю вопросы:
Число равно X? / Число больше X? / Число меньше X? и в зависимоти от ответа пользователя принимать решения.
PS: вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
 */
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 100;
        int num;
        int answer;
        boolean win = false;
        System.out.println("Загадайте целое число в диапозоне от " + minValue + " до " + maxValue + " включительно.");
        Scanner scanner = new Scanner(System.in);
        while (!win) {
            num = (maxValue + minValue) / 2;
            System.out.println("Ваше число " + num + "?");
            answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Программа угадала ваше число!");
                win = true;
            }
            else if (answer == 0) {
                System.out.println("Ваше число меньше " + num + "?");
                answer = scanner.nextInt();
                if (answer == 1) {
                    maxValue = num;
                }
                else if (answer == 0) {
                    minValue = num;
                }
            }
            else System.out.println("Пожалуйста отвечайте на вопросы корректно. 1-Да, 0-Нет");
        }
    }
}
