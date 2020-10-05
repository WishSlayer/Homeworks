package HomeWork3;
/*
Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
 */
import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String string1 = scanner.nextLine();
        String[] stringArr = string1.split(" ");
        System.out.println(Arrays.toString(stringArr));
        String maxWord = "";
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() > maxWord.length()){
                maxWord = stringArr[i];
            }
        }
        System.out.println("Самое длинное слово в предожение: " + maxWord);
    }
}
