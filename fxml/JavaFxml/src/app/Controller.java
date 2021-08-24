package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField txtName;
    @FXML private Label LblText;
    @FXML protected void handleButtonClick(ActionEvent event) {
        //textName.setText("You Clicked!");
        txtName.setText("You Clicked");
        LblText.setText("Clicked");
    }

}
