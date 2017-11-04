package deminer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Main class
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = createPane();
        
        primaryStage.setTitle("Deminer");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*
     * Helper method to hid the details of creating
     * a nice looking grid.
     */
    private static GridPane createPane()
    {
    	GridPane root = new GridPane();
    	return root;
    }
    
}
