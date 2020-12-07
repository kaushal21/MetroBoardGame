package metroGame;

/**
 * This class represents the Board in the Metro game.
 * The board of the metro game can be divided into the given coordinates.
 * +-----(0,0)-----(0,1)--(0,2)--(0,3)--(0,4)--(0,5)--(0,6)--(0,7)--(0,8)-----(0,9)-----+
 * +------------------------------------------------------------------------------------+
 * +-----(1,0)-----(1,1)--(1,2)--(1,3)--(1,4)--(1,5)--(1,6)--(1,7)--(1,8)-----(1,9)-----+
 * +-----(2,0)-----(2,1)--(2,2)--(2,3)--(2,4)--(2,5)--(2,6)--(2,7)--(2,8)-----(2,9)-----+
 * +-----(3,0)-----(3,1)--(3,2)--(3,3)--(3,4)--(3,5)--(3,6)--(3,7)--(3,8)-----(3,9)-----+
 * +-----(4,0)-----(4,1)--(4,2)--(4,3)--(S.T.A.T.N.)--(4,6)--(4,7)--(4,8)-----(4,9)-----+
 * +-----(5,0)-----(5,1)--(5,2)--(5,3)--(S.T.A.T.N.)--(5,6)--(5,7)--(5,8)-----(5,9)-----+
 * +-----(6,0)-----(6,1)--(6,2)--(6,3)--(6,4)--(6,5)--(6,6)--(6,7)--(6,8)-----(6,9)-----+
 * +-----(7,0)-----(7,1)--(7,2)--(7,3)--(7,4)--(7,5)--(7,6)--(7,7)--(7,8)-----(7,9)-----+
 * +-----(8,0)-----(8,1)--(8,2)--(8,3)--(8,4)--(8,5)--(8,6)--(8,7)--(8,8)-----(8,9)-----+
 * +------------------------------------------------------------------------------------+
 * +-----(9,0)-----(9,1)--(9,2)--(9,3)--(9,4)--(9,5)--(9,6)--(9,7)--(9,8)-----(9,9)-----+
 */
public class Board {
    int[][] board;                      // A binary array that store 1 if the tile is present at that location, otherwise 0
    int boardTotal;                     // It stores how many tiles are placed on the board.

    /**
     * Initialize the board with null values for all the positions.
     * For central positions the values are set to -1.
     */
    public Board() {
        // Create a board of size 8x8 and initialize it with 0
        board = new int[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }

        // Update the central station's location as -1.
        board[3][3] = -1;
        board[3][4] = -1;
        board[4][3] = -1;
        board[4][4] = -1;

        // Initialize the total count in the board as 0.
        boardTotal = 0;
    }

    /**
     * @param row The row number for which we want the value
     * @param col The column number for which we want the value
     * @return The board value for the given location i.e. is there a tile placed at that location.
     */
    public int getBoard (int row, int col) {
        return board[row][col];
    }

    /**
     * @return The total tiles placed on the board
     */
    public int getBoardTotal () {
        return boardTotal;
    }

    /**
     * It updates the board for the passed tile by placing it on the board
     * @param placement it the tile that we need to place on the board
     */
    public void updateBoardPositions ( String placement ) {
        // Get the location of from the placement
        int row = Integer.parseInt(String.valueOf(placement.charAt(4)));
        int col = Integer.parseInt(String.valueOf(placement.charAt(5)));

        // Update the board for this location
        board[row][col] = 1;
        // Increment the total board count by 1
        boardTotal += 1;
    }

}
