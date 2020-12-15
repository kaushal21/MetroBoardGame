package metroGame;

/**
 * This Class is demonstrate the AI as an opponent. It generates and returns a valid move for the AI.
 */
public class OpponentAI extends Player{
    /**
     * The number of bots playing the game is taken as an input from the user.
     * Bots are initialized with the current bot being Bot 1. (not the same as current player)
     *
     * @param a number of computer opponents
     */
    public OpponentAI(int a) {
        super(a);
    }

    /**
     * Given a placement sequence string, generate a valid next move.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param piece             a four-character String representing the tile to be placed
     * @param numberOfPlayers   The number of players in the game
     * @return A valid placement of the given tile
     */
    public static String generateMove(String placementSequence, String piece, int numberOfPlayers) {
        // Get the number of tiles in the placementSequence
        int numberOfTiles = placementSequence.length() / 6;
        // Divide the string into pieces i.e. tile value and its location row and col.
        String[] tiles = new String[numberOfTiles];
        for (int i = 0; i < numberOfTiles; i++) {
            // Put all of the tiles into an array
            tiles[i] = placementSequence.substring(i * 6, (i * 6) + 6);
        }
        return Move.generateValidMove(tiles, piece);
    }

    /**
     * A basic computer opponent that picks the next possible move given a random tile from the deck
     * @return a move (i.e. tile and location)
     */
    public static String randomBotMove(String placementString, String topOfDeck) {
        if (generateMove(placementString, topOfDeck, Player.players).equals("No valid moves left")) {
            // simulate picking up another tile as a human player would
            return "No possible moves";
        }
        // removes the placed tile from the deck
        Tile.updateDeck(topOfDeck);

        // Return the move made by AI
        return generateMove(placementString, topOfDeck, Player.players);
    }
}
