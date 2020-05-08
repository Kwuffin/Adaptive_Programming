import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Node {
    public int id;
    public Node nodeA;
    public Node nodeB;

    public Node(int id) {
        this.id = id;
    }

    // Determines which path to take, by looking at the next character in pathString.
    public Node nodeTransfer(String s){
        if (Objects.equals(s, "A")){
            return getNodeA(); }

        else if (Objects.equals(s, "B")){
            return getNodeB(); }

        else {
            return null;
        }
    }

    public void setNodeA(Node n) {
        this.nodeA = n;
    }

    public void setNodeB(Node n) {
        this.nodeB = n;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    @Override
    public String toString() {
        return "s"+ id;
    }
}