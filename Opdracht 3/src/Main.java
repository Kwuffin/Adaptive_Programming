import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wat is je end-node?\n1. A\n2. B\n3. C\n4. D\n5. E\n6. F");
            int inp = s.nextInt();



            // Add afstanden voor stap in kilometers.
            Stap nodeAAfstand = new Stap("A");
            Stap nodeBAfstand = new Stap("B");
            Stap nodeCAfstand = new Stap("C");
            Stap nodeDAfstand = new Stap("D");
            Stap nodeEAfstand = new Stap("E");
            Stap nodeFAfstand = new Stap("F");

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
            Stap nodeAKosten = new Stap("A");
            Stap nodeBKosten = new Stap("B");
            Stap nodeCKosten = new Stap("C");
            Stap nodeDKosten = new Stap("D");
            Stap nodeEKosten = new Stap("E");
            Stap nodeFKosten = new Stap("F");

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
            Stap nodeATijd = new Stap("A");
            Stap nodeBTijd = new Stap("B");
            Stap nodeCTijd = new Stap("C");
            Stap nodeDTijd = new Stap("D");
            Stap nodeETijd = new Stap("E");
            Stap nodeFTijd = new Stap("F");

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


            Stap endNodeAfstand = nodeFAfstand;
            Stap endNodeKosten = nodeFKosten;
            Stap endNodeTijd = nodeFTijd;

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
                endNodeTijd = nodeBTijd;
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

            Reis r1 = new Reis();
            Reis r2 = new Reis();
            Reis r3 = new Reis();


            g1 = Dijkstra.calculateShortestPathFromSource(g1, nodeAAfstand);
            g2 = Dijkstra.calculateShortestPathFromSource(g2, nodeAKosten);
            g3 = Dijkstra.calculateShortestPathFromSource(g3, nodeATijd);

            for(Stap n : endNodeAfstand.getShortestPath()){
                r1.getStappen().add(n);
            }
            for(Stap n : endNodeKosten.getShortestPath()){
                r2.getStappen().add(n);
            }
            for(Stap n : endNodeTijd.getShortestPath()){
                r3.getStappen().add(n);
            }

            System.out.println("Pad voor de kortste afstand: " + r1.getStappen());
            System.out.println("Kortste afstand: " + endNodeAfstand.getDistance() + "km.\n");

            System.out.println("Pad voor de minste kosten: " + r2.getStappen());
            System.out.println("Minste kosten: " + endNodeKosten.getDistance() + " Euro.\n");

            System.out.println("Pad voor de kortste tijd: " + r3.getStappen());
            System.out.println("Kortste tijd: " + endNodeTijd.getDistance() + " uur.\n");

        }
    }
}
