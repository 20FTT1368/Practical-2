package project02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class GuessMyColour extends Application {




	@Override
	public void start(Stage arg0) throws Exception {
		initGUI(arg0);

		arg0.setTitle("Guess My Colour");
		arg0.setResizable(false);
		arg0.sizeToScene();
		arg0.show();

	} 

	private void initGUI(Stage arg0) {

		Label titleLabel = new Label();
		Font titleFont = Font.font("Serif", FontWeight.BOLD, 32);
		titleLabel.setFont(titleFont);

		titleLabel.setAlignment(Pos.CENTER);
		titleLabel.setText("Guess My Colour");

		BorderPane rootPane = new BorderPane();
		rootPane.setTop(titleLabel);

		Rectangle centerRectangle = new Rectangle(0, 0, 50, 50);
		centerRectangle.setFill(Color.BLUE);
		rootPane.setCenter(centerRectangle);

		Rectangle leftRectangle = new Rectangle(0, 0, 50, 50);
		leftRectangle.setFill(Color.RED);
		rootPane.setLeft(leftRectangle);

		Rectangle rightRectangle = new Rectangle(0, 0, 50, 50);
		rightRectangle.setFill(Color.GREEN);
		rootPane.setRight(rightRectangle);

		Rectangle bottomRectangle = new Rectangle(0, 0, 50, 50);
		bottomRectangle.setFill(Color.YELLOW);
		rootPane.setBottom(bottomRectangle);

		Scene root = new Scene(rootPane);
		arg0.setScene(root);



	}	

	public static void main(String[] args) {
		Application.launch(args);
	}

}
