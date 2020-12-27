package Exams.patternExam;

public class Node{
    private Position position;
    private Node first;
    private Node second;

    public Node(Position position) {
        this.position = position;
    }

    public Node(Position position, Node first, Node second) {
        this.position = position;
        this.first = first;
        this.second = second;
    }

    public Position getPosition() {
        return position;
    }

    public Node getFirst() {
        return first;
    }

    public Node getSecond() {
        return second;
    }
}
