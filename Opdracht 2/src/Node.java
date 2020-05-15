import java.util.ArrayList;
import java.util.Objects;

public class Node {
    public int id;
    private ArrayList<Node> connections = new ArrayList<>();
    public Node nodeA;
    public Node nodeB;

    public Node(int id) {
        this.id = id;
    }

    public Node nodeTransferString(String s){
        if (Objects.equals(s, "A")){
            return getNodeA(); }

        else if (Objects.equals(s, "B")){
            return getNodeB(); }

        else {
            return null;
        }
    }

    public Node nodeTransferRandom(int s, int chance){ // Parameter: either 0 or 1, random integer.
        if (s <= chance){
            return getNodeA(); }

        else if (s > chance){
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