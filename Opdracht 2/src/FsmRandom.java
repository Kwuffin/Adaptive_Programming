import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FsmRandom {

    private List<Node> nodes = new ArrayList<>(); // Array of all nodes.
    private final List<Node> path = new ArrayList<>(); // Array of path through all nodes.

    public FsmRandom(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void run() {
        Node currentnode = nodes.get(0); // Sets currentnode as the starting node.

        Random chance = new Random(); // Creates "Random" object-instance "chance"

        while (true) {

            int n = chance.nextInt(2); // Gives chance a random number (0 or 1)
            Node newNode = currentnode.nodeTransferRandom(n);
            path.add(currentnode);
            if (newNode != null) {
                currentnode = newNode;
            } else {
                break;
            }
        }

        System.out.println("Path: " + path);
        System.out.println("Node " + path.get(path.size() - 1) + " is the end-node");
    }
}
