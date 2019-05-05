package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class loginSideController extends CommonController{
    @FXML
    public TextField createEmail;
    @FXML
    public TextField createPwd;
    @FXML
    public TextField repeatPwd;
    @FXML
    public TextField loginEmail;
    @FXML
    public TextField loginPwd;
    @FXML
    public Button createBtn;
    @FXML
    public Button loginBtn;



    @FXML
    public void HandleBtn(ActionEvent event) throws IOException, SQLException {
        if (event.getSource()==createBtn){
            //Check if all fields are filled correctly
            if (newUser()){
                //TODO:Create user
                loadScene("sample/FXMLs/maindashboard.fxml",createBtn);
            }
        }else if (event.getSource()==loginBtn){
            if (oldUser()){
                //TODO:Retrieve user info
                loadScene("sample/FXMLs/maindashboard.fxml",createBtn);
            }
        }

    }

    public boolean newUser(){
        if (!createEmail.getText().isEmpty()&&!createPwd.getText().isEmpty()&&!repeatPwd.getText().isEmpty()){
            if (!createEmail.getText().contains("@")||!createEmail.getText().contains(".")||createEmail.getLength()>255){
                return false;
            }
            if (createPwd.getLength()<8||createPwd.getLength()>255){
                return false;
            }
            if (repeatPwd.getText()!=createPwd.getText()){
                return false;
            }
        }else {
            return false;
        }
        return true;
    }

    public boolean oldUser(){
        if (!loginEmail.getText().isEmpty()&&!loginPwd.getText().isEmpty()){
            if (!loginEmail.getText().contains("@")||!loginEmail.getText().contains(".")||loginEmail.getLength()>255){
                return false;
            }
            if (loginPwd.getLength()<8||loginPwd.getLength()>255){
                return false;
            }
            //TODO:If they match with the database
        }else {
            return false;
        }
        return true;
    }
}
