package task08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AckermannTest {

    @Test
    void ackermann() {
        System.out.println(Ackermann.ackermann(4, 4));

//        assertEquals(61, Ackermann.ackermann(3, 3));
        //assertEquals(65533, Ackermann.ackermann(4, 1));
    }
}