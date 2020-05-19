package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import comp1110.ass2.Player;
import comp1110.ass2.Tile;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CreatingBoard extends Application{
    /*
    ArrayList<Triangle> triangles = new ArrayList<>();
    final int SIDE = 196;
    Triangle highlighted = null;
    */
    String placementSequence;
    Group board = new Group();
    ArrayList<Label> boxes = new ArrayList<>();
    private static final String URI_BASE = "assets/";
    private static final int SQUARE_SIZE = 75;
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    double mouseOffsetX;
    double mouseOffsetY;
    int temp_i, temp_j;
    Label highlighted = null;

    // Create a new variable of Tile that hold a new random Deck and its top location
    Tile newDeck = new Tile();
    String topOfDeck = newDeck.pop();

    void createBoard() throws FileNotFoundException {
        int startLocation;                                      // Stores the starting number of the station

        // Add all the corner images i.e. Metro.jpg
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

        // Store all the top edge station in the grid i.e. from Station 1 to 8.
        startLocation = 8;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 180);
            imageView.setLayoutX(SQUARE_SIZE +(SQUARE_SIZE*i));
            imageView.setLayoutY(0);
            board.getChildren().add(imageView);
            startLocation--;
        }

        // Store all the top edge station in the grid i.e. from Station 9 to 16.
        startLocation = 9;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 90);
            imageView.setLayoutX(0);
            imageView.setLayoutY(SQUARE_SIZE+(SQUARE_SIZE*i));
            board.getChildren().add(imageView);
            startLocation++;
        }

        // Store all the top edge station in the grid i.e. from Station 17 to 24.
        startLocation = 17;
        for(int i = 0; i < 8; i++) {
            String imageLocation = "src/comp1110/ass2/gui/assets/station" + (startLocation) + ".jpg";
            ImageView imageView = createImage(imageLocation, 0);
            imageView.setLayoutX(SQUARE_SIZE+(SQUARE_SIZE*i));
            imageView.setLayoutY(SQUARE_SIZE * 9);
            board.getChildren().add(imageView);
            startLocation++;
        }

        // Store all the top edge station in the grid i.e. from Station 25 to 32.
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
                boxes.add(gridCell);
            }
        }

        // Store all the central stations in the grid.
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
    }

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

    void makePlacement(String placement) throws FileNotFoundException {
        // FIXME Task 4: implement the simple placement viewer
        String tile = placement.substring(0, 4);
        int row = Integer.parseInt(String.valueOf(placement.charAt(4)));
        int col = Integer.parseInt(String.valueOf(placement.charAt(5)));
        updateBoard(tile, row, col);
        placementSequence += placement;
        topOfDeck = newDeck.pop();
    }

    public ImageView deckLocation(String topOfDeck) throws FileNotFoundException {
        VBox deckLoc = new VBox();
        deckLoc.setPadding(new Insets(0, 0, 0, 12));
        deckLoc.setMinWidth(250);
        deckLoc.setAlignment(Pos.CENTER);

        // Create a Label named "DECK" and apply all the properties.
        Label deckName = new Label("DECK");
        deckName.setMinWidth(250);
        deckName.setAlignment(Pos.CENTER);
        deckName.setFont(Font.font("Arial", 20));
        deckName.setTextFill(Color.BLACK);
        deckName.setPadding(new Insets(0, 0, 10, 0));
        int paddingLeft = (SQUARE_SIZE * 10) + (12);
        deckName.setLayoutX(paddingLeft);
        deckName.setLayoutY(0);

        // Find the tile that is at the top of deck and store its location
        String topLocation = "src/comp1110/ass2/gui/assets/" + topOfDeck + ".jpg";
        // Create the image from the location using the createImage() function
        ImageView tileView = createImage(topLocation, 0);
        tileView.setFitHeight(SQUARE_SIZE*2);
        tileView.setFitWidth(SQUARE_SIZE*2);
        paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
        tileView.setLayoutX(paddingLeft);
        tileView.setLayoutY(30);

        // Create a new Label that stores the String value of the tile that is at the top of the deck.
        Label tile1Name = new Label(topOfDeck);
        tile1Name.setMinWidth(250);
        tile1Name.setAlignment(Pos.CENTER);
        tile1Name.setFont(Font.font("Arial", 15));
        tile1Name.setTextFill(Color.BLACK);
        tile1Name.setPadding(new Insets(0, 0, 10, 0));
        paddingLeft = (SQUARE_SIZE * 10) + (12);
        int paddingTop = (SQUARE_SIZE*2) + (30) + (10);
        tile1Name.setLayoutX(paddingLeft);
        tile1Name.setLayoutY(paddingTop);

        board.getChildren().addAll(deckName, tileView, tile1Name);
        //deckLoc.getChildren().addAll(deckName, tileView, tile1Name);

        return tileView;
    }

    Label findClosestLabel(ImageView tile) {
        Label closest = new Label();
        double closetDistance = Double.MAX_VALUE;
        for(Label t: boxes) {
            double dx = t.getLayoutX();
            double dy = t.getLayoutY();

            double distanceX = dx - tile.getLayoutX();
            double distanceY = dy - tile.getLayoutY();

            double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

            if ( closetDistance > distance ) {
                closest = t;
                closetDistance = distance;
            }
        }
        return closest;
    }

    public void playerLocation(Player player) throws FileNotFoundException {
        VBox playerLocation = new VBox();
        playerLocation.setPadding(new Insets(25, 0, 0, 12));

        // Creating Label for player's Name
        Label playerName = new Label("Player "+(player.getCurrentPlayer() + 1));
        playerName.setMinWidth(250);
        playerName.setAlignment(Pos.CENTER);
        playerName.setFont(Font.font("Arial", 20));
        playerName.setTextFill(Color.BLACK);
        playerName.setPadding(new Insets(0, 0, 10, 0));
        int paddingLeft = (SQUARE_SIZE * 10) + (12);
        int paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50);
        playerName.setLayoutX(paddingLeft);
        playerName.setLayoutY(paddingTop);
        board.getChildren().add(playerName);

        // Check if the player already holds any tile in his/her hands and create label for it
        String tileInHand = player.getTileInHand(player.getCurrentPlayer());
        if (tileInHand != null) {
            // Find the tile that is in the player's hand and store its location
            String playersHandTileLocation = "src/comp1110/ass2/gui/assets/" + tileInHand + ".jpg";
            // Create the image from the location using the createImage() function
            ImageView playersHandTileView = createImage(playersHandTileLocation, 0);
            playersHandTileView.setFitHeight(SQUARE_SIZE*2);
            playersHandTileView.setFitWidth(SQUARE_SIZE*2);
            paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
            paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50) + (30);
            playersHandTileView.setLayoutX(paddingLeft);
            playersHandTileView.setLayoutY(paddingTop);

            Label TileInHand = new Label(tileInHand);
            TileInHand.setFont(Font.font("Arial", 15));
            TileInHand.setTextFill(Color.BLACK);
            TileInHand.setMinWidth(250);
            TileInHand.setAlignment(Pos.CENTER);
            paddingLeft = (SQUARE_SIZE * 10) + (12);
            paddingTop = (30) + (SQUARE_SIZE*2) + (10) + (50) + (30) + (SQUARE_SIZE*2) + (10);
            TileInHand.setLayoutX(paddingLeft);
            TileInHand.setLayoutY(paddingTop);

            board.getChildren().addAll(playersHandTileView, TileInHand);
        } else {
            Label playersHandTileView = new Label();
            playersHandTileView.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
            playersHandTileView.setMinHeight(SQUARE_SIZE*2);
            playersHandTileView.setMinWidth(SQUARE_SIZE*2);
            playerLocation.getChildren().add(playersHandTileView);
            paddingLeft = (SQUARE_SIZE * 10) + (12) + (50);
            paddingTop = (SQUARE_SIZE*2) + (30) + (10) + (50) + (30);
            playersHandTileView.setLayoutX(paddingLeft);
            playersHandTileView.setLayoutY(paddingTop);

            // Creating Label that reflects the player's empty hand
            Label noTileInHand = new Label("No Tile In Hand");
            noTileInHand.setFont(Font.font("Arial", 15));
            noTileInHand.setTextFill(Color.BLACK);
            noTileInHand.setMinWidth(250);
            noTileInHand.setAlignment(Pos.CENTER);
            paddingLeft = (SQUARE_SIZE * 10) + (12);
            paddingTop = (30) + (SQUARE_SIZE*2) + (10) + (50) + (30) + (SQUARE_SIZE*2) + (10);
            noTileInHand.setLayoutX(paddingLeft);
            noTileInHand.setLayoutY(paddingTop);

            board.getChildren().addAll(playersHandTileView, noTileInHand);
        }
    }

    boolean gameOver () {
        if ( !newDeck.checkDeckEmpty() )
            return true;
        return false;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Board");

        // Create a new variable of Player that hold all the functionality of a player.
        Player player = new Player( 2 );
        placementSequence = "";

        // Create a new Grid. i.e. the initial stage of the board
        createBoard();

//        while ( !gameOver() ) {
            Group root = new Group();
            // Store the string value of the tile that is at the top of the deck
            ImageView tileView = deckLocation(topOfDeck);
            playerLocation(player);

            tileView.setOnMousePressed(event -> {
                mouseOffsetX = tileView.getLayoutX() - event.getSceneX();
                mouseOffsetY = tileView.getLayoutY() - event.getSceneY();
                tileView.setFitHeight(SQUARE_SIZE);
                tileView.setFitWidth(SQUARE_SIZE);
            });

            tileView.setOnMouseDragged(event -> {
                tileView.setLayoutX(event.getSceneX() + mouseOffsetX);
                tileView.setLayoutY(event.getSceneY() + mouseOffsetY);

                Label closest = findClosestLabel(tileView);
                double locationX = (closest.getLayoutX() / SQUARE_SIZE) - 1;
                double locationY = (closest.getLayoutY() / SQUARE_SIZE) - 1;
                String placement = topOfDeck + Integer.toString((int)locationX) + Integer.toString((int)locationY);
                String tempPlacementSequence = placementSequence + placement;
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
                if ( Metro.isPlacementSequenceValid(tempPlacementSequence) ) {
                    closest.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    highlighted = closest;
                } else {
                    highlighted = null;
                }
            });

            tileView.setOnMouseReleased(event -> {
                Label closest = findClosestLabel(tileView);
                double locationX = (closest.getLayoutX() / SQUARE_SIZE) - 1;
                double locationY = (closest.getLayoutY() / SQUARE_SIZE) - 1;
                System.out.println("Mouse Released"+locationX+", "+locationY);
                String placement = topOfDeck + Integer.toString((int)locationX) + Integer.toString((int)locationY);
                String tempPlacementSequence = placementSequence + placement;
                if ( Metro.isPlacementSequenceValid(tempPlacementSequence) ) {
                    try {
                        makePlacement(placement);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(tempPlacementSequence);
                    AlertBox.alertBox("Please enter a valid placement string");
                }
                tileView.setLayoutX((SQUARE_SIZE * 10) + (12) + (50));
                tileView.setLayoutY(30);
                tileView.setFitWidth(SQUARE_SIZE*2);
                tileView.setFitHeight(SQUARE_SIZE*2);
            });

            System.out.println(topOfDeck);
            player.switchTurn();
            root.getChildren().add(board);

            Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
            stage.setScene(scene);
            stage.show();
//        }
    }
}
