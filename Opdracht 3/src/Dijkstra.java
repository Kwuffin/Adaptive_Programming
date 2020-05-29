import java.util.*;

public class Dijkstra {

    public static Graph calculateShortestPathFromSource(Graph graph, Stap source) {
        source.setDistance(0);

        Set<Stap> settledNodes = new HashSet<>();
        Set<Stap> unsettledNodes = new HashSet<>();
//        PriorityQueue<Stap> unsettledNodes = new PriorityQueue<Stap>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Stap currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<Stap, Integer> adjacencyPair:
                    currentNode.getAdjacentNodes().entrySet()) {
                Stap adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static Stap getLowestDistanceNode(Set <Stap> unsettledNodes) {
        Stap lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Stap node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Stap evaluationNode,
                                                 Integer edgeWeigh, Stap sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Stap> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}
