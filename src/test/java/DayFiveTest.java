import static org.junit.Assert.*;

import org.junit.Test;

public class DayFiveTest {

    private final DayFive dayFive = new DayFive();

    @Test
    public void givenInput_aA_returnEmptyString() {
        assertEquals("", dayFive.getResultingString("aA"));
    }

    @Test
    public void givenInput_abBA_returnEmptyString() {
        assertEquals("", dayFive.getResultingString("abBA"));
    }

    @Test
    public void givenInput_aabAAB_return_aabAAB() {
        assertEquals("aabAAB", dayFive.getResultingString("aabAAB"));
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_return_dabCBAcaDA() {
        assertEquals("dabCBAcaDA", dayFive.getResultingString("dabAcCaCBAcCcaDA"));
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_removing_Aa_returns_dbCBcD_withLengthOf_6() {
        String result = dayFive.getFullyReactedPolymer("dabAcCaCBAcCcaDA", 'a');
        assertEquals(result, "dbCBcD");
        assertEquals(result.length(), 6);
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_removing_Bb_returns_daCAcaDA_withLengthOf_8() {
        String result = dayFive.getFullyReactedPolymer("dabAcCaCBAcCcaDA", 'b');
        assertEquals(result, "daCAcaDA");
        assertEquals(result.length(), 8);
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_removing_Cc_returns_daCAcaDA_withLengthOf_4() {
        String result = dayFive.getFullyReactedPolymer("dabAcCaCBAcCcaDA", 'c');
        assertEquals(result, "daDA");
        assertEquals(result.length(), 4);
    }

    @Test
    public void givenInput_dabAcCaCBAcCcaDA_removing_Dd_returns_daCAcaDA_withLengthOf_6() {
        String result = dayFive.getFullyReactedPolymer("dabAcCaCBAcCcaDA", 'd');
        assertEquals(result, "abCBAc");
        assertEquals(result.length(), 6);
    }

    @Test
    public void givenAllCharacters_against_dabAcCaCBAcCcaDA_returnLength_of_4() {
        assertEquals(4, dayFive.getFullyReactedShortestPolymer("dabAcCaCBAcCcaDA"));
    }
}