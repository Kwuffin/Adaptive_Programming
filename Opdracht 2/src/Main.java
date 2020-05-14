import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:\n 1. Text-based\n 2. Chance-based\n 3. Unit-tests");

        int in = sc.nextInt();

        if(in == 1){

            Node s0 = new Node(0);
            Node s1 = new Node(1);
            Node s2 = new Node(2);
            Node s3 = new Node(3);

            s0.setNodeA(s2);
            s0.setNodeB(s1);

            s1.setNodeA(s1);
            s1.setNodeB(s2);

            s2.setNodeB(s3);

            s3.setNodeA(s3);
            s3.setNodeB(s0);

            ArrayList<Node> nodes= new ArrayList<>();

            nodes.add(s0);
            nodes.add(s1);
            nodes.add(s2);
            nodes.add(s3);

            FsmString fsmString = new FsmString(nodes);

            fsmString.run();
        }
        else if(in == 2){

//            ArrayList<Node> nodes= new ArrayList<>();

            Scanner hn = new Scanner(System.in);
            System.out.println("Hoeveel end-nodes wil je?");
            int aantal_nodes = hn.nextInt();

            Scanner ve = new Scanner(System.in);
            System.out.println("Hoeveel verbindingen per node?");
            int aantal_verbindingen = ve.nextInt();

            Node[] nodes = new Node[aantal_nodes];
            for(int i = 0; i < nodes.length; i++){
                nodes[i] = new Node(i);
            }
            System.out.println(nodes);

            Node s0 = new Node(0);

            Node s1 = new Node(1);
            Node s2 = new Node(2);

            Node s3 = new Node(3);
            Node s4 = new Node(4);
            Node s5 = new Node(5);
            Node s6 = new Node(6);

            Node endnote1 = new Node(7);
            Node endnote2 = new Node(8);
            Node endnote3 = new Node(9);
            Node endnote4 = new Node(10);
            Node endnote5 = new Node(11);
            Node endnote6 = new Node(12);

            s0.setNodeA(s1);
            s0.setNodeB(s2);

            s1.setNodeA(s3);
            s1.setNodeB(s4);

            s2.setNodeA(s5);
            s2.setNodeB(s6);

            s3.setNodeA(s1);
            s3.setNodeB(endnote1);

            s4.setNodeA(endnote2);
            s4.setNodeB(endnote3);

            s5.setNodeA(endnote4);
            s5.setNodeB(endnote5);

            s6.setNodeA(s2);
            s6.setNodeB(endnote6);


//
//            nodes.add(s0);
//            nodes.add(s1);
//            nodes.add(s2);
//            nodes.add(s3);
//            nodes.add(s4);
//            nodes.add(s5);
//            nodes.add(s6);
//            nodes.add(endnote1);
//            nodes.add(endnote2);
//            nodes.add(endnote3);
//            nodes.add(endnote4);
//            nodes.add(endnote5);
//            nodes.add(endnote6);
//
//            FsmRandom fsmRandom = new FsmRandom(nodes);
//
//            fsmRandom.run();

        }

        //----------------------------------TEST FRAMEWORK----------------------------------

    }
}