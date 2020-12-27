package Exams.patternExam;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static final HashMap<Position, Node> NODES = new HashMap<>();
    static {
        Node goHome = new Node(Position.GO_HOME);
        Node findAlone = new Node(Position.FIND_ALONE);
        Node rest = new Node(Position.REST);
        Node bringHoneyToBear = new Node(Position.BRING_HONEY_TO_BEAR, findAlone, goHome);
        Node waitBee = new Node(Position.WAIT_BEE, rest, bringHoneyToBear);
        Node stealHoney = new Node(Position.STEAL_HONEY);
        Node tryGetHoney = new Node(Position.TRY_GET_HONEY, waitBee, stealHoney);
        Node goDeep = new Node(Position.GO_DEEP, findAlone, tryGetHoney);
        Node askOwl = new Node(Position.ASK_OWL, goDeep, findAlone);
        Node askWolf = new Node(Position.ASK_WOLF, goHome, findAlone);
        Node askAnimals = new Node(Position.ASK_ANIMALS, askOwl, askWolf);
        Node startSearch = new Node(Position.START_SEARCH, askAnimals, findAlone);
        Node fox = new Node(Position.FOX, goHome, startSearch);

        NODES.put(Position.GO_HOME, goHome);
        NODES.put(Position.FIND_ALONE, findAlone);
        NODES.put(Position.REST, rest);
        NODES.put(Position.BRING_HONEY_TO_BEAR, bringHoneyToBear);
        NODES.put(Position.WAIT_BEE, waitBee);
        NODES.put(Position.STEAL_HONEY, stealHoney);
        NODES.put(Position.TRY_GET_HONEY, tryGetHoney);
        NODES.put(Position.GO_DEEP, goDeep);
        NODES.put(Position.ASK_OWL, askOwl);
        NODES.put(Position.ASK_WOLF, askWolf);
        NODES.put(Position.ASK_ANIMALS, askAnimals);
        NODES.put(Position.START_SEARCH, startSearch);
        NODES.put(Position.FOX, fox);
    }

    private Node node;
    private final Scanner scanner = new Scanner(System.in);

    public Game(Position position) {
        this.node = NODES.get(position);
    }

    public void step() {
        System.out.println();
        System.out.println(node.getPosition().getDescription());
        switch (node.getPosition()) {
            case REST:
            case FIND_ALONE:
            case STEAL_HONEY:
                System.out.println("GAME OVER\n");
                MainMenu.start();
                return;
            case FOX:
            case START_SEARCH:
            case ASK_ANIMALS:
            case ASK_WOLF:
            case ASK_OWL:
            case GO_DEEP:
            case TRY_GET_HONEY:
            case WAIT_BEE:
            case BRING_HONEY_TO_BEAR:
                boolean chosen = false;
                do {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 9:
                            this.save();
                            System.out.println("Сохранение прошло успешно");
                            break;
                        case 0:
                            System.out.println("Выход в главное меню");
                            MainMenu.start();
                            return;
                        case 1:
                            this.node = node.getFirst();
                            chosen = true;
                            break;
                        case 2:
                            this.node = node.getSecond();
                            chosen = true;
                            break;
                    }
                } while (!chosen);
                break;

            case GO_HOME:
                System.out.println("Победа");
                MainMenu.start();
                return;
        }
        this.step();
    }

    private void save(){
        SaveGame.save(node.getPosition());
    }
}
