import static org.junit.Assert.*;

import org.junit.Test;

public class DayThreeTest {

    @Test
    public void givenInput_returnsFour() {
        DayThree dayThree = new DayThree();
        int overlappedCount = dayThree.arrangeFabric("#1 @ 1,3: 4x4\n" +
                                                  "#2 @ 3,1: 4x4\n" +
                                                  "#3 @ 5,5: 2x2", 255, 255);
        assertEquals(4, overlappedCount);

        int nonOverlappedCount = dayThree.getElfThatNotOverlapped();
        assertEquals(3, nonOverlappedCount);
    }
}