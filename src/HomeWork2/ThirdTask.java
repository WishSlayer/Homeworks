package HomeWork2;
/*
Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
выведите массив в консоль. Определите какой элемент встречается в массиве чаще всего и
выведите информацию об этом в консоль.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int elements = 11;
        int minValue = -1;
        int maxValue = 1;
        int[] massive = new int[elements];
        int firstNum = 0, secondNum = 0, thirdNum = 0;
        for (int i = 0; i < elements; i++) {
            massive[i] = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
            switch (massive[i]) {
                case -1:
                    firstNum += 1;
                    break;
                case 0:
                    secondNum += 1;
                    break;
                case 1:
                    thirdNum +=1;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Элемент -1 встречается - " + firstNum);
        System.out.println("Элемент 0 встречается - " + secondNum);
        System.out.println("Элемент 1 встречается - " + thirdNum);
        if (firstNum == secondNum || thirdNum == firstNum || secondNum == thirdNum)
            System.out.println("Два каких-то элемента встречаются одинаковое количество раз!!!");
        else if (firstNum > secondNum && firstNum > thirdNum)
            System.out.println("Элемент -1 встречается в массиве чаще всего. (" + firstNum + ")");
        else if (secondNum > firstNum && secondNum > thirdNum)
            System.out.println("Элемент 0 встречается в массиве чаще всего. (" + secondNum + ")");
        else
            System.out.println("Элемент 1 встречается в массиве чаще всего. (" + thirdNum + ")");
    }
}
