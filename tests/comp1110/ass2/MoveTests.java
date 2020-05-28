package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class MoveTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Metro.isPiecePlacementWellFormed(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, (boolean) expected);
    }

    /* This only passes when the construction rule are being used (as it should)
    @Test
    public void testConstructionPiecePlacementWellFormed() {
        String constructionBoardString = "cons72acba37aacb71baac17dada27aacb16adad26aacb74ddbc61dada60bbbb25dacc73dddd24cbaa04dbcd36dbcd35adbb30baac02cdac50baac67bbbb75cbaa70ccda51adad12cbcb06adbb76accd14aaaa40aaaa11cccc64cbaa54dddd65dacc13baac00acba57bcdd31bcbc15bcbc55acba20aaaa23ccda05cdac41bcdd32badb66bbad45badb52accd01cddb53bcbc63dbba42cbaa22acba56cddb62dbba47aaaa07cbcb21cbcb46aacb10ddbc77bbad03";
        for (int j = 0; j < constructionBoardString.length() / 6; j++) {
            String piece = constructionBoardString.substring(j * 6, j * 6 + 6);
            test(piece, true);
        }
    }
     */

    @Test
    public void testGenerateMoveHelpers() {
        int Y = 0;
        int X = 0;
        String piece = "cbaa";
        assertTrue("Expected true but got " + Move.isInvalid(piece, Y, X), Move.isInvalid(piece, Y, X));
        assertFalse("Expected False but got " + Move.atMiddle(Y, X), Move.atMiddle(Y, X));
    }

}
