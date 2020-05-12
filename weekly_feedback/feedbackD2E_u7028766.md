##D2E

comments:

Your code in the isPlacementSequenceValid() method in Move class is well-formatted and well-commented, which well contributes to task 6. 
It might be better to break down the code into different helper methods, as the method looks a bit lengthy.
The code below could be reduced to one if statement.
                
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
           
It is nice that you add error messages to the test you wrote. I suggest that you put tests written for different functions in different test classes and properly name the classes. 
The name "OurTest" carries little information. 


##