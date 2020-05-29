import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @org.junit.jupiter.api.Test
    void calculateShortestPathFromSourceAfstanden() {
        // Test pad A - B - E - F

        Stap nodeAAfstand = new Stap("A");
        Stap nodeBAfstand = new Stap("B");
        Stap nodeCAfstand = new Stap("C");
        Stap nodeDAfstand = new Stap("D");
        Stap nodeEAfstand = new Stap("E");
        Stap nodeFAfstand = new Stap("F");

        Graph g1 = new Graph();

        nodeAAfstand.addDestination(nodeBAfstand, 1);
        nodeAAfstand.addDestination(nodeCAfstand, 500);

        nodeBAfstand.addDestination(nodeDAfstand, 300);
        nodeBAfstand.addDestination(nodeEAfstand, 1);

        nodeCAfstand.addDestination(nodeFAfstand, 1);

        nodeDAfstand.addDestination(nodeFAfstand, 400);

        nodeEAfstand.addDestination(nodeCAfstand, 1);

        Stap endNodeAfstand = nodeFAfstand;

        g1 = Dijkstra.calculateShortestPathFromSource(g1, nodeAAfstand);

        assertEquals(4, endNodeAfstand.getDistance());

    }
}