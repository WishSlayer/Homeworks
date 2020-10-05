package HomeWork1;
/*
Создайте программу, выводящую на экран все
неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class ThirdTask {
    public static void main(String[] Args) {
        System.out.println("Все неотрицательные элементы последовательности 90 85 80 75 70 65 60 … :");
        for (int num = 90; num >= 0; num-=5) System.out.println(num);
    }
}
