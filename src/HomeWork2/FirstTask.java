package HomeWork2;
/*
Заполните массив на N элементов случайным целыми числами и
выведете максимальное, минимальное и среднее значение
 */

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива!");
        int N = scanner.nextInt();
        int[] massive = new int[N];
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            int elem = (int) (Math.random() * 100);
            massive[i] = elem;
            sum += elem;
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(massive));
        Arrays.sort(massive);
        System.out.println("Максимальное значение элементов массива: " + massive[N-1]);
        System.out.println("Минимальное значение элементов массива: " + massive[0]);
        System.out.println("Среднее значение элементов массива: " + (sum / N));
    }
}
