package comp1110.ass2;

/**
 * This class represents the Move that any player make in the Metro game.
 */
public class Move {
    String totalHands;             // Current Tiles in current PLayers hand.

    /**
     * Check the Tile Placement is correct or not. It checks the following conditions:
     * 1.> It checks if the tile placement is of valid size i.e. length = 6.
     * 2.> Check if the given tile is a valid tile from the deck
     * 3.> The position of the tile in tilePlacement is valid position i.e. x and y lie between 0 and 7.
     * @return true if the tilePlacement is correct, otherwise it returns false.
     */
    public static boolean checkTilePlacement(String tilePlacement) {
        // Check if the piecePlacement is not of an accurate size
        if ( tilePlacement.length() != 6 )
            return false;

        // Divide the piecePlacement's string part to check for the valid tile.
        String piece = tilePlacement.substring(0, 4);
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
            int t1 = Integer.parseInt(String.valueOf(tilePlacement.charAt(4)));
            int t2 = Integer.parseInt(String.valueOf(tilePlacement.charAt(5)));
            if ( (t1 < 8 && t1 >= 0) && (t2 < 8 && t2 >= 0) ) {
                // checks if the tile is in the middle 4 squares which would be it invalid.
                return (t1 != 3 || t2 != 3) && (t1 != 3 || t2 != 4) && (t1 != 4 || t2 != 3) && (t1 != 4 || t2 != 4);
            }
        }
        return false;
    }

    /**
     * Update the Tile Placement.
     * @return the updated tilePlacement string with the new tile and its location.
     */
    public static String updateTilePlacement() {
        return "";
    }

    /**
     * Check the Placement Sequence String. It checks the following in the string
     * 1.> The length of the placementSequence is not greater than 60 tiles.
     * 2.> All the tiles are valid in the placementSequence
     * 3.> No two tiles overlap each other or have same coordinates 'x' and 'y'.
     * 4.> Number of times the same tile appear in the placementSequence.
     * @return true if the placementSequence string is correct, otherwise it returns false.
     */
    public static boolean checkPlacementSequence( String placement ) {
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
        // Stores the number of times each tile has appeared in "placement" string
        int[] copies4count = new int[5];
        int[] copies3count = new int[2];
        int[] copies2count = new int[17];

        // For number of tiles in the placement string
        for (int i = 0; i < numberOfTile; i++) {
            int temp = 0;
            tiles[i] = placement.substring(i*6, i*6+6);             // Stores the complete Tile from "placement"
            String tile = tiles[i].substring(0, 4);                 // Just stores the tile orientation
            if ( !Metro.isPiecePlacementWellFormed(tiles[i]) )
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
     * Update the Placement Sequence.
     * @return the updated placementSequence string with the new tilePlacement and its location.
     */
    public static String updatePlacementSequence() {
        return "";
    }

}

