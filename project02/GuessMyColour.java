package project02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class GuessMyColour extends Application {

 
 private void initGUI(Stage arg0) {
	 
	 Label titleLabel = new Label();
	 Font titleFont = Font.font("Serif", FontWeight.BOLD, 32);
	 titleLabel.setFont(titleFont);
	 
	 titleLabel.setAlignment(Pos.CENTER);
	 titleLabel.setText("Guess My Colour");
	 
	 BorderPane rootPane = new BorderPane();
	 rootPane.setTop(titleLabel);
	 
	 Scene root = new Scene(rootPane);
	 arg0.setScene(root);

 }	
 @Override
 public void start(Stage arg0) throws Exception {
	 initGUI(arg0);

	 arg0.setTitle("Guess My Colour");
	 arg0.setResizable(false);
	 arg0.sizeToScene();
	 arg0.show();
	 
 }
 	
 public static void main(String[] args) {
	 Application.launch(args);
	 }

}
