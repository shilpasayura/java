package app.controllers;

import app.Startup;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.URL;

public class WindowController {
    /**
     * @param layout layout file in .fxml
     * @param title  Tilte of the window to be created
     * @return Object to be casted to a proper controller. Use to send information between app.controllers
     * @throws IOException if the window cannot be created.
     */
    private static Object openNewWindow(String layout, String title) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Startup.class.getResource("resources/layouts/" + layout));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Controller controller = fxmlLoader.getController();
        controller.setCurrentStage(stage);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        // Force FXML min sizes (width/height)
        stage.setMinWidth(root.minWidth(-1));
        stage.setMinHeight(root.minHeight(-1));
        stage.show();
        return controller;
    }

    public static LoginController openLoginWindow() throws IOException {
        return (LoginController) openNewWindow("loginMenu.fxml", "Login");
    }

    static RegisterUserController openRegisterUserWindow() throws IOException {
        return (RegisterUserController) openNewWindow("registerNewUserMenu.fxml", "Register User");
    }

    static NotesController openNotesWindow() throws IOException {
        return (NotesController) openNewWindow("notesMenu.fxml", "Notes");
    }

    static void displayInformation(String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        styleDialog(alert);
        alert.setContentText(content);
        alert.setHeaderText(null);
        alert.showAndWait();
    }

    static boolean displayConfirmation(String question) {
        var alert = new Alert(Alert.AlertType.CONFIRMATION);
        styleDialog(alert);
        alert.setContentText(question);
        alert.setHeaderText(null);
        alert.showAndWait();
        return (alert.getResult() == ButtonType.OK);
    }

    public static void displayError(String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        styleDialog(alert);
        alert.setContentText(content);
        alert.setHeaderText(null);
        alert.showAndWait();
    }

    static void styleDialog(Dialog dialog) {
        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().add(
                Startup.class.getResource("resources/style/bootstrap2.css").toExternalForm()
        );
        dialogPane.getStyleClass().add("myDialog");
    }

    static void higlightInvalidInput(TextField field) {
        field.setStyle("-fx-border-color: red");
    }
}
