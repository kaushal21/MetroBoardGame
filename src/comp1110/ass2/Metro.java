package comp1110.ass2;

public class Metro {
    /**
     * Creating a tile object. It stores the deck, and the top position of deck.
     */
    static Tile tile = new Tile();

    /**
     * Task 2
     * Determine whether a piece placement is well-formed. For a piece
     * placement to be well-formed, it must:
     * - contain exactly six characters;
     * - have as its first, second, third and fourth characters letters between
     * 'a' and 'd' inclusive (tracks); and
     * - have as its fifth and sixth characters digits between 0 and 7 inclusive
     * (column and row respectively).
     *
     * @param piecePlacement A String representing the piece to be placed
     * @return True if this string is well-formed
     */
    public static boolean isPiecePlacementWellFormed(String piecePlacement) {
        // FIXME Task 2: determine whether a piece placement is well-formed
        return Move.checkTilePlacement(piecePlacement);
    }

    /**
     * Task 3
     * Determine whether a placement sequence string is well-formed.
     * For a placement sequence to be well-formed, it must satisfy the
     * following criteria:
     * - It must be composed of well-formed tile placements.
     * - For any piece x, there can exist no more instances of x on the board
     * than instances of x in the deck.
     *
     * @param placement A String representing the placement of all tiles on the
     *                  board
     * @return true if this placement sequence is well-formed
     */
    public static boolean isPlacementSequenceWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement sequence is well-formed
        return Move.checkPlacementSequence(placement);
    }

    /**
     * Task 5
     * Draw a random tile from the deck.
     *
     * @param placementSequence a String representing the sequence of tiles
     *                          that have already been played
     * @param totalHands        a String representing all tiles (if any) in
     *                          all players' hands
     * @return a random tile from the deck
     */
    public static String drawFromDeck(String placementSequence, String totalHands) {
        // FIXME Task 5: draw a random tile from the deck
        // Create a new Tile variable that holds a deck and its top location.
        Tile updatedDeck = new Tile();

        // Store the number of tiles that are already placed and are in hand
        int numberOfPlacedTiles = placementSequence.length() / 6;
        int numberOfTilesInHand = totalHands.length() / 4;

        // If the passed strings are not null then. i.e. there are some already placed tiles or some in hand
        if ( placementSequence.length() != 0 || totalHands.length() != 0 ) {
            // Create a list to store already placed tiles
            String[] placedTiles = new String[numberOfPlacedTiles + numberOfTilesInHand];

            // Store the tiles from the placementSequence to the newly created array.
            for(int i = 0; i < numberOfPlacedTiles; i++) {
                placedTiles[i] = placementSequence.substring(i*6, (i*6)+6);
                placedTiles[i] = placedTiles[i].substring(0, 4);
            }

            // Store the tiles from the totalHands to the newly created array.
            for(int i = numberOfPlacedTiles, k = 0; i < numberOfPlacedTiles + numberOfTilesInHand; i++, k++) {
                placedTiles[i] = totalHands.substring(k*4, (k*4) + 4);
            }

            // Update the deck i.e. swap the tile that is there in the placedTiles to the last location in the deck.
            for (String out: placedTiles){
                updateDeck(updatedDeck, out);
            }
        }

        // Create a String variable that will store the returning string
        String temp = "";
        // Check if the deck is empty or not
        if ( Tile.checkDeckEmpty() ) {
            temp = Tile.pop();
        }
        // Return the string that is top most tile in the deck.
        return temp;
    }

    /**
     * This function updated the passed deck by swapping the last location to that of string,
     * and then update the top value.
     * @param deck this is the Tile variable.
     * @param alreadyPlacedTile this is the string which is already present either in the placementSequence or totalHands.
     */
    static void updateDeck ( Tile deck, String alreadyPlacedTile ) {
        // Check the complete deck from starting to the last location i.e. top
        for(int i = 0; i < Tile.top; i++) {

            // if this tile is matched with the passed tile then swap these two
            if ( Tile.deck[i].equals(alreadyPlacedTile) ) {

                // Updating the top location and storing the value in a variable.
                int lastLocation = --Tile.top;
                String temp = Tile.deck[lastLocation];
                Tile.deck[lastLocation] = Tile.deck[i];
                Tile.deck[i] = temp;
                return;
            }
        }
    }

    /**
     * Task 6
     * Determine if a given placement sequence follows the rules of the game.
     * These rules are:
     * - No tile can overlap another tile, or any of the central stations.
     * - A tile cannot be placed next to one of the central squares unless it
     * continues or completes an existing track.
     * - If a tile is on an edge of the board, it cannot contain a track that
     * results in a station looping back to itself, UNLESS that tile could not
     * have been placed elsewhere.
     * - If a tile is on a corner of the board, it cannot contain a track that
     * links the two stations adjacent to that corner, UNLESS that tile could
     * not have been placed elsewhere.
     *
     * @param placementSequence A sequence of placements on the board.
     * @return Whether this placement string is valid.
     */
    public static boolean isPlacementSequenceValid(String placementSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        return false;
    }

    /**
     * Task 7
     * Determine the current score for the game.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param numberOfPlayers   The number of players in the game
     * @return an array containing the scores for all players
     */
    public static int[] getScore(String placementSequence, int numberOfPlayers) {
        // FIXME Task 7: determine the current score for the game
        return new int[0];
    }

    /**
     * Task 9
     * Given a placement sequence string, generate a valid next move.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param piece             a four-character String representing the tile just drawn
     * @param hand              A tile in the player's hand, which they can choose to play instead of the drawn tile.
     *                          If the player does not currently hold a tile, this parameter will be null.
     * @param numberOfPlayers   The number of players in the game
     * @return A valid placement of other the drawn tile or the tile from the player's hand (if it is not empty).
     */
    public static String generateMove(String placementSequence, String piece, String hand, int numberOfPlayers) {
        // FIXME Task 9: generate a valid move
        return "";
    }
}
