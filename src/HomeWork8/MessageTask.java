package HomeWork8;

import java.util.*;

public class MessageTask {

    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int[] priorityMassive = new int[MessagePriority.values().length];
        for (Message message : messageList) {
            switch (message.getPriority()) {
                case LOW:
                    priorityMassive[0]++;
                    break;
                case MEDIUM:
                    priorityMassive[1]++;
                    break;
                case HIGH:
                    priorityMassive[2]++;
                    break;
                case URGENT:
                    priorityMassive[3]++;
            }
        }
        System.out.println("Кол-во LOW: " + priorityMassive[0] +
                "; Кол-во MEDIUM: " + priorityMassive[1] +
                "; Кол-во HIGH: " + priorityMassive[2] +
                "; Кол-во URGENT: " + priorityMassive[3]);
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        ArrayList<Integer> codeList = new ArrayList<>();
        for (Message message : messageList) {
            codeList.add(message.getCode());
        }
        for (int code : codeList){
            int count = 0;
            for (Message message : messageList){
                if (message.getCode() == code) count ++;
            }
            System.out.print("Code " + code + ": " + count + "; ");
        }
        System.out.println("");
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        HashSet<Message> messageHashSet = new HashSet<>(messageList);
        System.out.println("Кол-во уникальных сообщений: " + messageHashSet.size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet<Message> linkedHashSet = new LinkedHashSet<>(messageList);
        List<Message> messageList1 = new ArrayList<>(linkedHashSet);
        return messageList1;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("Коллекция до удаления элементов с приоритетом " + priority + "\n" + messageList);
        Iterator<Message> iterator = messageList.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority().equals(priority))
                iterator.remove();
        }
        System.out.println("Коллекция после удаления элементов с приоритетом " + priority + "\n" + messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("Коллекция до удаления элементов, не имеющих приоритет " + priority + "\n" + messageList);
        Iterator<Message> iterator = messageList.listIterator();
        while (iterator.hasNext()){
            if (!iterator.next().getPriority().equals(priority))
                iterator.remove();
        }
        System.out.println("Коллекция после удаления элементов, не имеющих приоритет " + priority + "\n" + messageList);
    }

    public static void main(String[] args) {
        // вызов методов
        // генератор сообщений
        List<Message> messageList = MessageGenerator.generate(5);
        System.out.println(messageList);
        System.out.println();
        countEachPriority(messageList);
        System.out.println();
        countEachCode(messageList);
        System.out.println();
        uniqueMessageCount(messageList);
        System.out.println();
        System.out.println(uniqueMessagesInOriginalOrder(messageList));
        System.out.println();
        removeEach(messageList, MessagePriority.HIGH);
        System.out.println();
        removeOther(messageList, MessagePriority.LOW);
    }
}