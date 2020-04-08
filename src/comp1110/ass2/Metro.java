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
        // Check if the piecePlacement is not of an accurate size
        if ( piecePlacement.length() != 6 )
            return false;

        // Divide the piecePlacement's string part to check for the valid tile.
        String piece = piecePlacement.substring(0, 4);
        int temp = 0;
        // Iterate the deck to look for the tile. If it isn't there then it means the tile is wrong and return false.
        for (int i = Tile.top -1; i >= 0; i--) {
            if ( piece.equals(Tile.deck[i]) ) {
                temp = 1;
                break;
            }
        }

        // If the tile was there in the deck, then temp will be 1.
        // Check for the next 2 integers. if within the range of 0 to 7 then return true, otherwise return false.
        if ( temp == 1 ) {
            int t1 = Integer.parseInt(String.valueOf(piecePlacement.charAt(4)));
            int t2 = Integer.parseInt(String.valueOf(piecePlacement.charAt(5)));
            return (t1 < 8 && t1 >= 0) && (t2 < 8 && t2 >= 0);
        }
        return false;
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
        // Check if the length of the placement string is greater than maximum length or is of uneven length
        if ( placement.length() / 6 > 60 || placement.length() % 6 != 0 )
            return false;

        int numberOfTile = placement.length() / 6;                  // Stores the number of tiles in "placement"
        String[] tiles = new String[numberOfTile];                  // Stores all the tiles in "placement"
        int[][] boardGrid = new int[8][8];                          // Grid of size 8x8. stores 1 if tile is present, otherwise 0
        // Initialize the boardGrid array
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                boardGrid[i][j] = 0;

        // Store the list of tiles which can be repeated different number of times differently
        String[] copies4 = {"aacb", "cbaa", "acba", "baac", "aaaa"};
        String[] copies3 = {"cbcb", "bcbc"};
        String[] copies2 = {"cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc",
                "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"};
        // Stores the number of times the tile has appeared in "placement" string
        int[] copies4count = new int[5];
        int[] copies3count = new int[2];
        int[] copies2count = new int[17];

        // For number of tiles in the placement string
        for (int i = 0; i < numberOfTile; i++) {
            int temp = 0;
            tiles[i] = placement.substring(i*6, i*6+6);             // Stores the complete Tile from "placement"
            String tile = tiles[i].substring(0, 4);                 // Just stores the tile orientation
            if ( !isPiecePlacementWellFormed(tiles[i]) )
                return false;
            int t1 = Integer.parseInt(String.valueOf(tiles[i].charAt(4)));      // Stores the tiles row
            int t2 = Integer.parseInt(String.valueOf(tiles[i].charAt(5)));      // Stores the tile column
            // If a tile already exists at that location in then return false, otherwise update the boardGrid
            if ( boardGrid[t1][t2] == 1 )
                return false;
            else
                boardGrid[t1][t2] = 1;

            // Count the appearance of the tile in "placement" string
            // Count for the tiles that can be repeated 4 times
            for(int j = 0; j < 5; j++){
                if ( copies4[j].equals(tile) ) {
                    copies4count[j] += 1;
                    if ( copies4count[j] > 4 )
                        return false;
                    temp = 1;
                    break;
                }
            }
            if ( temp == 1 )
                continue;

            // Count for the tiles that can be repeated 3 times
            for(int j = 0; j < 2; j++){
                if ( copies3[j].equals(tile) ) {
                    copies3count[j] += 1;
                    if ( copies3count[j] > 3 )
                        return false;
                    temp = 1;
                    break;
                }
            }
            if ( temp == 1 )
                continue;

            // Count for the tiles that can be repeated 2 times
            for(int j = 0; j < 17; j++){
                if ( copies2[j].equals(tile) ) {
                    copies2count[j] += 1;
                    if ( copies2count[j] > 2 )
                        return false;
                    break;
                }
            }
        }
        // If all the conditions are satisfied then return true.
        return true;
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
        if ( !Tile.checkDeckEmpty() )
            return Tile.pop();
        return "";
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

/*
ccda01
dada17
cbcb04 cbcb05
baac73
ccda67
aaaa74 aaaa10 aaaa60 aaaa25 aaaa77
bcdd63
accd37
bbbb47
bcbc46
dacc40
acba56
acba75
acba55
adad45
bbad62
dbcd65
ddbc76
cbaa11
baac06
bcdd53
cddb16
acba72
aacb64
cdac26
dacc41
baac02
cdac66
ddbc71
dddd12
cbcb27
cbaa03
adad54
aaaa31
dddd14
dada50
bcbc52
aacb42
badb24
baac61
cbaa07
aacb32
adad13
adad21
dbcd23
cddb36
bbad51
bbbb57
adbb30
accd35
bcbc15
aacb22
badb20
cbaa70
adbb00

 */