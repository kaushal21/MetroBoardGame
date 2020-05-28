package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import comp1110.ass2.OpponentAI;
import comp1110.ass2.Player;
import comp1110.ass2.Tile;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

// Authorship: Kaushal Sharma, Kyle Robertson, Tom Stephens

public class CreatingBoard extends Application{
    Group root = new Group();                               // Container for the scene
    String placementSequence;
    Group board = new Group();                              // Holds all the elements on the board
    ArrayList<Label> boxes = new ArrayList<>();             // Holds all the positions in the grid i.e. 8x8 boxes
    private static final int SQUARE_SIZE = 75;
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    double mouseOffsetX;                                    // Stores the X offset location for the draggable option
    double mouseOffsetY;                                    // Stores the Y offset location for the draggable option
    int temp_i, temp_j;
    Label highlighted = null;                               // Stores the label that is highlighted
    Player player;                                          // Get the no. of players
    int noOfPlayers;
    int noOfAIs;
    ImageView deckImage = new ImageView();                  // Image for the top of Deck
    Label deckTileName;                                     // Label for the top of Deck
    ImageView playerImage = new ImageView();                // Image for the tile in players hand
    Label playerTileName;                                   // Label for the tile in players hand
    Label playerName = new Label();                         // Current Player's Name
    int CurrentPlayer = Player.getCurrentPlayer();
    int playerNums = 0;
    Label playerScore1 = new Label();
    Label playerScore2 = new Label();
    Label playerScore3 = new Label();
    Label playerScore4 = new Label();
    Label playerScore5 = new Label();
    Label playerScore6 = new Label();
    int [] scorePlayers;


    // Create a new variable of Tile that hold a new random Deck and its top location
    Tile newDeck = new Tile();
    String topOfDeck = newDeck.pop();                       // Stores the top of Deck

