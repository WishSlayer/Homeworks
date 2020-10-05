package HomeWork2;
/*
Разобрать методы класса Arrays: compare, compareUnsigned, mismatch
 */

import java.util.Arrays;

public class FourTask {
    public static void main(String[] args) {
        int[] massive1 = {1, 5, 6, 2, 3 ,8, 10};
        Arrays.sort(massive1);
        System.out.println(Arrays.toString(massive1));
        int a, b, c;
        a = Arrays.binarySearch(massive1, 1);
        System.out.println(a);
        b = Arrays.binarySearch(massive1, 3);
        System.out.println(b);
        c = Arrays.binarySearch(massive1, -7);
        System.out.println(c);
    }
}
