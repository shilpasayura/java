package sample;

import com.sun.javafx.css.parser.Token;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class NotesController implements Initializable  {
    @FXML
    AnchorPane apRoot;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextArea txtContent;

    @FXML
    private TextField txtPriority;

    @FXML
    private Label txtStatus;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    //Search an employee
    @FXML
    private void addNote (ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        boolean success=false;
        try {
            if(txtTitle.getText().isEmpty() || txtContent.getText().isEmpty() || txtPriority.getText().isEmpty()) {
                txtStatus.setText("Please enter all data into fields.");
            } else {
                //Note.add(new Note(0,txtTitle.getText(),txtContent.getText(), Integer.parseInt(txtPriority.getText()));
                String sql = new String("INSERT INTO NOTES (TITLE, CONTENT,PRIORITY)VALUES ('"+txtTitle.getText()+"','"+txtContent.getText()+"','"+Integer.parseInt(txtPriority.getText())+"')");
                success=DatabaseController.write(sql);
                if (success) {
                    txtStatus.setText("Record Saved");
                    txtTitle.setText("");
                    txtContent.setText("0");
                    txtPriority.setText("0");
                }
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    AnchorPane getAPaneRoot() {
        return apRoot;
    }
}



