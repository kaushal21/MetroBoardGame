package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import comp1110.ass2.Player;
import comp1110.ass2.Tile;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * A very simple viewer for piece placements in the Metro game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various piece
 * placements.
 */
public class Viewer extends Application {
    /* board layout */
    private static final int SQUARE_SIZE = 70;
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    private TextField textField;

    // Create a new variable of Tile that hold a new random Deck and its top location
    Tile newDeck = new Tile();

    // Create a new GridPane object that will hold the board.
    GridPane newBoard;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) throws FileNotFoundException {
        // FIXME Task 4: implement the simple placement viewer
        if (!Metro.isPiecePlacementWellFormed(placement)) {
            String mess = "Plaese Enter a valid Placement String";
            AlertBox.alertBox(mess);
            return;
        }
        String tile = placement.substring(0, 4);
        int row = Integer.parseInt(String.valueOf(placement.charAt(4)));
        int col = Integer.parseInt(String.valueOf(placement.charAt(5)));

        newBoard = updateBoard(newBoard, tile, row, col);
    }

    /**
     * createBoard function creates initial stage of the board.
     * This creates a grid of size 10x10.
     * It displays the stations at the edges and Metro sign at all the corners.
     * @return GridPane it returns the newly created board with all the stations including the center stations
     * and all the location where the tile can be placed.
     */
    GridPane createBoard() throws FileNotFoundException {
        // Create a GridPane to store the board
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(0, 25, 0, 5));
        grid.setAlignment(Pos.CENTER);
        int startLocation;                                      // Stores the starting number of the station

        // Add all the corner images i.e. Metro.jpg
        String cornerLocation = "src/comp1110/ass2/gui/assets/tile_back_cover.jpg";
        ImageView cornerImageView1 = createImage(cornerLocation, 0);
        ImageView cornerImageView2 = createImage(cornerLocation, 0);
        ImageView cornerImageView3 = createImage(cornerLocation, 0);
        ImageView cornerImageView4 = createImage(cornerLocation, 0);
        GridPane.setConstraints(cornerImageView1, 0, 0);
        GridPane.setConstraints(cornerImageView2, 9, 0);
        GridPane.setConstraints(cornerImageView3, 9, 9);
        GridPane.setConstraints(cornerImageView4, 0, 9);
        grid.getChildren().addAll(cornerImageView1, cornerImageView2, cornerImageView3, cornerImageView4);

        // Store all the top edge station in the grid i.e. from Station 1 to 8.
        startLocation = 8;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 180);
            GridPane.setConstraints(imageView, 1+i, 0);
            grid.getChildren().addAll(imageView);
            startLocation--;
        }

        // Store all the top edge station in the grid i.e. from Station 9 to 16.
        startLocation = 9;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 90);
            GridPane.setConstraints(imageView, 0, 1+i);
            grid.getChildren().addAll(imageView);
            startLocation++;
        }

        // Store all the top edge station in the grid i.e. from Station 17 to 24.
        startLocation = 17;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 0);
            GridPane.setConstraints(imageView, 1+i, 9);
            grid.getChildren().addAll(imageView);
            startLocation++;
        }

        // Store all the top edge station in the grid i.e. from Station 25 to 32.
        startLocation = 32;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 270);
            GridPane.setConstraints(imageView, 9, 1+i);
            grid.getChildren().addAll(imageView);
            startLocation--;
        }

        // Store the GridCell where the tile will be inserted
        for(int i = 1; i <=8; i++) {
            for(int j = 1; j <= 8; j++) {
                // Create a new Label which stores the location and the color.
                Label gridCell = new Label();
                // Set the text of this new Label to the location in the grid i.e. (j-1, i-1)
                gridCell.setText("("+(j-1)+", "+(i-1)+")");

                // Set the Background color of the grid. This creates a chess board type of color effect.
                if ( i % 2 == 0 ) {
                    if (j % 2 == 0)
                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(107, 34, 18), CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
                } else {
                    if ( j % 2 == 1 )
                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(107, 34, 18), CornerRadii.EMPTY, Insets.EMPTY)));
                    else
                        gridCell.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
                }

                // Set the minimum Width and Height for the label.
                gridCell.setMinWidth(70);
                gridCell.setMinHeight(70);

                gridCell.setTextFill(Color.rgb(255, 255, 255));                 // Set the Text Color to White
                gridCell.setFont(Font.font("Arial", 15));                           // Set Font Family to "Arial" and Font size to 12px
                gridCell.setAlignment(Pos.CENTER);                                       // Set Center Alignment for the Label
                GridPane.setConstraints(gridCell, i, j);
                grid.getChildren().addAll(gridCell);
            }
        }

        // Store all the central stations in the grid.
        String centralLocation = "src/comp1110/ass2/gui/assets/centre_station.jpg";
        ImageView centerImageView1 = createImage(centralLocation, 270);
        ImageView centerImageView2 = createImage(centralLocation, 0);
        ImageView centerImageView3 = createImage(centralLocation, 180);
        ImageView centerImageView4 = createImage(centralLocation, 90);
        GridPane.setConstraints(centerImageView1, 4, 4);
        GridPane.setConstraints(centerImageView2, 5, 4);
        GridPane.setConstraints(centerImageView3, 4, 5);
        GridPane.setConstraints(centerImageView4, 5, 5);
        grid.getChildren().addAll(centerImageView1, centerImageView2, centerImageView3, centerImageView4);

        // Return the newly created Grid.
        return grid;
    }

    /**
     * This function returns a rotated image of size 70x70 with the specified degree
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
        imageView.setFitHeight(70);                                                 // set Image's Height
        imageView.setFitWidth(70);                                                  // set Image's Width
        imageView.setRotate(rotation);                                              // Rotate the image by specified degree
        return imageView;                                                           // Return the ImageView that we created
    }

    /**
     * updateBoard() function update the board with the new added tile.
     * @param board It is a Grid that holds all the placements. We need to update this board by placing a given tile on the given location
     * @param tile It is the String that hold the new tile that is needed to be placed on the board.
     * @param row It is the row where the new tile is to be inserted.
     * @param col It is the column where the new tile is to be inserted.
     * @return the updated board which is a GridPane with all the Tile Placed.
     * @throws FileNotFoundException Throws this exception if the image of the tile is not found.
     */
    GridPane updateBoard(GridPane board, String tile, int row, int col) throws FileNotFoundException {
        // Find the tile and store its location
        String tileLocation = "src/comp1110/ass2/gui/assets/"+tile+".jpg";
        // Create the image from the location using the creatImage() function
        ImageView tileView = createImage(tileLocation, 0);

        // Store the image at the given location
        GridPane.setConstraints(tileView, col+1, row+1);
        board.getChildren().add(tileView);

        // Return the updated board with the new tile placed
        return board;
    }

    /**
     * It returns the right side of the screen which holds the deck
     * @param player It is the new object of Player class which is used to get number of players and the tiles in their hand
     * @return It return the grid which will be displayed on the right side tf the screen.
     * @throws FileNotFoundException This exception may re thrown is the image of the tile from the deck is not found.
     */
    GridPane deckLocation (Player player) throws FileNotFoundException {
        // Create a New GripPane which will Show what to display on the right side of the screen.
        GridPane deckLoc = new GridPane();
        deckLoc.setPadding(new Insets(0, 25, 0, 25));

        // Creat a Label named "DECK" and apply all the properties.
        Label deckName = new Label("DECK");
        deckName.setAlignment(Pos.CENTER);
        deckName.setFont(Font.font("Arial", 20));
        deckName.setTextFill(Color.rgb(0, 0, 0));
        deckName.setPadding(new Insets(10, 25, 25, 55));
        GridPane.setConstraints(deckName, 0, 0);
        deckLoc.getChildren().add(deckName);

        // Store the top location from the newDeck which is passed.
        int tempLocationOfTopDeck = Tile.top - 1;
        // Store the string value of the tile that is at the top of the deck
        String topOfDeck= Tile.deck[tempLocationOfTopDeck];

        // Find the tile that is at the top of deck and store its location
        String topLocation = "src/comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
        // Create the image from the location using the creatImage() function
        ImageView tileView = createImage(topLocation, 0);
        tileView.setFitHeight(150);
        tileView.setFitWidth(150);
        GridPane.setConstraints(tileView, 0, 1);
        deckLoc.getChildren().add(tileView);

        // Create a new Label that stores the String value of the tile that is at the top of the deck.
        Label tileName = new Label(topOfDeck);
        tileName.setAlignment(Pos.CENTER);
        tileName.setFont(Font.font("Arial", 15));
        tileName.setTextFill(Color.rgb(0, 0, 0));
        tileName.setPadding(new Insets(5, 25, 5, 55));
        GridPane.setConstraints(tileName, 0, 2);
        deckLoc.getChildren().add(tileName);

        // Creating Label for player's Name, and the Tile which is in his/her hand
        Label playerName = new Label("Player No. "+(player.getCurrentPlayer() + 1));
        playerName.setAlignment(Pos.CENTER);
        playerName.setFont(Font.font("Arial", 20));
        playerName.setTextFill(Color.rgb(0, 0, 0));
        playerName.setPadding(new Insets(20, 25, 5, 55));
        GridPane.setConstraints(playerName, 0, 3);
        deckLoc.getChildren().add(playerName);

        // Check if the player already holds any tile in his/her hands
        String tileInHand = player.getTileInHand(player.getCurrentPlayer());
        if ( tileInHand != null ) {
            // Find the tile that is at the top of deck and store its location
            String playersHandTileLocation = "src/comp1110/ass2/gui/assets/" + tileInHand + ".jpg";
            // Create the image from the location using the creatImage() function
            ImageView playersHandTileView = createImage(playersHandTileLocation, 0);
            playersHandTileView.setFitHeight(150);
            playersHandTileView.setFitWidth(150);
            GridPane.setConstraints(playersHandTileView, 0, 4);
            deckLoc.getChildren().add(playersHandTileView);
        } else {
            // Creating Label for player's Name, and the Tile which is in his/her hand
            Label noTileInHand = new Label("No Tile In Hand");
            noTileInHand.setAlignment(Pos.CENTER);
            noTileInHand.setFont(Font.font("Arial", 15));
            noTileInHand.setTextFill(Color.rgb(0, 0, 0));
            noTileInHand.setPadding(new Insets(5, 25, 5, 55));
            GridPane.setConstraints(noTileInHand, 0, 4);
            deckLoc.getChildren().add(noTileInHand);
        }

        // Return this grid.
        return deckLoc;
    }

    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    makePlacement(textField.getText());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FocusGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

        makeControls();

        // Get the number of players from the user using getPlayer() function.
        int n = GetPlayers.getPlayers();
        if ( n == -1 )                          // Check if the user wants to quit or continue
            return;
        // Create a new variable of Player that hold all the functionality of a player.
        Player player = new Player( n );

        // Create a new Grid. i.e. the initial stage of the board
        newBoard = createBoard();

        // Create a new Grid that holds right side of the screen. i.e. DECK, and the image of the top most tile in deck.
        GridPane rightDeckLocation = deckLocation(player);

        GridPane screenDistribution = new GridPane();
        GridPane.setConstraints(newBoard, 0, 0);
        screenDistribution.getChildren().add(newBoard);
        GridPane.setConstraints(rightDeckLocation, 1, 0);
        screenDistribution.getChildren().add(rightDeckLocation);

        root.getChildren().add(screenDistribution);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
