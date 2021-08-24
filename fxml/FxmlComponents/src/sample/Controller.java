package sample;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.File;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller  {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static boolean imgClicked=false;
    @FXML private ImageView imgView;
    @FXML private ListView listView;
    @FXML private ColorPicker colorPicker;
    @FXML private TextField txtName;
    @FXML private Label lblName;
    @FXML private Button button1;
    @FXML private ComboBox comboBox;
    @FXML private CheckBox checkBox;

    public Controller() {
        LOGGER.log(Level.INFO, "Constructor called");
    }

    @FXML
    public void initialize() {
        LOGGER.log(Level.INFO, "initialize() called");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getItems().add("Colombo");
        listView.getItems().add("Kandy");
        listView.getItems().add("Galle");
        listView.getItems().add("Jaffna");
        /*
        ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();

        for(Object index : selectedIndices){
            System.out.println("index = " + index + " (" + index.getClass() + ")");
        }
         */


        comboBox.getItems().add("Choice 0");
        comboBox.getItems().add("Choice 1");
        comboBox.getItems().add("Choice 2");
        //comboBox.setEditable(true);


    }

    @FXML
    public void handleButtonClick(Event e){
        LOGGER.log(Level.INFO, "Button clicked");
        System.out.println("Button clicked");
    }
    public void button2Action(Event e){
        txtName.setText("Enter Your Name");

    }


    @FXML public void imageClick() throws IOException {
        System.out.println("Image clicked");
        File file;
        if (imgClicked) {
            file = new File("src/sample/cat.jpg");

        }else{
            file = new File("src/sample/rabbit.jpg");
        }
        imgClicked= !imgClicked;
        LOGGER.log(Level.INFO, file.toURI().toString());
        Image image = new Image(file.toURI().toString());
        imgView.setImage(image);
        }

    @FXML public void listItemSelectedAction (Event e){
        ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();
        for(Object o : selectedIndices){
            System.out.println("o = " + o + " (" + o.getClass() + ")");
        }
    }
    @FXML public void exitSystem(Event e){
        System.exit(0);
    }
    @FXML public void pickColorAction(){
        //https://docs.oracle.com/javafx/2/ui_controls/color-picker.htm
        Color c = colorPicker.getValue();
        lblName.setTextFill(c);

        BackgroundFill bgFill = new BackgroundFill(c, CornerRadii.EMPTY, Insets.EMPTY);
        Background bg = new Background(bgFill);
        //lblName.setBackground(bg);
        button1.setBackground(bg);
    }

    private String createRGBString(Color c) {
        return "-fx-base: rgb(" + (c.getRed() * 255) + "," + (c.getGreen() * 255) + "," + (c.getBlue() * 255) + ");";
    }

    @FXML public void comboBoxAction(){
        int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
        Object selectedItem = comboBox.getSelectionModel().getSelectedItem();
        System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
        System.out.println(" ComboBox.getValue(): " + comboBox.getValue());
    }

    @FXML public void checkBoxAction(){
        if(checkBox.isSelected()){
            checkBox.setText("Selected ");
        }
        else {
            checkBox.setText("Not selected ");
        }
    }
}
