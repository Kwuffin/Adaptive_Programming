import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void nodeTransferStringA() { // Set "s1" as nodeA, if nodeA gets returned --> successful
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s1);
        s0.setNodeB(s2);
        String s = "A";
        assertEquals(s1, s0.nodeTransferString(s));
    }

    @Test
    void nodeTransferStringB() { // Set "s1" as nodeA, if nodeB gets returned --> successful
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s2);
        s0.setNodeB(s1);
        String s = "B";
        assertEquals(s1, s0.nodeTransferString(s));
    }


    @Test
    void nodeTransferStringNotANotB() { // Set "s1" as nodeA, if null gets returned --> successful
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s1);
        s0.setNodeB(s2);
        String s = "C";
        assertNull(s0.nodeTransferString(s));
    }


    @Test
    void nodeTransferRandomA() { // 's' is below 'chance' --> returns A
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s1);
        s0.setNodeB(s2);
        assertEquals(s1, s0.nodeTransferRandom(30, 49));
    }

    @Test
    void nodeTransferRandomNotA() { // 's' is above 'chance' --> does not return A
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s1);
        s0.setNodeB(s2);
        assertNotEquals(s1, s0.nodeTransferRandom(60, 49));
    }
    @Test
    void nodeTransferRandomB() { // 's' is below 'chance' --> returns B
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s1);
        s0.setNodeB(s2);
        assertEquals(s1, s0.nodeTransferRandom(60, 49));
    }

    @Test
    void nodeTransferRandomNotB() { // 's' is above 'chance' --> does not return B
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        Node s2 = new Node(2);
        s0.setNodeA(s2);
        s0.setNodeB(s1);
        assertNotEquals(s1, s0.nodeTransferRandom(30, 49));
    }

}