import java.util.Objects;

public class Node {
    public int id;
    public Node nodeA;
    public Node nodeB;

    public Node(int id) {
        this.id = id;
    }

    public Node nodeTransfer(int s){ // Parameter: either 0 or 1, random integer.
        if (Objects.equals(s, 0)){
            return getNodeA(); }

        else if (Objects.equals(s, 1)){
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
        return "" + id;
    }
}