    /**
     * createBoard function creates initial stage of the board.
     * This creates a grid of size 10x10.
     * It displays the stations at the edges and at the center and Metro sign at all the corners.
     * All the items/elements/tiles are stored at a particular location using setLayout
     */
    void createBoard() throws FileNotFoundException {
        int startLocation;                                      // Stores the starting number of the station

        // Add and Store all the corner images i.e. Metro.jpg on the board
        String cornerLocation = "src/comp1110/ass2/gui/assets/tile_back_cover.jpg";
        ImageView cornerImageView1 = createImage(cornerLocation, 0);
        cornerImageView1.setLayoutX(0);
        cornerImageView1.setLayoutY(0);
        ImageView cornerImageView2 = createImage(cornerLocation, 0);
        cornerImageView2.setLayoutX(SQUARE_SIZE * 9);
        cornerImageView2.setLayoutY(0);
        ImageView cornerImageView3 = createImage(cornerLocation, 0);
        cornerImageView3.setLayoutX(0);
        cornerImageView3.setLayoutY(SQUARE_SIZE * 9);
        ImageView cornerImageView4 = createImage(cornerLocation, 0);
        cornerImageView4.setLayoutX(SQUARE_SIZE * 9);
        cornerImageView4.setLayoutY(SQUARE_SIZE * 9);
        board.getChildren().addAll(cornerImageView1, cornerImageView2, cornerImageView3, cornerImageView4);

        // Store all the top edge, that are station on the board i.e. from Station 1 to 8.
        // Take an image, set its location using setLayoutX and setLayoutY and add it to the board
        startLocation = 8;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 180);
            imageView.setLayoutX(SQUARE_SIZE +(SQUARE_SIZE*i));
            imageView.setLayoutY(0);
            board.getChildren().add(imageView);
            startLocation--;
        }

        // Store all the top edge, that are station on the board i.e. from Station 9 to 16.
        startLocation = 9;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 90);
            imageView.setLayoutX(0);
            imageView.setLayoutY(SQUARE_SIZE+(SQUARE_SIZE*i));
            board.getChildren().add(imageView);
            startLocation++;
        }

        // Store all the top edge, that are station on the board i.e. from Station 17 to 24.
        startLocation = 17;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 0);
            imageView.setLayoutX(SQUARE_SIZE+(SQUARE_SIZE*i));
            imageView.setLayoutY(SQUARE_SIZE * 9);
            board.getChildren().add(imageView);
            startLocation++;
        }

        // Store all the top edge, that are station on the board i.e. from Station 25 to 32.
        startLocation = 32;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 270);
            imageView.setLayoutX(SQUARE_SIZE * 9);
            imageView.setLayoutY(SQUARE_SIZE+(SQUARE_SIZE*i));
            board.getChildren().add(imageView);
            startLocation--;
        }

        // Store the GridCell where the tile will be inserted
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                // Create a new Label which stores the location and the color.
                Label gridCell = new Label();
                // Set the text of this new Label to the location in the grid i.e. (j-1, i-1)
                gridCell.setText("("+(j)+", "+(i)+")");

                // Set the Background color of the grid. This creates a chess board type of color effect.
                if ( i % 2 == 0 ) {
                    if (j % 2 == 0)
                        gridCell.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        gridCell.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                } else {
                    if ( j % 2 == 1 )
                        gridCell.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        gridCell.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                }

                // Set the minimum Width and Height for the label.
                gridCell.setMinWidth(SQUARE_SIZE);
                gridCell.setMinHeight(SQUARE_SIZE);

                gridCell.setTextFill(Color.rgb(255, 255, 255));                 // Set the Text Color to White
                gridCell.setFont(Font.font("Arial", 15));                           // Set Font Family to "Arial" and Font size to 12px
                gridCell.setAlignment(Pos.CENTER);                                       // Set Center Alignment for the Label
                gridCell.setLayoutX(SQUARE_SIZE+(SQUARE_SIZE*i));
                gridCell.setLayoutY(SQUARE_SIZE+(SQUARE_SIZE*j));
                board.getChildren().add(gridCell);
                boxes.add(gridCell);                                                    // Add this gridcell to boxes for draggable function
            }
        }

        // Store all the central stations on the board.
        String centralLocation = "src/comp1110/ass2/gui/assets/centre_station.jpg";
        ImageView centerImageView1 = createImage(centralLocation, 270);
        centerImageView1.setLayoutX(SQUARE_SIZE * 4);
        centerImageView1.setLayoutY(SQUARE_SIZE * 4);
        ImageView centerImageView2 = createImage(centralLocation, 0);
        centerImageView2.setLayoutX(SQUARE_SIZE * 5);
        centerImageView2.setLayoutY(SQUARE_SIZE * 4);
        ImageView centerImageView3 = createImage(centralLocation, 180);
        centerImageView3.setLayoutX(SQUARE_SIZE * 4);
        centerImageView3.setLayoutY(SQUARE_SIZE * 5);
        ImageView centerImageView4 = createImage(centralLocation, 90);
        centerImageView4.setLayoutX(SQUARE_SIZE * 5);
        centerImageView4.setLayoutY(SQUARE_SIZE * 5);
        board.getChildren().addAll(centerImageView1, centerImageView2, centerImageView3, centerImageView4);

        // Store the only static label on the right side of the board
        // Create a Label named "DECK" and apply all the properties.
        Label deckName = new Label("DECK");
        deckName.setMinWidth(250);                                          // Set Minimum Width
        deckName.setAlignment(Pos.CENTER);                                  // Set Alignment to Center
        deckName.setFont(Font.font("Arial", 20));                      // Set Font of the Text
        deckName.setTextFill(Color.BLACK);                                  // Set Color of the Text
        deckName.setPadding(new Insets(0, 0, 10, 0));          // Set Padding for the Label
        deckName.setLayoutX((SQUARE_SIZE * 10) + (12));
        deckName.setLayoutY(0);
        Label score = new Label ("Player Scores:");
        score.setMinWidth(250);                                          // Set Minimum Width
        score.setAlignment(Pos.CENTER);                                  // Set Alignment to Center
        score.setFont(Font.font("Arial", 15));                      // Set Font of the Text
        score.setTextFill(Color.BLACK);                                  // Set Color of the Text
        score.setPadding(new Insets(0, 0, 10, 0));          // Set Padding for the Label
        score.setLayoutX((SQUARE_SIZE * 10) + (12));
        score.setLayoutY(475);

        playerNums = noOfPlayers;
        //Label playerScore1 = new Label("1");
        scorePlayers = Metro.getScore(placementSequence,playerNums);
        //playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
        playerScore1.setMinWidth(250);                                          // Set Minimum Width
        playerScore1.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore1.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore1.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore1.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore1.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore1.setLayoutY(500);

        //playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
        playerScore2.setMinWidth(250);                                          // Set Minimum Width
        playerScore2.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore2.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore2.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore2.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore2.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore2.setLayoutY(525);

        //playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
        playerScore3.setMinWidth(250);                                          // Set Minimum Width
        playerScore3.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore3.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore3.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore3.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore3.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore3.setLayoutY(550);

        //playerScore4.setText("Player 4's Score: " + scorePlayers[3]);
        playerScore4.setMinWidth(250);                                          // Set Minimum Width
        playerScore4.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore4.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore4.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore4.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore4.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore4.setLayoutY(575);

        //playerScore5.setText("Player 5's Score: " + scorePlayers[4]);
        playerScore5.setMinWidth(250);                                          // Set Minimum Width
        playerScore5.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore5.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore5.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore5.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore5.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore5.setLayoutY(600);

        //playerScore6.setText("Player 6's Score: " + scorePlayers[5]);
        playerScore6.setMinWidth(250);                                          // Set Minimum Width
        playerScore6.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
        playerScore6.setFont(Font.font("Arial", 15));                     // Set Font of the Text
        playerScore6.setTextFill(Color.BLACK);                                  // Set Color of the Text
        playerScore6.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
        playerScore6.setLayoutX((SQUARE_SIZE * 10) + (12));
        playerScore6.setLayoutY(625);

        /*Button finishScreen = new Button("Finish Screen");
        finishScreen.setOnMouseClicked(actionEvent -> {

        } */


        switch (playerNums){
            case 2:
                playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                board.getChildren().addAll(playerScore1,playerScore2);
                break;
            case 3:
                playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                board.getChildren().addAll(playerScore1,playerScore2,playerScore3);
                break;
            case 4:
                playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                playerScore3.setText("Player 4's Score: " + scorePlayers[3]);
                board.getChildren().addAll(playerScore1,playerScore2,playerScore3,playerScore4);
                break;
            case 5:
                playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                playerScore4.setText("Player 4's Score: " + scorePlayers[3]);
                playerScore5.setText("Player 5's Score: " + scorePlayers[4]);
                board.getChildren().addAll(playerScore1,playerScore2,playerScore3,playerScore4,playerScore5);
                break;
            case 6:
                playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                playerScore4.setText("Player 4's Score: " + scorePlayers[3]);
                playerScore5.setText("Player 5's Score: " + scorePlayers[4]);
                playerScore6.setText("Player 6's Score: " + scorePlayers[5]);
                board.getChildren().addAll(playerScore1,playerScore2,playerScore3,playerScore4,playerScore5,playerScore6);
                break;
        }

        board.getChildren().addAll(deckName,score); 
    }

    /**
     * This function returns a rotated image of size SQUARE_SIZE with the specified degree
     * @param imageLocation this is the location of the image i.e. File Path.
     * @param rotation This indicates the degree by which the images needs to be rotated.
     * @return It returns the image at the given location which is rotated by the specified degree.
     * @throws FileNotFoundException, this exception is thrown if the image is not present at the that location.
     */
    ImageView createImage(String imageLocation, int rotation) throws FileNotFoundException {
        FileInputStream fileLocation = new FileInputStream(imageLocation);          // Read the file from that location
        Image image = new Image(fileLocation);                                      // Create a image
        ImageView imageView = new ImageView(image);                                 // Get the ImageView from the image
        imageView.setPreserveRatio(true);                                           // To preserve the image ratio
        imageView.setFitHeight(SQUARE_SIZE);                                        // set Image's Height
        imageView.setFitWidth(SQUARE_SIZE);                                         // set Image's Width
        imageView.setRotate(rotation);                                              // Rotate the image by specified degree
        return imageView;                                                           // Return the ImageView that we created
    }

    /**
     * This function updates the board with the new added tile.
     * @param tile It is the String that hold the new tile that is needed to be placed on the board.
     * @param row It is the row where the new tile is to be inserted.
     * @param col It is the column where the new tile is to be inserted.
     * @throws FileNotFoundException Throws this exception if the image of the tile is not found.
     */
    void updateBoard(String tile, int row, int col) throws FileNotFoundException {
        // Find the tile and store its location
        String tileLocation = "src/comp1110/ass2/gui/assets/"+tile+".jpg";
        // Create the image from the location using the create Image() function
        ImageView tileView = createImage(tileLocation, 0);
        tileView.setLayoutX(SQUARE_SIZE+(SQUARE_SIZE*row));
        tileView.setLayoutY(SQUARE_SIZE+(SQUARE_SIZE*col));

        // Store the image at the given location
        board.getChildren().add(tileView);
    }

    /**
     * Draw a placement in the window
     * @param placement A valid placement string
     */
    void makePlacement(String placement) throws FileNotFoundException {
        // FIXME Task 4: implement the simple placement viewer
        String tile = placement.substring(0, 4);
        int row = Integer.parseInt(String.valueOf(placement.charAt(4)));
        int col = Integer.parseInt(String.valueOf(placement.charAt(5)));
        updateBoard(tile, row, col);
        placementSequence += placement;
    }

    /**
     * This is the Right side of the scene which displays the Deck
     * It display 3 Things:
     * 1.> A String "DECK"
     * 2.> deckImage - a global Image variable that stores image of topOfDeck
     * 3.> deckTileName - a global Label that stores the string value of topOfDeck
     * @param topOfDeck It is the top of Deck
     * @throws FileNotFoundException if there is no image found
     */
    public void deckLocation(String topOfDeck) throws FileNotFoundException {
        // Store in deckImage the image for the topOfDeck
        String topLocation = "src/comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
        deckImage = createImage(topLocation, 0);
        deckImage.setFitHeight(SQUARE_SIZE*2);                          // Set Minimum Height
        deckImage.setFitWidth(SQUARE_SIZE*2);                           // Set Minimum Width
        int paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
        deckImage.setLayoutX(paddingLeft);
        deckImage.setLayoutY(30);
        board.getChildren().add(deckImage);

        // Store in deckTileName the String value of the tile that is at the top of the deck.
        deckTileName = new Label(topOfDeck);                            // Store the name of the topOfDeck
        deckTileName.setMinWidth(250);                                  // Set Minimum Width
        deckTileName.setAlignment(Pos.CENTER);                          // Set Alignment Center
        deckTileName.setFont(Font.font("Arial", 15));             // Set Font of Text
        deckTileName.setTextFill(Color.BLACK);                          // Set Color of Text
        deckTileName.setPadding(new Insets(0, 0, 10, 0));  // Set Padding for the Label
        paddingLeft = (SQUARE_SIZE * 10) + (12);
        int paddingTop = (SQUARE_SIZE*2) + (30) + (10);
        deckTileName.setLayoutX(paddingLeft);
        deckTileName.setLayoutY(paddingTop);
        board.getChildren().add(deckTileName);

        // Call draggable class on the deckImage.
        draggable(deckImage, deckTileName, "deck",(SQUARE_SIZE * 10) + (12) + (50), 30);
    }

    /**
     * This is the Right side of the scene which displays the Players and the tile in their hand
     * @throws FileNotFoundException if there is no image found
     */
    public void playerLocation() throws FileNotFoundException {
        // Store in playerName the player's Name
        playerName = new Label("Player "+(Player.getCurrentPlayer() + 1));
        playerName.setMinWidth(250);                                        // Set Minimum Width
        playerName.setAlignment(Pos.CENTER);                                // Set Alignment to center
        playerName.setFont(Font.font("Arial", 20));                   // Set the Font of Text
        playerName.setTextFill(Color.BLACK);                                // Set the Color of Text
        playerName.setPadding(new Insets(0, 0, 10, 0));       // Set the Padding for Label
        int paddingLeft = (SQUARE_SIZE * 10) + (12);
        int paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50);
        playerName.setLayoutX(paddingLeft);
        playerName.setLayoutY(paddingTop);
        board.getChildren().add(playerName);


        // Check if the player already holds any tile in his/her hands and create label for it
        String tileInHand = player.getTileInHand(CurrentPlayer);
        if (tileInHand != null) {
            // The player already has a tile in his/her hand
            // Store in playerImage the tile Image
            String playersHandTileLocation = "src/comp1110/ass2/gui/assets/" + tileInHand + ".jpg";
            playerImage = createImage(playersHandTileLocation, 0);
            playerImage.setFitHeight(SQUARE_SIZE*2);                    // Set Minimum Height
            playerImage.setFitWidth(SQUARE_SIZE*2);                     // Set Minimum Width
            paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
            paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50) + (30);
            playerImage.setLayoutX(paddingLeft);
            playerImage.setLayoutY(paddingTop);
            board.getChildren().add(playerImage);

            // Store in playerTileName the Label of the tile in players hand
            playerTileName = new Label(tileInHand);
            playerTileName.setMinWidth(250);                            // Set Minimum Width
            playerTileName.setFont(Font.font("Arial", 15));       // Set Font of Text
            playerTileName.setTextFill(Color.BLACK);                    // Set the Color of Text
            playerTileName.setAlignment(Pos.CENTER);                    // Set Alignment to Center
            paddingLeft = (SQUARE_SIZE * 10) + (12);
            paddingTop = (30) + (SQUARE_SIZE*2) + (10) + (50) + (30) + (SQUARE_SIZE*2) + (10);
            playerTileName.setLayoutX(paddingLeft);
            playerTileName.setLayoutY(paddingTop);
            board.getChildren().add(playerTileName);

            // Call the Draggable function on the playerImage.
            draggable(playerImage, playerTileName, "player",(SQUARE_SIZE * 10) + (12) + (50), (SQUARE_SIZE*2) + (30) + (10) + (50) + (30));

        } else {
            // Create Label for empty Image that indicates player's hand is empty
            Label playersHandTileView = new Label();
            playersHandTileView.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
            playersHandTileView.setMinHeight(SQUARE_SIZE*2);
            playersHandTileView.setMinWidth(SQUARE_SIZE*2);
            paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
            paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50) + (30);
            playersHandTileView.setLayoutX(paddingLeft);
            playersHandTileView.setLayoutY(paddingTop);
            board.getChildren().add(playersHandTileView);

            // Creating a Button to select a new tile to put in players hand
            Button noTileInHand = new Button("Pick Up Tile");
            noTileInHand.setFont(Font.font("Arial", 15));
            noTileInHand.setTextFill(Color.BLACK);
            noTileInHand.setMinWidth(250);
            noTileInHand.setAlignment(Pos.CENTER);
            paddingLeft = (SQUARE_SIZE * 10) + (12);
            paddingTop = (30) + (SQUARE_SIZE*2) + (10) + (50) + (30) + (SQUARE_SIZE*2) + (10);
            noTileInHand.setLayoutX(paddingLeft);
            noTileInHand.setLayoutY(paddingTop);
            board.getChildren().add(noTileInHand);

            // Creating a click event on the button.
            // If the button is pressed then the top of deck is selected as the player's hand
            noTileInHand.setOnMouseClicked(actionEvent -> {
                // Set the tile in players hand to the top of deck
                player.setTileInHand(CurrentPlayer, topOfDeck);
                // Pop a new tile from the deck to be the top of the deck
                topOfDeck = newDeck.pop();

                // Display the topOfDeck back on the screen
                String topLocation2 = "comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
                deckImage.setImage(new Image(topLocation2));
                deckTileName.setText(topOfDeck);

                // Remove the empty image and the button from the screen
                board.getChildren().remove(playersHandTileView);
                board.getChildren().remove(noTileInHand);

                // Get the tile from player's hand
                String newTileInHand = player.getTileInHand(CurrentPlayer);
                // Store in playerImage the image of this new tile in hand
                String playersHandTileLocation = "src/comp1110/ass2/gui/assets/" + newTileInHand + ".jpg";
                playerImage = null;
                try {
                    playerImage = createImage(playersHandTileLocation, 0);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                playerImage.setFitHeight(SQUARE_SIZE*2);                        // Set Minimum Height
                playerImage.setFitWidth(SQUARE_SIZE*2);                         // Set Minimum Width
                playerImage.setLayoutX((SQUARE_SIZE * 10) + (12) + (50));
                playerImage.setLayoutY((SQUARE_SIZE*2) + (30) + (10) + (50) + (30));
                board.getChildren().add(playerImage);

                // Store in playerTileName the Label of the tile in the hand
                playerTileName = new Label(newTileInHand);
                playerTileName.setFont(Font.font("Arial", 15));                // Set Font of Text
                playerTileName.setTextFill(Color.BLACK);                            // Set Color of Tesx
                playerTileName.setMinWidth(250);                                    // Set Minimum Width
                playerTileName.setAlignment(Pos.CENTER);                            // Set Alignment to Center
                playerTileName.setLayoutX((SQUARE_SIZE * 10) + (12));
                playerTileName.setLayoutY((30) + (SQUARE_SIZE*2) + (10) + (50) + (30) + (SQUARE_SIZE*2) + (10));
                board.getChildren().add(playerTileName);

                // Call Draggable function on the playerImage
                draggable(playerImage, playerTileName,"player",(SQUARE_SIZE * 10) + (12) + (50), (SQUARE_SIZE*2) + (30) + (10) + (50) + (30));
            });
        }
    }

    /**
     * @return true if the game is over, otherwise it returns false
     */
    boolean gameOver () {
        return !newDeck.checkDeckNonEmpty();
    }

    public void draggable(ImageView tileView, Label labelText, String passedBy, int X, int Y) {
        String tile = labelText.getText();                          // Get the String of the Tile form the Label

        // For Mouse Pressed on the Image
        // Get the Offset of the tile and reduce the width and the height of the image half
        tileView.setOnMousePressed(event -> {
            mouseOffsetX = tileView.getLayoutX() - event.getSceneX();
            mouseOffsetY = tileView.getLayoutY() - event.getSceneY();
            tileView.setFitHeight(SQUARE_SIZE);
            tileView.setFitWidth(SQUARE_SIZE);
        });

        // For dragging the tile around the screen
        tileView.setOnMouseDragged(event -> {
            // Set the Layout of the Image
            tileView.setLayoutX(event.getSceneX() + mouseOffsetX);
            tileView.setLayoutY(event.getSceneY() + mouseOffsetY);

            // Find the Closest Label using this function
            Label closest = findClosestLabel(tileView);

            // Get the location of the closest Label
            double locationX = (closest.getLayoutX() / SQUARE_SIZE) - 1;
            double locationY = (closest.getLayoutY() / SQUARE_SIZE) - 1;

            // Create a Temporary Placement String and PlacementSequence to check placement validity
            String placement = tile + (int) locationX + (int) locationY;
            String tempPlacementSequence = placementSequence + placement;

            // Check highlighted Label
            if (highlighted != null) {
                // If new closest is different from the highlighted then revert back the color of the Label
                temp_i = (int) (highlighted.getLayoutX() / SQUARE_SIZE) - 1;
                temp_j = (int) (highlighted.getLayoutY() / SQUARE_SIZE) - 1;
                if (temp_i % 2 == 0) {
                    if (temp_j % 2 == 0)
                        highlighted.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        highlighted.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                } else {
                    if (temp_j % 2 == 1)
                        highlighted.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        highlighted.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                }
            }
            // Check if the placement is valid
            if (Metro.isPlacementSequenceValid(tempPlacementSequence)) {
                // If yes, the change color of closest and update the highlighted
                closest.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                highlighted = closest;
            } else {
                // Otherwise keep highlighted as null
                highlighted = null;
            }
        });

        // For released mouse
        tileView.setOnMouseReleased(event -> {
            // Get the location of the Image on the Scene
            double locX = tileView.getLayoutX();
            double locY = tileView.getLayoutY();

            // Check if the image is between the place able grid or not.
            if (locX >= 70 && locX <= 630 && locY >= 70 && locY <= 630) {
                // Find the closest Label form the grid using this function
                Label closest = findClosestLabel(tileView);

                // Get the location of the closest Label
                double locationX = (closest.getLayoutX() / SQUARE_SIZE) - 1;
                double locationY = (closest.getLayoutY() / SQUARE_SIZE) - 1;

                // Create a new placement string and placementSequence
                String placement = tile + ((int) locationX) + ((int) locationY);
                String tempPlacementSequence = placementSequence + placement;

                // Check if the placementSequence is valid or not
                if (Metro.isPlacementSequenceValid(tempPlacementSequence)) {
                    try {
                        makePlacement(placement);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    // If passed by deck then update the top of Deck by popping from newDeck
                    if (passedBy.equals("deck")) {
                        topOfDeck = newDeck.pop();
                    }

                    // If passed by the player the empty player's hand
                    if (passedBy.equals("player")) {
                        player.setTileInHand(CurrentPlayer, null);
                    }

                    scorePlayers = Metro.getScore(placementSequence,playerNums);
                    System.out.println(CurrentPlayer);

                    switch (CurrentPlayer){
                        case 0:
                            playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                            break;
                        case 1:
                            playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                            break;
                        case 2:
                            playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                            break;
                        case 3:
                            playerScore4.setText("Player 4's Score: " + scorePlayers[3]);
                            break;
                        case 4:
                            playerScore5.setText("Player 5's Score: " + scorePlayers[4]);
                            break;
                        case 5:
                            playerScore6.setText("Player 6's Score: " + scorePlayers[5]);
                            break;
                    }

                    //playerImage.setImage(null);                                 // Set playerImage to null
                    //playerTileName.setText(null);                               // Set playerTileName to null
                    board.getChildren().removeAll(deckImage, deckTileName);     // Remove deckImage and deckTileName form board
                    board.getChildren().remove(playerName);                     // Remove playerName from board
                    board.getChildren().remove(playerImage);                    // Remove playerImage from board
                    board.getChildren().remove(playerTileName);                 // Remove playerTileName from board
                    CurrentPlayer = player.switchTurn();                        // Switch player and store it in CurrentPlayer

                    // if currentPlayer is an AI, place a tile at random
                    if (CurrentPlayer >= noOfPlayers - noOfAIs) {
                        try {
                            for (int i = 0; i < noOfAIs; i++) {
                                makePlacement(OpponentAI.randomBotMove(placementSequence, topOfDeck));

                                switch (CurrentPlayer){
                                    case 0:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore1.setText("Player 1's Score: " + scorePlayers[0]);
                                        break;
                                    case 1:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore2.setText("Player 2's Score: " + scorePlayers[1]);
                                        break;
                                    case 2:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore3.setText("Player 3's Score: " + scorePlayers[2]);
                                        break;
                                    case 3:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore4.setText("Player 4's Score: " + scorePlayers[3]);
                                        break;
                                    case 4:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore5.setText("Player 5's Score: " + scorePlayers[4]);
                                        break;
                                    case 5:
                                        scorePlayers = Metro.getScore(placementSequence,playerNums);
                                        playerScore6.setText("Player 6's Score: " + scorePlayers[5]);
                                        break;
                                }
                                topOfDeck = newDeck.pop();
                                String topLocation2 = "comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
                                tileView.setImage(new Image(topLocation2));                             // Update the image for topOfDeck
                                labelText.setText(topOfDeck);                                           // Update the Label using the String of top of deck
                                CurrentPlayer = player.switchTurn();
                            }


                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }

                    // Call the deckLocation and playerLocation for the next Round
                    try {
                        deckLocation(topOfDeck);
                        playerLocation();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    // The move was not valid, generate an Alert
                    System.out.println(tempPlacementSequence);
                    AlertBox.alertBox("Please enter a valid placement string");
                }
            } else {
                // If the Image is dropped outside the board i.e. our 8x8 gameBoard
                // Check for the highlighted Label, and revert it back to its original color
                if (highlighted != null) {
                    temp_i = (int) (highlighted.getLayoutX() / SQUARE_SIZE) - 1;
                    temp_j = (int) (highlighted.getLayoutY() / SQUARE_SIZE) - 1;
                    if (temp_i % 2 == 0) {
                        if (temp_j % 2 == 0)
                            highlighted.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                        else
                            highlighted.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                    } else {
                        if (temp_j % 2 == 1)
                            highlighted.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
                        else
                            highlighted.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
                    }
                }
            }

            // Place back the tile to the location from where it came from
            tileView.setLayoutX(X);
            tileView.setLayoutY(Y);
            tileView.setFitWidth(SQUARE_SIZE * 2);                                  // Increase the Width as double
            tileView.setFitHeight(SQUARE_SIZE * 2);                                 // Increase the Height as double
            String topLocation2 = "comp1110/ass2/gui/assets/" + tile + ".jpg";
            tileView.setImage(new Image(topLocation2));                             // Update the tile as the Image
            labelText.setText(tile);                                                // Update the Label to the String
        });
    }

    /**
     * Find the closest distance between the image and the array of labels
     * @param tile the image from which we want to find the minimum distance
     * @return returns the label that is closest to the image
     */
    Label findClosestLabel(ImageView tile) {
        Label closest = new Label();                                // Will store the closest label
        double closetDistance = Double.MAX_VALUE;                   // Stores the minimum distance for each label

        // For each position in the grid
        for(Label t: boxes) {
            // Get the location of the box
            double dx = t.getLayoutX();
            double dy = t.getLayoutY();

            // Calculate their distance form the tile
            double distanceX = dx - tile.getLayoutX();
            double distanceY = dy - tile.getLayoutY();

            // Calculate the distance using Manhattan Distance
            double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

            // If the distance is smaller then the closestDistance then this label is the closer to the tile
            if ( closetDistance > distance ) {
                closest = t;
                closetDistance = distance;
            }
        }
        return closest;                                             // return the closest Label
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Board");

        // Get the number of players from the user using getPlayer() function.
        int[] temp = GetPlayers.getPlayers();
        noOfPlayers = temp[0];
        noOfAIs = temp[1];

        // Create a new variable of Player that hold all the functionality of a player.
        System.out.println(noOfPlayers);
        player = new Player(noOfPlayers);


        placementSequence = "";

        // Create a new Grid. i.e. the initial stage of the board
        createBoard();

        // Call the function to get the right side and the game moving
        deckLocation(topOfDeck);
        playerLocation();

        root.getChildren().add(board);

        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }
}
