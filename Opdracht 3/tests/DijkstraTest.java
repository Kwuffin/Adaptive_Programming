import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @org.junit.jupiter.api.Test
    void calculateShortestPathFromSourceAfstanden() {
        // Test pad A - B - E - F

        Node nodeAAfstand = new Node("A");
        Node nodeBAfstand = new Node("B");
        Node nodeCAfstand = new Node("C");
        Node nodeDAfstand = new Node("D");
        Node nodeEAfstand = new Node("E");
        Node nodeFAfstand = new Node("F");

        Graph g1 = new Graph();

        nodeAAfstand.addDestination(nodeBAfstand, 1);
        nodeAAfstand.addDestination(nodeCAfstand, 500);

        nodeBAfstand.addDestination(nodeDAfstand, 300);
        nodeBAfstand.addDestination(nodeEAfstand, 1);

        nodeCAfstand.addDestination(nodeFAfstand, 1);

        nodeDAfstand.addDestination(nodeFAfstand, 400);

        nodeEAfstand.addDestination(nodeCAfstand, 1);

        Node endNodeAfstand = nodeFAfstand;

        g1 = Dijkstra.calculateShortestPathFromSource(g1, nodeAAfstand);

        assertEquals(4, endNodeAfstand.getDistance());

    }
}