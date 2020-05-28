package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

public class IsPlacementSequenceValidTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void testEmptyBoard() {
        boolean emptyBoard = Metro.isPlacementSequenceValid("");
        assertTrue("Expected the empty board to be valid, but got " + emptyBoard, emptyBoard);
    }

    @Test
    public void testValid() {
        for (String validString : Utilities.VALID_SMALL_BOARDSTRINGS) {
            test(validString, true);
        }
        for (String validString : Utilities.VALID_MEDIUM_BOARDSTRINGS) {
            test(validString, true);
        }
    }

    @Test
    public void testInvalid() {
        testTrivial();
        for (String invalidString : Utilities.INVALID_SMALL_BOARDSTRINGS) {
            test(invalidString, false);
        }
        for (String invalidString : Utilities.INVALID_MEDIUM_BOARDSTRINGS) {
            test(invalidString, false);
        }
    }

    @Test
    public void testCompleteStrings() {
        for (String completeString : Utilities.COMPLETE_BOARDSTRINGS) {
            test(completeString, true);
        }
    }

    private void test(String boardString, boolean expected) {
        boolean result = Metro.isPlacementSequenceValid(boardString);
        assertTrue("Metro.isPlacementSequenceValid(\"" + boardString + "\") returned " + result + " but expected " + expected, expected == result);
    }

    private void testTrivial() {
        test("aacb01", true);
    }

    @Test
    public void kaushalTestingPlacementSequence() {
        Move move = new Move();
        boolean expected = true;
        boolean result;
        String str1 = "acba17aacb07adbb16cbaa06aaaa15cddb05ccda04baac14dddd26cccc27dada25cdac24adad03adbb13cbaa23aaaa00cbcb01cddb02";
        String tile1 = "adbb12";
        // result = move.isPlacementSequenceValid(str1+tile1);
        // assertTrue("Metro.isPlacementSequenceValid(\"" + (str1+tile1) + "\") returned " + result + " but expected " + expected, expected == result);
        String str2 = "badb17dbba16acba00bbad01aaaa02dada27dbba26adbb03cbaa04ddbc10bcbc25aacb15aacb05bbbb06bcdd11bcbc14aacb13aacb07dada12aacb20bbad24";
        String tile2 = "cbcb27";
        result = move.isPlacementSequenceValid(str2);
        assertTrue("Metro.isPlacementSequenceValid(\"" + (str2) + "\") returned " + result + " but expected " + expected, expected == result);
    }
}
