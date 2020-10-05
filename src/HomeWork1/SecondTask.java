package HomeWork1;
/*
Создайте программу, выводящую на экран
первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class SecondTask {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Первые 20 элементов последовательности 2 4 8 16 32 64 128 … :");
        for (int i = 0; i < 20; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
