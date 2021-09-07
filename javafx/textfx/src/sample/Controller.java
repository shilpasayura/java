package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML private Label labelHello;
    @FXML
    public void handleButtonAction(Event e){
        labelHello.setText("Bye JavaFX");
        System.out.println("Button clicked");
    }
}
