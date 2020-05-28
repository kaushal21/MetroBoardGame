package comp1110.ass2;

// Authorship: Tom Stephens

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
     * A basic computer opponent that picks the next possible move given a random tile from the deck
     * @return a move (i.e. tile and location)
     */
    public static String randomBotMove(String placementString, String topOfDeck) {

        if (Metro.generateMove(placementString, topOfDeck, Player.players).equals("No valid moves left")) {
            // simulate picking up another tile as a human player would
            return "No possible moves";
        }
        // removes the placed tile from the deck
        Tile.updateDeck(topOfDeck);
        return Metro.generateMove(placementString, topOfDeck, Player.players);

    }

}
