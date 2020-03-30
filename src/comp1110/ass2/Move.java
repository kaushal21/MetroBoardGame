package comp1110.ass2;

/**
 * This class represents the Move that any player make in the Metro game.
 */
public class Move {
    String currentTile;             // Current Tile in current PLayers hand.

    /**
     * Draws from the deck.
     * @return the currentTile drawn form the deck.
     */
    public static String drawFromDeck(String[] deck, int top, String currentTile) {
        currentTile = Tile.pop(deck, top);
        return currentTile;
    }

    /**
     * Update the Tile Placement.
     * @return the updated tilePlacement string with the new tile and its location.
     */
    public static String updateTilePlacement() {
        return "";
    }

    /**
     * Update the Placement Sequence.
     * @return the updated placementSequence string with the new tilePlacement and its location.
     */
    public static String updatePlacementSequence() {
        return "";
    }
}
