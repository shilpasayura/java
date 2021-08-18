import javafx.animation.FillTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.scene.shape.Circle;
import javafx.stage.Stage; 
import javafx.animation.Timeline; 
import javafx.animation.ParallelTransition; 
import javafx.animation.RotateTransition; 
import javafx.animation.ScaleTransition; 
import javafx.animation.TranslateTransition; 
import javafx.util.Duration; 
 
public class JavaFxScnGraph extends Application { 
 
    @Override 
    public void start(Stage stage) {
		
        Group root = new Group(); 
        Scene scene = new Scene(root, 500, 500, Color.WHITE);
		
		Circle circle = new Circle(50, 150, 50, Color.RED);
		
		root.getChildren().add(circle); 
        
		Rectangle box = new Rectangle(0, 0, 100, 50);
		box.setFill(Color.GREEN);
		
		root.getChildren().add(box);
		
	
        Rectangle r = new Rectangle(0, 0, 50, 50); 
        r.setFill(Color.BLUE); 
        root.getChildren().add(r); 
 
        TranslateTransition translate = 
        new TranslateTransition(Duration.millis(750)); 
        translate.setToX(390); 
        translate.setToY(390); 
 
        FillTransition fill = new FillTransition(Duration.millis(750)); 
        fill.setToValue(Color.YELLOW); 
 
        RotateTransition rotate = new RotateTransition(Duration.millis(750)); 
        rotate.setToAngle(360); 
 
        ScaleTransition scale = new ScaleTransition(Duration.millis(750)); 
        scale.setToX(0.1); 
        scale.setToY(0.1); 
 
        ParallelTransition transition = new ParallelTransition(r, 
        translate, fill, rotate, scale); 
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true); 
        transition.play(); 
 
        stage.setTitle("JavaFX Scene Graph Demo"); 
        stage.setScene(scene); 
        stage.show(); 
    } 
 
    public static void main(String[] args) { 
        launch(args); 
    } 
}