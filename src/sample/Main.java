package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*different selectable themes with different icons, buttons changing colors on double tap, different languages, weather for today and time (weather for every hour on a pane that slides open when tapped on the weather pane, different organizational tips, reminders appearing, maybe voice recognition, mobile app*/
/*purple: #d071e8, red: #ed2a1c, blue: #1166c6, yellow: #FFFF00, light blue: #1dc1c6, orange: #ff7200, pink: #f4027b; black;grey: #cecccc, different blue: #75CDD8*/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("maindashboard.fxml"));
        primaryStage.setTitle("Dashboard");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
