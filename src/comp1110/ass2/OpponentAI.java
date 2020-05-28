package comp1110.ass2;

// Authorship: Tom Stephens


// make extend Player class??
public class OpponentAI {

    /**
     * The number of AIs playing the game is taken as an input from the user (between 1 and 5).
     */
    public OpponentAI(int n) {
        int opponents = n;

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
