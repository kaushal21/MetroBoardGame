##D2E

comments:

It is appropriate to store the station allocation information in the Player class. You made a good choice of using switch statements.
The code in the Viewer class, which implements the clicking and placing function, works well.

You wrote tests for your code in the Player class, which checks whether the stations are correctly allocated. 
It is nice that you provide error messages in your tests. The test should have a better code coverage, it only tests for the cases with 2 players and 3 players.

I suggest that you put tests written for different functions in different test classes and properly name the classes. 
The name "OurTest" carries little information. 

##