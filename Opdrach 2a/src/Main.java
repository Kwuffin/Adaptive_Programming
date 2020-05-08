import java.util.ArrayList;

// De meeste code is ook gemaakt door Richard (@carver01#0903 op Discord), omdat we het grootste~
// ~gedeete samen hebben gewerkt.

public class Main {

    public static void main(String[] args) {

        Node ns0 = new Node(0);
        Node ns1 = new Node(1);
        Node ns2 = new Node(2);
        Node ns3 = new Node(3);

        ns0.setNodeA(ns2);
        ns0.setNodeB(ns1);

        ns1.setNodeA(ns1);
        ns1.setNodeB(ns2);

        ns2.setNodeB(ns3);

        ns3.setNodeA(ns3);
        ns3.setNodeB(ns0);

        ArrayList<Node> nodes= new ArrayList<>();
        nodes.add(ns0);
        nodes.add(ns1);
        nodes.add(ns2);
        nodes.add(ns3);

        Fsm fsm1 = new Fsm(nodes);
        
        fsm1.run();
    }
}