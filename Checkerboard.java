/** Program: Display a Checkerboard
 * File: Checkerboard.java
 * Summary: Display a checkerboard of colored rectangles to user.
 * Author: Chris Hyde
 * Date: November 28, 2017
 **/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Checkerboard extends Application {
    // main Method
    public static void main(String[] args) {
        launch(args);
    }

    // Overriden start method of Application superclass
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Rectangle> tileList = new ArrayList<>();
        // Create the pane for displaying nodes
        GridPane pane = new GridPane();


        int indexCounter= 0; // index counter that goes up until loop ends
        // Loop to create 64 rectangles and add them to tileList
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++) {
                // add a new rectangle to boxlist
                tileList.add(new Rectangle(0, 0, 80, 80));

                //Cechk if i is even and if so Fill even boxes with white else fill even boxes with black
                if(i % 2 == 0) {
                    //Fill even boxes with white
                    if (j % 2 == 0) {
                        tileList.get(indexCounter).setFill(Color.WHITE);
                    } else {
                        tileList.get(indexCounter).setFill(Color.BLACK);
                    }
                }else{
                    //Fill even boxes with Black
                    if (j % 2 == 0) {
                        tileList.get(indexCounter).setFill(Color.BLACK);
                    } else {
                        tileList.get(indexCounter).setFill(Color.WHITE);
                    }
                }

                // Add tile to GridPanel
                pane.add(tileList.get(indexCounter), i, j);
                indexCounter++;// increment indexCounter;

            }
        }


        // Create the Scene
        Scene scene = new Scene(pane, 640, 640);
        //Set Stage Title
        primaryStage.setTitle("Color and Font");
        //Set the scene of the primary stage
        primaryStage.setScene(scene);
        // Display Stage
        primaryStage.show();
    }
}
