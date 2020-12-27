package Exams.patternExam;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    private final HashMap<String, MainMenuItem> commands;

    private MainMenu() {
        commands = new HashMap<>(3);
        commands.put("start", new StartGame());
        commands.put("load", new LoadGame());
        commands.put("exit", new ExitGame());
    }

    public static void start(){
        System.out.println("МЕНЮ:" +
                "\n1. Начать новую игру" +
                "\n2. Загрузить последнее сохранение" +
                "\n0. Выйти из игры");
        MainMenu menu = new MainMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :
                menu.execute("start");
                break;
            case 2 :
                menu.execute("load");
                break;
            case 0 :
                menu.execute("exit");
                return;
        }
    }

    public void execute(String commandName){
        commands.get(Objects.requireNonNull(commandName)).execute();
    }
}
