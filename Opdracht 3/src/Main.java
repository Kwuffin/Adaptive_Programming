import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wat is je end-node?\n1. A\n2. B\n3. C\n4. D\n5. E\n6. F");
            int inp = s.nextInt();



            // Add afstanden voor stap in kilometers.
            Node nodeAAfstand = new Node("A");
            Node nodeBAfstand = new Node("B");
            Node nodeCAfstand = new Node("C");
            Node nodeDAfstand = new Node("D");
            Node nodeEAfstand = new Node("E");
            Node nodeFAfstand = new Node("F");

            nodeAAfstand.addDestination(nodeBAfstand, 200);
            nodeAAfstand.addDestination(nodeCAfstand, 500);

            nodeBAfstand.addDestination(nodeDAfstand, 300);
            nodeBAfstand.addDestination(nodeEAfstand, 200);

            nodeCAfstand.addDestination(nodeFAfstand, 800);

            nodeDAfstand.addDestination(nodeFAfstand, 400);

            nodeEAfstand.addDestination(nodeCAfstand, 100);

            Graph g1 = new Graph();

            g1.addNode(nodeAAfstand);
            g1.addNode(nodeBAfstand);
            g1.addNode(nodeCAfstand);
            g1.addNode(nodeDAfstand);
            g1.addNode(nodeEAfstand);
            g1.addNode(nodeFAfstand);



            // Add kosten voor stap in Euros.
            Node nodeAKosten = new Node("A");
            Node nodeBKosten = new Node("B");
            Node nodeCKosten = new Node("C");
            Node nodeDKosten = new Node("D");
            Node nodeEKosten = new Node("E");
            Node nodeFKosten = new Node("F");

            nodeAKosten.addDestination(nodeBKosten, 50);
            nodeAKosten.addDestination(nodeCKosten, 200);

            nodeBKosten.addDestination(nodeDKosten, 70);
            nodeBKosten.addDestination(nodeEKosten, 80);

            nodeCKosten.addDestination(nodeFKosten, 300);

            nodeDKosten.addDestination(nodeFKosten, 150);

            nodeEKosten.addDestination(nodeCKosten, 30);

            Graph g2 = new Graph();

            g2.addNode(nodeAKosten);
            g2.addNode(nodeBKosten);
            g2.addNode(nodeCKosten);
            g2.addNode(nodeDKosten);
            g2.addNode(nodeEKosten);
            g2.addNode(nodeFKosten);



            // Add Tijd voor stap in uren.
            Node nodeATijd = new Node("A");
            Node nodeBTijd = new Node("B");
            Node nodeCTijd = new Node("C");
            Node nodeDTijd = new Node("D");
            Node nodeETijd = new Node("E");
            Node nodeFTijd = new Node("F");

            nodeATijd.addDestination(nodeBTijd, 2);
            nodeATijd.addDestination(nodeCTijd, 4);

            nodeBTijd.addDestination(nodeDTijd, 3);
            nodeBTijd.addDestination(nodeETijd, 1);

            nodeCTijd.addDestination(nodeFTijd, 7);

            nodeDTijd.addDestination(nodeFTijd, 4);

            nodeETijd.addDestination(nodeCTijd, 1);

            Graph g3 = new Graph();

            g3.addNode(nodeATijd);
            g3.addNode(nodeBTijd);
            g3.addNode(nodeCTijd);
            g3.addNode(nodeDTijd);
            g3.addNode(nodeETijd);
            g3.addNode(nodeFTijd);


            Node endNodeAfstand = nodeFAfstand;
            Node endNodeKosten = nodeFKosten;
            Node endNodeTijd = nodeFTijd;

            if (inp == 6) {
                endNodeAfstand = endNodeAfstand;
                endNodeKosten = endNodeKosten;
                endNodeTijd = endNodeTijd;
            }
            else if (inp == 5) {
                endNodeAfstand = nodeEAfstand;
                endNodeKosten = nodeEKosten;
                endNodeTijd = nodeETijd;
            }
            else if (inp == 4) {
                endNodeAfstand = nodeDAfstand;
                endNodeKosten = nodeDKosten;
                endNodeTijd = nodeDTijd;
            }
            else if (inp == 3) {
                endNodeAfstand = nodeCAfstand;
                endNodeKosten = nodeCKosten;
                endNodeTijd = nodeCTijd;
            }
            else if (inp == 2) {
                endNodeAfstand = nodeBAfstand;
                endNodeKosten = nodeBKosten;
                endNodeTijd = nodeATijd;
            }
            else if (inp == 1) {
                endNodeAfstand = nodeAAfstand;
                endNodeKosten = nodeAKosten;
                endNodeTijd = nodeATijd;
            }
            else {
                System.out.println("Geef een geldige node!\nTip: Gebruik de nummers 1-6");
                break;
            }


            g1 = Dijkstra.calculateShortestPathFromSource(g1, nodeAAfstand);
            System.out.println("Pad voor de kortste afstand: " + endNodeAfstand.getShortestPath());
            System.out.println("Kortste afstand: " + endNodeAfstand.getDistance() + "km.\n");


            g2 = Dijkstra.calculateShortestPathFromSource(g2, nodeAKosten);
            System.out.println("Pad voor de minste kosten: " + endNodeKosten.getShortestPath());
            System.out.println("Minste kosten: " + endNodeKosten.getDistance() + " Euro.\n");


            g3 = Dijkstra.calculateShortestPathFromSource(g3, nodeATijd);
            System.out.println("Pad voor de kortste tijd: " + endNodeTijd.getShortestPath());
            System.out.println("Kortste tijd: " + endNodeTijd.getDistance() + " uur.\n");

        }
    }
}
