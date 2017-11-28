/** Program: Color & Font
 * File: ColorAndFont.java
 * Summary: Displays 5 vertical texts of random color and opacity
 * Author: Chris Hyde
 * Date: November 28, 2017
 **/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class ColorAndFont extends Application {
    // Overridden start Method from Application superclass
    @Override
    public void start(Stage primaryStage){
        ArrayList<Text> textList = new ArrayList<>();
        // Create the pane for displaying nodes
        HBox pane = new HBox();
        // Set spacing from pane edges for nodes
        pane.setPadding(new Insets(5,5,5,5));
        // Set spacing between nodes
        pane.setSpacing(5);

        // Loop to create 5 Texts and add them to an ArrayList<Text>
        for(int i = 0; i < 5; i++){
            textList.add(new Text("Java"));// Add text to textList
            // Set the font of the text in this index
            textList.get(i).setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            //Randomize the color and opacity of the Text in this index
            textList.get(i).setStroke(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            // Rotate the Text in this Index
            textList.get(i).setRotate(90);
            //Add the text in this index to the pane.
            pane.getChildren().add(textList.get(i));
        }

        // Create the Scene
        Scene scene = new Scene(pane, 300, 200);
        //Set Stage Title
        primaryStage.setTitle("Color and Font");
        //Set the scene of the primary stage
        primaryStage.setScene(scene);
        // Display Stage
        primaryStage.show();

    }

    // main Method
    public static void main(String[] args){
        Application.launch();
    }
}
