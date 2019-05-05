package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class DashboardController extends CommonController{

    @FXML
    public ImageView logOutBtn;
    @FXML
    public Label tipsPane;
    @FXML
    public AnchorPane weather;
    @FXML
    public AnchorPane calendarBtn;
    @FXML
    public AnchorPane travelBtn;
    @FXML
    public AnchorPane budgetBtn;
    @FXML
    public AnchorPane fitnessBtn;
    @FXML
    public AnchorPane diaryBtn;
    @FXML
    public AnchorPane listBtn;
    @FXML
    public TilePane tasksList;
    @FXML
    public ImageView searchBtn;
    @FXML
    public ImageView aboutBtn;
    @FXML
    public ImageView helpBtn;
    @FXML
    public ImageView settingsBtn;
    @FXML
    public AnchorPane miniScreen;

    @FXML
    public void HandleBtns(MouseEvent mouseEvent) throws IOException, SQLException {
        if (mouseEvent.getSource()==searchBtn){

        }else if (mouseEvent.getSource()==settingsBtn){

        }else if (mouseEvent.getSource()==helpBtn){

        }else if (mouseEvent.getSource()==aboutBtn){

        }else if (mouseEvent.getSource()==logOutBtn){
            loadScene("sample/FXMLs/loginScreen.fxml",logOutBtn);
        }
    }

    @FXML
    public void HandlePages(MouseEvent mouseEvent) throws IOException, SQLException {
        //TODO:Change the scene inside the lower anchor pane
        if (mouseEvent.getSource()==calendarBtn){
            loadScene("sample/FXMLs/calendar.fxml",calendarBtn);
        } else if (mouseEvent.getSource()==travelBtn){
            loadScene("sample/FXMLs/travel.fxml",travelBtn);
        } else if (mouseEvent.getSource()==budgetBtn){
            loadScene("sample/FXMLs/budget.fxml",budgetBtn);
        } else if (mouseEvent.getSource()==fitnessBtn){
            loadScene("sample/FXMLs/fitness.fxml",fitnessBtn);
        } else if (mouseEvent.getSource()==diaryBtn){
            loadScene("sample/FXMLs/diary.fxml",diaryBtn);
        } else if (mouseEvent.getSource()==listBtn){
            loadScene("sample/FXMLs/todoList.fxml",listBtn);
        }
    }

    @FXML
    public void HandleReminders(MouseEvent mouseEvent) {
    }

    //TODO:Load in mini Screen
//    void loadScene(String fxml, javafx.scene.Node node) throws IOException, SQLException {
//        Parent root;
//        Stage stage;
//
//        stage = (Stage) ;
//        root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
//        root.requestFocus();
//    }
}
