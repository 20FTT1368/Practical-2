package project01;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import java.util.Random;
import javafx.scene.text.*;


public class WizardOfYesNo extends Application {
	
private static final String[] ANSWER = {
			"Yes", "No" 
	};
	
	@Override
	public void start(Stage arg0) throws Exception {

		// TODO Auto-generated method stub
		//	Label label = new Label("Yes");
		 Label label = new Label();
		// Add the two arguments for width and height. In this case it is 200 width x 100 height.
		Scene root = new Scene(label, 200, 100);
		arg0.setScene(root);
		
		Random rand = new Random();
		int numberOfAnswers = ANSWER.length;
		int pick = rand.nextInt(numberOfAnswers);
		String answer = ANSWER[pick];
		
	
		label.setText(answer);
		
		//Font font = Font.font("Times New Roman", FontWeight.NORMAL, 32);
		
		//label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 32));
		
		Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 32);
		label.setFont(font);
		
		arg0.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}





}
