package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuDemo3 extends Application {
    String clipstr= new String();
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu Demo");

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 300);

        // create a menu
        Menu fileMenu = new Menu("File");
        // create menuitems
        MenuItem fm1 = new MenuItem("Clear Messages");
        MenuItem fm2 = new MenuItem("Clear Forms");
        MenuItem fm3 = new MenuItem("Show Credentials");
        MenuItem fm4 = new MenuItem("Exit");

        // add menu items to menu
        fileMenu.getItems().add(fm1);
        fileMenu.getItems().add(fm2);
        fileMenu.getItems().add(fm3);
        fileMenu.getItems().add(fm4);

        Menu editMenu = new Menu("Edit");
        Menu em1 = new Menu("Cut Name");
        Menu em2 = new Menu("Paste Name");
        Menu em3 = new Menu("Copy Name");

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


        // Menu Events


        em1.setOnAction(e -> {
            if (textField1.getText().equals("")) {
                //pass
            }else {
                System.out.println("Cut");
                clipstr = textField1.getText();
                textField1.setText("");
            }
        });

        em2.setOnAction(e -> {
            if (clipstr.equals("")) {
                //pass
            }else {
                System.out.println("Paste");
                textField1.setText(clipstr);
            }
        });

        em3.setOnAction(e -> {
            if (textField1.getText().equals("")) {
                //pass
            }else {
                clipstr=textField1.getText();
                textField1.setText(clipstr);
                System.out.println("Copy");
            }
        });

        fm4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                System.exit(0);
            }
        });

    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}