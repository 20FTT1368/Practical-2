package project01;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;


public class WizardOfYesNo extends Application {
	private static final String ANSWER = "No";
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
	//	Label label = new Label("Yes");
		 		   Label label = new Label();
	 label.setText(ANSWER);
		// Add the two arguments for width and height. In this case it is 200 width x 100 height.
		  Scene root = new Scene(label, 200, 100);
		  arg0.setScene(root);

		  
		 
		arg0.show();
	}
	

	

	

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
	
	
}
