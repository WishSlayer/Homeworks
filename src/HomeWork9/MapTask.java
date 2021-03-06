package HomeWork9;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");
        String city = "Тверь";

        System.out.println(getLoginListFromCity(firstTaskMap, city));
        System.out.println();


        // TODO:: дан список слов (words).
        //  Написать метод, который будет возвращать количество
        //  одинаковых слов с списке
        //  в виде Map<String, Integer>,
        //  где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(getCountSameWords(words));
        System.out.println();

        // TODO:: дана мапа (customerMap).
        //  Написать метод, который принимает на вход агрументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели,
        //  возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println(usersAgeIntervalMap(customerMap, 20, 50));
        System.out.println();

        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. Вывести частоту встречаемости букв анг алфавита в данном тексте. Вывести в процентах для каждой буквы

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        System.out.println("Кол-во повторений слова в тексте: " + getWordFrequency(text, "that"));
        System.out.println("Группы по кол-ву букв: " + getWordsByGroup(text));
    }

    public static HashMap<String, Customer> getByAge(
            HashMap<String, Customer> map,
            int from, int to
            )
    {
        HashMap<String, Customer> newMap = new HashMap<>();
        for (Map.Entry<String, Customer> entry: map.entrySet()) {
            if (entry.getValue().getAge() >= from &&
            entry.getValue().getAge() < to) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }

    // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
    //  и формирует список (List) логинов, которые соответствуют переданному городу
    public static List<String> getLoginListFromCity(HashMap<String, String> hashMap, String city) {
        List<String> loginListFromCity = new ArrayList<>();
        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(city))
                loginListFromCity.add(entry.getKey());
        }
        return loginListFromCity;
    }

    // TODO:: дан список слов (words).
    //  Написать метод, который будет возвращать количество
    //  одинаковых слов с списке
    //  в виде Map<String, Integer>,
    //  где String - слово и Integer - количество повторений
    public static Map<String, Integer> getCountSameWords(List<String> wordsList){
        Map<String, Integer> countSameWordsMap = new HashMap<>();
        Set<String> setWords = new HashSet<>(wordsList);
        for (String word : setWords) {
            int count = 0;
            for (String s : wordsList) {
                if (s.equals(word))
                    count++;
            }
            countSameWordsMap.put(word, count);
        }
        return countSameWordsMap;
    }

    // TODO:: дана мапа (customerMap).
    //  Написать метод, который принимает на вход агрументы int from и int to и возвращает
    //  новую мапу, в которую войдут все покупатели,
    //  возраст которых находится в диапазоне [from, to)
    public static HashMap<String, Customer> usersAgeIntervalMap(HashMap<String, Customer> customerHashMap, int from, int to) {
        HashMap<String, Customer> newCustomerHashMap = new HashMap<>();
        for (Map.Entry<String, Customer> entry : customerHashMap.entrySet()) {
            if (entry.getValue().getAge() >= from && entry.getValue().getAge() < to)
                newCustomerHashMap.put(entry.getKey(), entry.getValue());
        }
        return newCustomerHashMap;
    }

    // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:

    //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
    public static int getWordFrequency(String text, String word) {
        String[] words = text.split(" ");
        int count = 0;
        for (String s : words) {
            if (s.equalsIgnoreCase(word))
                count++;
        }
        return count;
    }

    //  2. написать метод, который собирает все слова в группы по количеству букв:
    //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
    private static Map<Integer, Set<String>> getWordsByGroup(String text) {
        Map<Integer, Set<String>> wordsByLettersCount = new TreeMap<>();
        String[] words = text.trim().toLowerCase().split(" ");
        for (String word : words) {
            Set<String> strings = wordsByLettersCount.getOrDefault(word.length(), new HashSet<>());
            strings.add(word);
            wordsByLettersCount.put(word.length(), strings);
        }
        return wordsByLettersCount;
    }

    //  3. написать метод, который выводит в консоль топ 10 самых частых слов
    private static void printWords(String text) {
        String[] words = text.trim().toLowerCase().split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        TreeSet<Map.Entry<String, Integer>> entries = new TreeSet<>(new ValueComparator());
        entries.addAll(hashMap.entrySet());
        // вывод в консоль
    }

    //  4. Вывести частоту встречаемости букв анг алфавита в данном тексте. Вывести в процентах для каждой буквы


}

class ValueComparator implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())) return -1;
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}