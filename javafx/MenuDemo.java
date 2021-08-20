import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//https://docs.oracle.com/javafx/2/ui_controls/menu_controls.htm

//create Menudemo object 
public class MenuDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        // Create MenuBar
        MenuBar menuBar = new MenuBar();
        
        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        
        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");
        
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        
        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);
        
        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        
      //Create a BorderPane 
	//Has top, left, right, bottom, and center         


  BorderPane root = new BorderPane();
        root.setTop(menuBar); //place on Top
        //create a Scene
        Scene scene = new Scene(root, 350, 200);
        stage.setTitle("JavaFX Menu");
        stage.setScene(scene); // add to stage
        stage.show(); // display
   
		openFileItem.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
			System.out.println("Open File Clicked");
			//scene.setFill(Color.web("#81c483"));
			}
		});

		
		newItem.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
			System.out.println("New Clicked");
			//scene.setFill(Color.web("#81c483"));
			}
		});
 
   
   }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
