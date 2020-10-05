package HomeWork3;
/*
Заполнить массив
Задать массив на N слов.
В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив
(добавлять новое слово в массив можно только, если в нем его еще нет).
В итоге в массиве будут только уникальные слова.
Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
Перед завершением программы, вывести получившийся массив в консоль
 */
import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int massiveNum = scanner.nextInt();
        scanner.nextLine();
        String[] massive = new String[massiveNum];
        boolean find;
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Введите слово для добавления в массив (для выхода введите exit):");
            String word = scanner.nextLine();
            find = false;
            if ("exit".equals(word)){
                break;
            }
            for (String s : massive){
                if (word.equals(s)){
                    System.out.println("Введенное слово уже есть в массиве!");
                    find = true;
                    i --;
                    break;
                }
            }
            if (!find) {
                massive[i] = word;
            }
        }
        System.out.println("Получившийся массив: \n" + Arrays.toString(massive));
    }
}
