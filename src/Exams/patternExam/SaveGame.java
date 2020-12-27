package Exams.patternExam;

import java.io.*;

public abstract class SaveGame {
    private static final File file = new File("src/Exams/patternExam/savedGames/save.bin");

    public static void save(Position position){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(position);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
