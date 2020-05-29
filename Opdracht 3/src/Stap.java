import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Stap {

    private String name;
    private List<Stap> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;


    Map<Stap, Integer> adjacentNodes = new HashMap<>();


    public void addDestination(Stap destination, int distance) {
        adjacentNodes.put(destination, distance);
    }


    public Stap(String n) {
        name = n;
    }


    // Getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stap> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Stap> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setAdjacentNodes(Map<Stap, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Map<Stap, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }


    @Override
    public String toString(){
        return String.format("Stap " + name);
    }

}
