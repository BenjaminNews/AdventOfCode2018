import org.junit.Test;

import static org.junit.Assert.*;

public class DayOneTest {

    @Test
    public void givenInput_returnFrequencyOf_3() {
        assertEquals(3, DayOne.getEndFrequency("+1, +1, +1".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyOf_0() {
        assertEquals(0, DayOne.getEndFrequency("+1, +1, -2".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyOf_MinusSix() {
        assertEquals(-6, DayOne.getEndFrequency("-1, -2, -3".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyExpecriencedTwice_0() {
        assertEquals(0, DayOne.getFrequencyFirstVisitedTwice("+1, -1".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyExpecriencedTwice_10() {
        assertEquals(10, DayOne.getFrequencyFirstVisitedTwice("+3, +3, +4, -2, -4".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyExpecriencedTwice_5() {
        assertEquals(5, DayOne.getFrequencyFirstVisitedTwice("-6, +3, +8, +5, -6".split(", ")));
    }

    @Test
    public void givenInput_returnFrequencyExpecriencedTwice_14() {
        assertEquals(14, DayOne.getFrequencyFirstVisitedTwice("+7, +7, -2, -7, -4".split(", ")));
    }
}