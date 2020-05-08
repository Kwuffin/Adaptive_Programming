import java.util.ArrayList;
import java.util.List;

public class Fsm {

    private List<Node> nodes = new ArrayList<>(); // Array of all nodes.
    private final List<Node> path = new ArrayList<>(); // Array of path through all nodes.

    public Fsm(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void run(){
        Node currentnode = nodes.get(0); // Sets currentnode as the starting node.

        String pathString = "AA"; // String consisting of A's and B's.
        int pathLength = pathString.length();
        char[] charray = pathString.toCharArray();

        for (int i = 0; i < pathLength; i++){
            Node newNode = currentnode.nodeTransfer(Character.toString(charray[i])); // newNode runs the nodeTransfer method with all characters in pathString.
            path.add(newNode);
            if (newNode != null){ // if newNode has no nodeA or nodeB.
                currentnode = newNode;
            }
        }
        System.out.println("Path: " + path);
    }
}
