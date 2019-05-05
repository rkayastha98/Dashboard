package sample.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class CommonController {
    void loadScene(String fxml, javafx.scene.Node node) throws IOException, SQLException {
        Parent root;
        Stage stage;

        stage = (Stage) node.getScene().getWindow();
        root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        root.requestFocus();
    }
}
