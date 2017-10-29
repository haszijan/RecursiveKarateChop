import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveKarateChopTest {
    int[] array1 = {4, 13, 67, 158, 369, 499, 942};
    @Test
    void recursiveKarate() {
        RecursiveKarateChop chop = new RecursiveKarateChop();

        assertEquals(0, chop.recursiveKarate(array1, 0, array1.length, 4));
        assertEquals(5, chop.recursiveKarate(array1, 0, array1.length, 499));
    }

}