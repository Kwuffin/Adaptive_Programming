import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fsm {

    private List<Node> nodes1 = new ArrayList<>(); // Array of all nodes.
    private final List<Node> path = new ArrayList<>(); // Array of path through all nodes.

    public Fsm(List<Node> nodes) {
        this.nodes1 = nodes;
    }


    public void run(int isStringFSM){


        // Text-based FSM:
        if(isStringFSM == 1) {
            Node currentnode = nodes1.get(0);

            Scanner st = new Scanner(System.in);
            System.out.println("Geef een String met A's en B's:");
            String pathString = st.nextLine(); // String consisting of A's and B's.

            int pathLength = pathString.length();
            char[] charray = pathString.toCharArray();

            for (int i = 0; i < pathLength; i++) {
                Node newNode = currentnode.nodeTransferString(Character.toString(charray[i])); // newNode runs the nodeTransfer method with all characters in pathString.
                path.add(newNode);
                if (newNode != null) { // if newNode has no nodeA or nodeB.
                    currentnode = newNode;
                }
            }
            System.out.println("Path: " + path);
        }


        // Chance-based FSM:
        else if (isStringFSM == 0){
            Node currentnode = nodes1.get(0); // Sets currentnode as the starting node.

            Random chance = new Random(); // Creates "Random" object-instance "chance"

            Scanner c = new Scanner(System.in);
            System.out.println("Hoe groot zijn de kansen voor de transitie? (0-100)\n i.e. 30 = 30% - 70% / 3 = 3% - 97%");
            int kans = c.nextInt();

            while (true) {
                int n = chance.nextInt(101); // Gives chance a random number (0 or 1)
                Node newNode = currentnode.nodeTransferRandom(n, kans);
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
}
