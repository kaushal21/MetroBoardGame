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
    public String randomBotMove(String placementString) {
        // generates a random position in the deck to get a random tile
        int rand = (int) (Math.random() * 60);
        String piece = Tile.getDeck(rand);

        if (Metro.generateMove(placementString, piece, Player.players).equals("No valid moves left")) {
            // simulate picking up another tile as a human player would
            rand++;
            piece = Tile.getDeck(rand);

        }
        // removes the placed tile from the deck
        Tile.updateDeck(piece);
        return Metro.generateMove(placementString, piece, Player.players);

    }

}
