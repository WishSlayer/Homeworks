package Exams.patternExam;

import java.io.*;

public class LoadGame implements MainMenuItem {
    private static final File file = new File("src/Exams/patternExam/savedGames/save.bin");
    private Game game;

    @Override
    public void execute() {
        if (file.exists()){
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
                Position position = (Position) objectInputStream.readObject();
                game = new Game(position);
                game.step();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Предыдущие сохранения не найдены. Запуск новой игры.");
            game = new Game(Position.FOX);
            game.step();
        }
    }
}
