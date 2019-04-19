import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DayTwoTest {

    private DayTwo dayTwo;

    @Before
    public void setup() {
        dayTwo = new DayTwo();
    }

    @Test
    public void givenInput_abcdef_returnScoreOf_zeroForBoth() {
        String input =  "abcdef";
        dayTwo.getChecksum(input);
        assertMatchingValues(0, 0);
    }

    @Test
    public void givenInput_bababc_returnScoreOf_oneForBoth() {
        String input =  "bababc";
        dayTwo.getChecksum(input);
        assertMatchingValues(1, 1);
    }

    @Test
    public void givenInput_abbcde_returnScoreOf_oneForTwoMatchCount() {
        String input =  "abbcde";
        dayTwo.getChecksum(input);
        assertMatchingValues(1, 0);
    }

    @Test
    public void givenInput_abcccd_returnScoreOf_zeroForTwoMatchCount_oneForThreeMatchCount() {
        String input =  "abcccd";
        dayTwo.getChecksum(input);
        assertMatchingValues(0, 1);
    }

    @Test
    public void givenInput_aabcdd_returnScoreOf_oneForTwoMatchCount_zeroForThreeMatchCount() {
        String input =  "aabcdd";
        dayTwo.getChecksum(input);
        assertMatchingValues(1, 0);
    }

    @Test
    public void givenInput_abcdee_returnScoreOf_oneForTwoMatchCount_zeroForThreeMatchCount() {
        String input =  "abcdee";
        dayTwo.getChecksum(input);
        assertMatchingValues(1, 0);
    }

    @Test
    public void givenInput_ababab_returnScoreOf_oneForTwoMatchCount_oneForThreeMatchCount() {
        String input =  "ababab";
        dayTwo.getChecksum(input);
        assertMatchingValues(0, 1);
    }

    @Test
    public void givenInput_returnScoreOfTwelve() {
        String input =  "abcdef\n" +
                        "bababc\n" +
                        "abbcde\n" +
                        "abcccd\n" +
                        "aabcdd\n" +
                        "abcdee\n" +
                        "ababab";
        int result = dayTwo.getChecksum(input);
        assertMatchingValues(4, 3);
        assertEquals(12, result);
    }

    private void assertMatchingValues(int a, int b) {
        assertEquals(a, dayTwo.getTwoMatchCount());
        assertEquals(b, dayTwo.getThreeMatchCount());
    }
}