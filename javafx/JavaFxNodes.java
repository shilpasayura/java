import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class JavaFxNodes extends Application{
    // Create the Message Label
    Label messageLbl = new Label("Enter your Name.");
     
    public static void main(String[] args){
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage){
        // Create the TextFields
        TextField firstNameFld = new TextField();
        TextField lastNameFld = new TextField();
         
        // display 15 chars
        firstNameFld.setPrefColumnCount(15);
        lastNameFld.setPrefColumnCount(15);
         
        // Set ActionEvent handlers for both fields
        firstNameFld.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e){
                printMessage("You have changed the First Name!");
            }
        });     
        lastNameFld.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e){
                printMessage("You have changed the Last Name !");
            }
        });
		
        //create root node
        GridPane root = new GridPane();
        // Set horizontal spacing to 10px
        root.setHgap(10);
        // Set the vertical spacing to 5px
        root.setVgap(5);
         
        // Add Labels and Fields to the GridPane
        root.addRow(0, messageLbl);
        root.addRow(1, new Label("First Name:"), firstNameFld);
        root.addRow(2, new Label("Last Name:"), lastNameFld);
         
        // Set the Size of the GridPane
        root.setMinSize(350, 250);
 
        /* 
         * Set the padding of the GridPane
         * Set the border-style of the GridPane
         * Set the border-width of the GridPane
         * Set the border-insets of the GridPane
         * Set the border-radius of the GridPane
         * Set the border-color of the GridPane
        */
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
         
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("A TextField Example");
        stage.show();
    }
     
    // Helper Method
    public void printMessage(String message)
    {
        // Set the Text of the Label
        messageLbl.setText(message);
    }
 
}
