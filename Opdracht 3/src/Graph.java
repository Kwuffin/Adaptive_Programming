import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }



    // Getter en setter
    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Set<Node> getNodes() {
        return nodes;

    }
}
