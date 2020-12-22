package day18;

/**
 * Created by Vadim Khublarian on 12/18/20.
 */
public class Node {
    private int value;
    private Node leftSon;
    private Node rightSon;

    public Node(int value) {
        this.value = value;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }
}

