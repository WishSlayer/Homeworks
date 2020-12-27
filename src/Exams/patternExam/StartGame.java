package Exams.patternExam;

public class StartGame implements MainMenuItem {
    private Game game;
    @Override
    public void execute() {
        System.out.println("Удачи Вам в начатой игре!!!");
        game = new Game(Position.FOX);
        game.step();
    }
}
