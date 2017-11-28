/** Program: Draw Three Cards
 * File: ThreeCards.java
 * Summary: Randomly selects three cards from a deck of 52 and displays them to user in a JavaFX application.
 * Author: Chris Hyde
 * Date: November 28, 2017
 **/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.*;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeCards extends Application{

    // Overriden start method from Application superclass
    @Override
    public void start(Stage primaryStage){
        //Create an ArrayList of images to hold all the images for the deck of cards
        ArrayList<Image> cardDeck = new ArrayList<>();

        //Create the pane to display the cards
        HBox pane = new HBox();
        //pad the sides of the pane
        pane.setPadding((new Insets(5,5,5,5)));
        // Set spacing between nodes
        pane.setSpacing(5);

        //Loop through all 52 cards and set an image to cardDeck ArrayList<Images>
        for(int i = 0; i < 52; i++ ){
            cardDeck.add(new Image("images\\" + (i + 1) + ".png"));
        }

        // Shuffle the elements of the card deck
        Collections.shuffle(cardDeck);

        //Set the viewable image of the first card in cardDeck
        ImageView cardOne = new ImageView(cardDeck.get(0));
        //Set the viewable image of the second card in cardDeck
        ImageView cardTwo = new ImageView(cardDeck.get(1));
        //Set the viewable image of the third card in cardDeck
        ImageView cardThree = new ImageView(cardDeck.get(2));

        // Add all ImageView cards to the pane
        pane.getChildren().addAll(cardOne, cardTwo, cardThree);

        // Create the Scene
        Scene scene = new Scene(pane, 1510, 750);
        //Set Stage Title
        primaryStage.setTitle("Draw Three Cards");
        //Set the scene of the primary stage
        primaryStage.setScene(scene);
        //Keep window from being resizable
        primaryStage.setResizable(false);
        // Display Stage
        primaryStage.show();
    }

    // main Method
    public static void main(String[] args){
        //Launch the application using the overriden Start Method
        Application.launch(args);
    }


}
