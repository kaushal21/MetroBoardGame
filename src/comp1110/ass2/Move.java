package comp1110.ass2;


// Authorship: Kaushal Sharma, Tom Stephens

import comp1110.ass2.gui.GetPlayers;

import java.util.Arrays;

/**
 * This class represents the Move that any player make in the Metro game.
 */
public class Move {
    Board board = new Board();

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

        // Create a Tile variable to check if the passed string is in the deck or not
        Tile tile = new Tile();
        // Iterate the correct deck to look for the tile. If it isn't there then it means the tile is wrong and return false.

        if (GetPlayers.playingConstructionRules()) { // if using construction deck
            String[] newDeck = Tile.makeConstructionDeck(Tile.deck);
            for (int i = Tile.top -1; i >= 0; i--) {
                if ( piece.equals(newDeck[i]) ) {
                    temp = 1;
                    break;
                }
            }
        } else { // if using regular deck
            for (int i = Tile.top -1; i >= 0; i--) {
                if ( piece.equals(Tile.deck[i]) ) {
                    temp = 1;
                    break;
                }
            }
        }



        // If the tile was there in the deck, then temp will be 1.
        // Check for the next 2 integers. if within the range of 0 to 7 then return true, otherwise return false.
        // Also, the passed values for row and col shouldn't be equal to the center station.
        if ( temp == 1 ) {
            int t1 = Integer.parseInt(String.valueOf(tilePlacement.charAt(4)));
            int t2 = Integer.parseInt(String.valueOf(tilePlacement.charAt(5)));
            if ( (t1 < 8 && t1 >= 0) && (t2 < 8 && t2 >= 0) ) {
                // checks if the tile is in the middle 4 squares which make it invalid.
                return (t1 != 3 || t2 != 3) && (t1 != 3 || t2 != 4) && (t1 != 4 || t2 != 3) && (t1 != 4 || t2 != 4);
            }
        }
        return false;
    }

    /**
     * Check the Placement Sequence String. It checks the following in the string
     * 1.> The length of the placementSequence is not greater than 60 tiles.
     * 2.> All the tiles are valid in the placementSequence
     * 3.> No two tiles overlap each other or have same coordinates 'x' and 'y'.
     * 4.> Number of times the same tile appear in the placementSequence.
     * @return true if the placementSequence string is correct, otherwise it returns false.
     */
    public boolean checkPlacementSequence( String placement ) {
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
        // construction tile
        String[] copies1 = {"cons"};
        // Stores the number of times each tile has appeared in "placement" string
        int[] copies4count = new int[5];
        int[] copies3count = new int[2];
        int[] copies2count = new int[17];
        int[] copies1count = new int[1];    // this is for construction tile

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
            // Count for the construction tile which can't be repeated
            for(int j = 0; j < 1; j++){
                if (copies1[j].equals(tile) ) {
                    copies1count[j] += 1;
                    if ( copies1count[j] > 1 )
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
    public String updatePlacementSequence ( String placementSequence, String tile ) {
        String temp = "";
        if (isPlacementSequenceValid(placementSequence))
            if (checkTilePlacement(tile))
                temp = placementSequence + tile;
        return temp;
    }

    /**
     * This checks the validity of the placementSequence passed.
     * It generates the board string for the passed placementSequence.
     * @param placementSequence it is the string for all the tiles that are placed on the board
     * @return true if the placementSequence is valid, otherwise return false
     */
    public boolean isPlacementSequenceValid ( String placementSequence ) {
        // Check if the passed string is correct placementSequence string
        if ( !checkPlacementSequence(placementSequence) ){
            return false;}

        // Get the number of tiles in the placementSequence
        int numberOfTiles = placementSequence.length() / 6;
        String[] tiles = new String[numberOfTiles];

        // For each tile in the placementSequence check if it's a valid placement and update the board
        for(int i = 0; i < numberOfTiles; i++) {
            // Divide the string into pieces i.e. tile value and its location row and col.
            tiles[i] = placementSequence.substring(i*6, (i*6)+6);
            String currentTile = tiles[i].substring(0, 4);
            int row = Integer.parseInt(String.valueOf(tiles[i].charAt(4)));
            int col = Integer.parseInt(String.valueOf(tiles[i].charAt(5)));
            System.out.println((i+1)+".> "+tiles[i]);

            // Get the upper, lower, right and left values for the given location
            int top_row = row - 1, left_col = col - 1, right_col = col + 1, bottom_row = row + 1;
            int t, b, l, r;

            // Condition 1 ->
            // Check if the location is already occupied, and we are not trying to overlap tiles
            if ( board.getBoard(row, col) == 1 ) {
                return false;
            }

            // Condition 2 ->
            // Check if the location is overlapping the center stations
            if ( ( row >= 3 && row <= 4 ) && ( col >= 3 && col <= 4 ) ) {
                return false;
            }

            // Condition 3 ->
            // Check if the tile is placed at the edge of central station and shares a boundary with other tile
            if ( ( row >= 2 && row <= 5 ) && ( col >= 2 && col <= 5 ) ) {
                t = 0;
                l = 0;
                r = 0;
                b = 0;

                // Check if the top position has a tile
                if ( board.getBoard(top_row, col) == 1 )
                    t = 1;
                // Check if the bottom position has a tile
                if ( board.getBoard(bottom_row, col) == 1 )
                    b = 1;
                // Check if the left position has a tile
                if ( board.getBoard(row, left_col) == 1 )
                    l = 1;
                // Check if the right position has a tile
                if ( board.getBoard(row, right_col) == 1 )
                    r = 1;

                // If none of the those position has a tile, then return false
                if ( t != 1 && b != 1 && l != 1 && r != 1 )
                    return false;
            }

            // Check if the tile is placed at an edge of the board. Also, allow the first tile from the deck to be placed here without any condition
            if ( ( ( ( row == 0 || row == 7 ) && col <= 7 ) || ( ( col == 0 || col == 7 ) && row <= 7 ) ) && i != 0 ) {
                // Check if its not a corner of the board.
                // if ( !( ( row == 0 && col == 0 ) || ( row == 0 && col == 7 ) || ( row == 7 && col == 0 ) || ( row == 7 && col == 7 ) ) ) {
                    // Check for a loop at the top edge of the board
                    if (row == 0 && currentTile.charAt(0) == 'd') {
                        // return false if there is an empty place within the board which is also not an edge.
                        for (int j = 1; j < 7; j++) {
                            for (int k = 1; k < 7; k++) {
                                if (board.getBoard(j, k) == 0) {
                                    System.out.println("Here1");
                                    return false;
                                }
                            }
                        }
                        // Also, check if the there is no other empty position on other edges where it can be placed
                        // Check on the left edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(j,0) == 0 && currentTile.charAt(3) != 'd') {
                                System.out.println("Here2");
                                return false;
                            }
                        }
                        // Check on the right edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(j,7) == 0 && currentTile.charAt(1) != 'd') {
                                System.out.println("Here3");
                                return false;
                            }
                        }
                        // Check on the bottom edge of the board
                        for (int j = 0; j < 8; j++) {
                            if ( j == 0 ) {
                                if ( board.getBoard(7, j) == 0 ) {
                                    if ( currentTile.charAt(2) != 'd' && currentTile.charAt(2) != 'b' && currentTile.charAt(3) != 'd' && currentTile.charAt(3) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else if ( j == 7 ) {
                                if ( board.getBoard(7, j) == 0 ) {
                                    if ( currentTile.charAt(1) != 'd' && currentTile.charAt(1) != 'b' && currentTile.charAt(2) != 'd' && currentTile.charAt(2) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else {
                                if ( board.getBoard(7, j) == 0 && currentTile.charAt(2) != 'd') {
                                    System.out.println("Here4");
                                    return false;
                                }
                            }
                        }
                    }

                    // Check for a loop at the bottom edge of the board
                    if (row == 7 && currentTile.charAt(2) == 'd') {
                        // return false if there is an empty place within the board which is also not an edge.
                        for (int j = 1; j < 7; j++) {
                            for (int k = 1; k < 7; k++) {
                                if (board.getBoard(j, k) == 0) {
                                    return false;
                                }
                            }
                        }
                        // Also, check if the there is no other empty position on other edges where it can be placed
                        // Check on the left edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(j,0) == 0 && currentTile.charAt(3) != 'd') {
                                return false;
                            }
                        }
                        // Check on the right edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(j,7) == 0 && currentTile.charAt(1) != 'd') {
                                return false;
                            }
                        }
                        // Check on the top edge of the board
                        for (int j = 0; j < 8; j++) {
                            if ( j == 0 ) {
                                if ( board.getBoard(0, j) == 0 ) {
                                    if ( currentTile.charAt(3) != 'd' && currentTile.charAt(3) != 'b' && currentTile.charAt(0) != 'd' && currentTile.charAt(0) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else if ( j == 7 ) {
                                if ( board.getBoard(0, j) == 0 ) {
                                    if ( currentTile.charAt(0) != 'd' && currentTile.charAt(0) != 'b' && currentTile.charAt(1) != 'd' && currentTile.charAt(1) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else {
                                if ( board.getBoard(0, j) == 0 && currentTile.charAt(2) != 'd') {
                                    System.out.println("Here4");
                                    return false;
                                }
                            }
                        }
                    }

                    // Check for a loop at the left edge of the board
                    if (col == 0 && currentTile.charAt(3) == 'd') {
                        // return false if there is an empty place within the board which is also not an edge.
                        for (int j = 1; j < 7; j++) {
                            for (int k = 1; k < 7; k++) {
                                if (board.getBoard(j, k) == 0) {
                                    return false;
                                }
                            }
                        }
                        // Also, check if the there is no other empty position on other edges where it can be placed
                        // Check on the top edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(0, j) == 0 && currentTile.charAt(0) != 'd') {
                                return false;
                            }
                        }
                        // Check on the right edge of the board
                        for (int j = 0; j < 8; j++) {
                            if ( j == 0 ) {
                                if ( board.getBoard(j, 7) == 0 ) {
                                    if ( currentTile.charAt(0) != 'd' && currentTile.charAt(0) != 'b' && currentTile.charAt(1) != 'd' && currentTile.charAt(1) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else if ( j == 7 ) {
                                if ( board.getBoard(j, 7) == 0 ) {
                                    if ( currentTile.charAt(1) != 'd' && currentTile.charAt(1) != 'b' && currentTile.charAt(2) != 'd' && currentTile.charAt(2) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else {
                                if ( board.getBoard(j, 7) == 0 && currentTile.charAt(2) != 'd') {
                                    System.out.println("Here4");
                                    return false;
                                }
                            }
                        }
                        // Check on the bottom edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(7, j) == 0 && currentTile.charAt(2) != 'd') {
                                return false;
                            }
                        }
                    }

                    // Check for a loop at the right edge of the board
                    if (col == 7 && currentTile.charAt(1) == 'd') {
                        // return false if there is an empty place within the board which is also not an edge.
                        for (int j = 1; j < 7; j++) {
                            for (int k = 1; k < 7; k++) {
                                if (board.getBoard(j, k) == 0) {
                                    return false;
                                }
                            }
                        }
                        // Also, check if the there is no other empty position on other edges where it can be placed
                        // Check on the top edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(0, j) == 0 && currentTile.charAt(0) != 'd') {
                                return false;
                            }
                        }
                        // Check on the left edge of the board
                        for (int j = 0; j < 8; j++) {
                            if ( j == 0 ) {
                                if ( board.getBoard(j, 0) == 0 ) {
                                    if ( currentTile.charAt(3) != 'd' && currentTile.charAt(3) != 'b' && currentTile.charAt(0) != 'd' && currentTile.charAt(0) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else if ( j == 7 ) {
                                if ( board.getBoard(j, 0) == 0 ) {
                                    if ( currentTile.charAt(2) != 'd' && currentTile.charAt(2) != 'b' && currentTile.charAt(3) != 'd' && currentTile.charAt(3) != 'c' ) {
                                        return false;
                                    }
                                }
                            } else {
                                if ( board.getBoard(j, 0) == 0 && currentTile.charAt(2) != 'd') {
                                    System.out.println("Here4");
                                    return false;
                                }
                            }
                        }
                        // Check on the bottom edge of the board
                        for (int j = 1; j < 7; j++) {
                            if ( board.getBoard(7, j) == 0 && currentTile.charAt(2) != 'd') {
                                return false;
                            }
                        }
                    }
                // }
            }

            // Check if the tile is placed at the corner of the board
            if ( ( row == 0 || row == 7 ) && ( col == 0 || col == 7 ) ) {
                // Check for a loop in the top right corner of the board
                if (row == 0 && col == 0 ) {
                    // Check for the track that connects neighbouring stations
                    if ((currentTile.charAt(0) == 'c')||(currentTile.charAt(3) == 'b')) {
                        // return true if it's the only place left for the tile on board
                        return board.getBoardTotal() == 59;
                    }
                    // Check for two loops present at this position
                    if ( currentTile.charAt(0) == 'd' && currentTile.charAt(3) == 'd' ) {
                        if ( i == 0 )
                            return false;
                        System.out.println("Here6");
                        return board.getBoardTotal() == 59;
                    }
                }

                // Check for a loop in the top right corner of the board
                if (row == 0 && col == 7 ) {
                    // Check for the track that connects neighbouring stations
                    if ( currentTile.charAt(0) == 'b' || currentTile.charAt(1) == 'c' ) {
                        // return true if it's the only place left for the tile on board
                        return board.getBoardTotal() == 59;
                    }
                    // Check for two loops present at this position
                    if ( currentTile.charAt(0) == 'd' && currentTile.charAt(1) == 'd' ) {
                        if ( i == 0 )
                            return false;
                        return board.getBoardTotal() == 59;
                    }
                }

                // Check for a loop in the bottom right corner of the board
                if (row == 7 && col == 7 ) {
                    // Check for the track that connects neighbouring stations
                    if ( currentTile.charAt(1) == 'b' || currentTile.charAt(2) == 'c' ) {
                        // return true if it's the only place left for the tile on board
                        return board.getBoardTotal() == 59;
                    }
                    // Check for two loops present at this position
                    if ( currentTile.charAt(1) == 'd' && currentTile.charAt(2) == 'd' ) {
                        if ( i == 0 )
                            return false;
                        return board.getBoardTotal() == 59;
                    }
                }

                // Check for a loop in the bottom left corner of the board
                if (row == 7 && col == 0 ) {
                    // Check for the track that connects neighbouring stations
                    if ( currentTile.charAt(2) == 'b' || currentTile.charAt(3) == 'c') {
                        // return true if it's the only place left for the tile on board
                        return board.getBoardTotal() == 59;
                    }
                    // Check for two loops present at this position
                    if ( currentTile.charAt(2) == 'd' && currentTile.charAt(3) == 'd' ) {
                        if (i == 0)
                            return false;
                        return board.getBoardTotal() == 59;
                    }
                }
            }

            // Check if the location is not an edge nor a corner or an edge for the central stations
            if ( row != 0 && row != 7 && col != 0 && col != 7 ) {
                t = 0;
                l = 0;
                r = 0;
                b = 0;

                // Check if the top position has a tile, if so then increment t to 1
                if ( board.getBoard(top_row, col) == 1 )
                    t = 1;
                // Check if the bottom position has a tile, if so then increment b to 1
                if ( board.getBoard(bottom_row, col) == 1 )
                    b = 1;
                // Check if the left position has a tile, if so then increment l to 1
                if ( board.getBoard(row, left_col) == 1 )
                    l = 1;
                // Check if the right position has a tile, if so then increment r to 1
                if ( board.getBoard(row, right_col) == 1 )
                    r = 1;

                // If none of the those position has a tile, then return false
                if ( t != 1 && b != 1 && l != 1 && r != 1 )
                    return false;
            }

            // if all the above conditions were matched then update this tile in board
            board.updateBoardPositions( tiles[i] );
        }
        // Return true if there is no error in the placementSequence, and it is a valid string
        return true;
    }

    /**
    @param piece is the tile that will be placed in a valid location
     to be valid it must be:
     - placed against one of the exterior stations or,
     - placed adjacent to another tile and,
     - cannot be placed in a way that it loops back to the same station it came from unless there is no other way to place the tile
     @return a tile placement string (e.g. dacd07)
     */
    public static String generateValidMove(String[] tiles, String piece) {
        // if there are no placed tiles then generate the first possible move that doesn't break the length 1 rule
        if (tiles.length == 0) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (!isInvalid(piece, i, j)) return (piece + i + j);
                }
            }
        }
        // iterates through rows
        for (int i = 0; i < 8; i++) {
            //iterates through columns (each member of each row)
            outer: for (int j = 0; j < 8; j++) {
                if (isInvalid(piece, i,j)) {
                    continue;
                }
                for (String tile : tiles) {
                    // if there is a tile there then break the loop
                    if (tile.charAt(4) - 48 == i && tile.charAt(5) - 48 == j) continue outer;
                }
                return (piece + i + j);
            }
        }
        // if the program gets to this point (i.e. it hasn't been able to find a valid move) and the board is
        // not full then we should place a tile even if it violates the length 1 rule.
        if (tiles.length != 60) {
            for (int i = 0; i < 8; i++) {
                outer1: for (int j = 0; j < 8; j++) {
                    if (atMiddle(i,j)) continue;
                    for (String tile : tiles) {
                        // if there is a tile there then break the loop
                        if (tile.charAt(4) - 48 == i && tile.charAt(5) - 48 == j) continue outer1;
                    }
                    return (piece + i + j);
                }
            }
        }
        return "No valid moves left";
    }

    /**
     * Determines if a piece is invalidly going into a station based on its location
     * OR, if a piece is invalid because it is on top of a middle station
    */
    public static boolean isInvalid(String piece, int posY, int posX) {
        // check if on top of middle stations
        if ( atMiddle(posY, posX) )
            return true;

        // check corners
        if ((posY == 0 && posX == 0) && (piece.charAt(0) == 'c' || piece.charAt(3) == 'b')) return true;
        else if ((posY == 0 && posX == 7) && (piece.charAt(1) == 'c' || piece.charAt(0) == 'b')) return true;
        else if ((posY == 7 && posX == 0) && (piece.charAt(3) == 'c' || piece.charAt(2) == 'b')) return true;
        else if ((posY == 7 && posX == 7) && (piece.charAt(2) == 'c' || piece.charAt(1) == 'b')) return true;

        // check edges
        else if (posY == 0 && piece.charAt(0) == 'd') return true;
        else if (posY == 7 && piece.charAt(2) == 'd') return true;
        else if (posX == 0 && piece.charAt(3) == 'd') return true;
        else return (posX == 7 && piece.charAt(1) == 'd');
    }

    // Checks if a piece is invalid because it is on top of a middle station
    public static boolean atMiddle (int posY, int posX) {
        // check if on top of middle stations
        if (posY == 3 && (posX == 3 || posX == 4)) return true;
        else return (posY == 4 && (posX == 3 || posX == 4));
    }
}

