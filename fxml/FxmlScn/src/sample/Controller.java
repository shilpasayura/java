package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
//import javafx.scene.text.Text;
import javafx.scene.control.Label;
public class Controller {
    @FXML private Label LblText;
    @FXML protected void handleBtnClickMeAction(ActionEvent event) {
        LblText.setText("You Clicked!");
    }

}
