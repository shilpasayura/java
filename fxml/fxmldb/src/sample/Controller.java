package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Controller {
    @FXML
    AnchorPane contentArea;

    public void handleNewNote(ActionEvent e) throws IOException {
        System.out.println("handleNewNote");
        //showNotesView_popup();
        //replaceNotesView();
        loadNotesView();
    }

    public void loadNotesView() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("notes.fxml"));
            Parent notes = fxmlLoader.load();
            //NotesController notesController = fxmlLoader.getController();
            contentArea.getChildren().setAll(notes);
     } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void replaceNotesView() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("notes.fxml"));
            Parent notes = fxmlLoader.load();
            Main.stage.setScene(new Scene(notes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void showNotesView_popup(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("notes.fxml"));
            Parent notes = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("PopUp");
            stage.setScene(new Scene(notes));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
