import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Stap> nodes = new HashSet<>();

    public void addNode(Stap nodeA) {
        nodes.add(nodeA);
    }



    // Getter en setter
    public void setNodes(Set<Stap> nodes) {
        this.nodes = nodes;
    }

    public Set<Stap> getNodes() {
        return nodes;

    }
}
