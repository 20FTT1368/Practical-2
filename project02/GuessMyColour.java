package project02;

import javafx.application.Application;
import javafx.stage.Stage;


public class GuessMyColour extends Application {
	
	
 @Override
 public void start(Stage arg0) throws Exception {
	 arg0.setTitle("Guess My Colour");
	 arg0.setResizable(false);
	 arg0.sizeToScene();
	 arg0.show();
	 
 }
 
 public static void main(String[] args) {
	 Application.launch(args);
	 }
}
