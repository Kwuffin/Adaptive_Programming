import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void nodeTransferString() {
        Node s0 = new Node(0);
        Node s1 = new Node(1);
        s0.setNodeA(s1);
        String s = "A";
        assertEquals(s1, s0.nodeTransferString(s));
    }

    @Test
    void nodeTransferRandom() {
    }
}