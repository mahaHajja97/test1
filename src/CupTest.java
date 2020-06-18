import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getName() {
        Cup c = new Cup("maha",10);
        assertEquals("maha", c.getName());
    }
}