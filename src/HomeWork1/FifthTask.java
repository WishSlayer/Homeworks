package HomeWork1;
/*
Задача на синтаксис switch. Дана целочисленная переменная (номер билета от пользователя):
если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
В остальных случаях сообщить, что приза нет.
 */
public class FifthTask {
    public static void main(String[] args) {
        int ticket = 777;
        switch (ticket) {
            case 111:
            case 222:
            case 333:
                System.out.println("Ваш приз - Книга!");
                break;
            case 444:
            case 555:
                System.out.println("Ваш приз - Телефон!");
                break;
            case 777:
                System.out.println("Ваш приз - Ноутбук!");
                break;
            default:
                System.out.println("Вы не выиграли приз!");
        }
    }
}
