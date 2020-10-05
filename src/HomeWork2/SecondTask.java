package HomeWork2;
/*
Создайте массив из чётных чисел [2;20] и выведите элементы массива
в консоль в обратном порядке (20 18 16 ... 4 2)
 */

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int minValue = 2;
        int maxValue = 20; // для четных до 20
        int[] massive = new int[(maxValue / 2)];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = minValue;
            minValue += 2;
        }
        System.out.println(Arrays.toString(massive));
        for (int i = massive.length - 1; i >= 0; i--) {
            if (i == massive.length - 1) System.out.print("[" + massive[i] + ", ");
            else if (i == 0) System.out.print(massive[i] + "]");
            else System.out.print(massive[i] + ", ");
        }
    }
}
