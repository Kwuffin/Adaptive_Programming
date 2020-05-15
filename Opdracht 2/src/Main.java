import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:\n 1. Text-based\n 2. Chance-based\n 3. Unit-tests");

        int in = sc.nextInt();


        //Text-based FSM:
        if(in == 1){

            System.out.println("==============================================================\n>     Text-based");

            ArrayList<Node> nodes1 = new ArrayList<>();

            Scanner hn = new Scanner(System.in);

            // Werkt nog niet met minder dan 4 nodes --> Geeft index error
            // Werkt helemaal met precies 4 nodes.
            // Werkt half met meer dan 4 nodes --> Geeft geen error, maar negeert alle nodes die na de vierde worden gemaakt.
            System.out.println("Hoeveel nodes wil je?\nNote: Werkt niet helemaal (Lees comments in code op regel 23)");
            int aantal_nodes = hn.nextInt();


//            These lines of code are commented out until it can be implemented fully
//
//            Scanner ve = new Scanner(System.in);
//            System.out.println("Hoeveel verbindingen per node?");
//            int aantal_verbindingen = ve.nextInt();
//
//            for(int i = 0; i < aantal_nodes; i++){
//                Node node = new Node(i);
//                nodes1.add(node);
//            }


            for(int i = 0; i < aantal_nodes; i ++){
                Node node = new Node(i);
                nodes1.add(node);
            }

//            Node s0 = new Node(0);
//            Node s1 = new Node(1);
//            Node s2 = new Node(2);
//            Node s3 = new Node(3);

            nodes1.get(0).setNodeA(nodes1.get(2));
            nodes1.get(0).setNodeB(nodes1.get(1));

            nodes1.get(1).setNodeA(nodes1.get(1));
            nodes1.get(1).setNodeB(nodes1.get(2));

            nodes1.get(2).setNodeB(nodes1.get(3));

            nodes1.get(3).setNodeA(nodes1.get(3));
            nodes1.get(3).setNodeB(nodes1.get(0));

//            nodes1.add(nodes1.get(0));
//            nodes1.add(nodes1.get(1));
//            nodes1.add(nodes1.get(2));
//            nodes1.add(nodes1.get(3));

            Fsm fsm = new Fsm(nodes1);

            fsm.run(1);
        }


        //Chance-based FSM:
        else if(in == 2){
            System.out.println("==============================================================\n>     Chance-based");

            ArrayList<Node> nodes1= new ArrayList<>();



            Scanner hn = new Scanner(System.in);
            System.out.println("Hoeveel nodes wil je?");
            int aantal_nodes = hn.nextInt();


//            These lines of code are commented out until it can be implemented
//
//            Scanner ve = new Scanner(System.in);
//            System.out.println("Hoeveel verbindingen per node?");
//            int aantal_verbindingen = ve.nextInt();

            for(int i = 0; i < aantal_nodes; i ++){
                Node node = new Node(i);
                nodes1.add(node);
            }

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


            nodes1.add(s0);
            nodes1.add(s1);
            nodes1.add(s2);
            nodes1.add(s3);
            nodes1.add(s4);
            nodes1.add(s5);
            nodes1.add(s6);

            nodes1.add(endnote1);
            nodes1.add(endnote2);
            nodes1.add(endnote3);
            nodes1.add(endnote4);
            nodes1.add(endnote5);
            nodes1.add(endnote6);

            Fsm fsm = new Fsm(nodes1);

            fsm.run(0);
        }
        else if(in == 3) {
            //----------------------------------TEST FRAMEWORK----------------------------------
            System.out.println("==============================================================\n>     Unit-tests");
            NodeTest testing = new NodeTest();

            System.out.println("Tests are in progres...");
            //tests the String FSM:
            testing.nodeTransferStringA();
            testing.nodeTransferStringB();

            testing.nodeTransferStringNotANotB();

            //tests for the chance FSM:
            testing.nodeTransferStringA();
            testing.nodeTransferRandomNotA();
            testing.nodeTransferStringB();
            testing.nodeTransferRandomNotB();

            System.out.println("Tests are complete without any known issues!");
        }
    }
}