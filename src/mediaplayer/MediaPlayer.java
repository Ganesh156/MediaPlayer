package mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.stage.Stage;

/**
 *
 * @author Ganesh
 */
public class MediaPlayer extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
       
        Parent root=FXMLLoader.load(getClass().getResource("MediaTest.fxml"));
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("MediaPlayer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        launch(args);
    }

     void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
