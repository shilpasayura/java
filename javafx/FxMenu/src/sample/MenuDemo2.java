package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuDemo2 extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu Demo");

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 300);

        // create a menu
        Menu fileMenu = new Menu("File");
        // create menuitems
        MenuItem fm1 = new MenuItem("Clear Messages");
        MenuItem fm2 = new MenuItem("Clear Forms");
        MenuItem fm3 = new MenuItem("Save Credentials");
        MenuItem fm4 = new MenuItem("Exit Portal");

        // add menu items to menu
        fileMenu.getItems().add(fm1);
        fileMenu.getItems().add(fm2);
        fileMenu.getItems().add(fm3);
        fileMenu.getItems().add(fm4);

        Menu editMenu = new Menu("Edit");
        Menu em1 = new Menu("Cut");
        Menu em2 = new Menu("Copy");
        Menu em3 = new Menu("Paste");

        editMenu.getItems().addAll(em1,em2,em3);

        MenuBar menuBar = new MenuBar();
        // add menu to menubar
        menuBar.getMenus().addAll(fileMenu,editMenu);
        root.setVgap(50);
        root.addRow(0, menuBar);

        root.setStyle("-fx-padding: 8;" + "-fx-border-style: solid inside;" + "-fx-border-width: 4;"
                + "-fx-border-radius: 6;" + "-fx-border-color: green;");
        menuBar.setStyle("-fx-border-color: blue;");

        Text text1 = new Text();
        text1.setText("Welcome to Portal");
        text1.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 20));

        Label name = new Label("UserName");
        Label pass = new Label("Password");

        TextField textField1 = new TextField();
        PasswordField textField2 = new PasswordField();

        Button Submit = new Button("Submit");

        root.addRow(1, text1);
        root.setVgap(10);
        root.addRow(2, name, textField1);
        root.setVgap(10);
        root.addRow(3, pass, textField2);
        root.setVgap(10);
        root.addRow(4, Submit);
        root.setVgap(10);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}