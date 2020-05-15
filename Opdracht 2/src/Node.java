import java.util.ArrayList;
import java.util.Objects;

public class Node {
    public int id;
    public Node nodeA;
    public Node nodeB;

    public Node(int id) {
        this.id = id;
    }


    // For the text-based FSM:
    public Node nodeTransferString(String s){ // Gives a character from the pathString
        if (Objects.equals(s, "A")){
            return getNodeA(); }

        else if (Objects.equals(s, "B")){
            return getNodeB(); }

        else {
            return null;
        }
    }


    // For the chance-based FSM:
    public Node nodeTransferRandom(int s, int chance){ // Gives the random integer (0-100) and the user-input chance
        if (s <= chance){
            return getNodeA(); }

        else if (s > chance){
            return getNodeB(); }

        else {
            return null;
        }
    }



    // Setters and Getters:
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