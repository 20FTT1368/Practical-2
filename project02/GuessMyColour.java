package project02;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
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

	private Rectangle sampleRectangle = new Rectangle();
	private Rectangle targetRectangle = new Rectangle();

	private int targetRed = 0;
	private int targetGreen = 0;
	private int targetBlue = 0;

	private void initGUI(Stage arg0) {

		Label titleLabel = new Label();
		Font titleFont = Font.font("Serif", FontWeight.BOLD, 32);
		titleLabel.setFont(titleFont);

		titleLabel.setAlignment(Pos.CENTER);
		titleLabel.setText("Guess My Colour");

		BorderPane rootPane = new BorderPane();
		titleLabel.prefWidthProperty().bind(rootPane.widthProperty());
		rootPane.setTop(titleLabel);

		rootPane.setTop(titleLabel);

		sampleRectangle.setWidth(50);
		sampleRectangle.setHeight(50);
		sampleRectangle.setFill(Color.BLACK);

		targetRectangle.setWidth(50);
		targetRectangle.setHeight(50);
		targetRectangle.setFill(Color.CYAN);


		FlowPane centerPane = new FlowPane();

		centerPane.getChildren().add(sampleRectangle);
		centerPane.getChildren().add(targetRectangle);
		centerPane.setAlignment(Pos.CENTER);

		rootPane.setCenter(centerPane);

		generateTargetColour();

		titleLabel.setText("Guess My Colour");
		titleLabel.setBackground(new Background(
				new BackgroundFill(Color.BLACK, null, null)));
		titleLabel.setTextFill(Color.WHITE);

		Scene root = new Scene(rootPane);
		arg0.setScene(root);

	}			


	private void generateTargetColour() {

		Color targetColour = Color.rgb(100, 100, 100);
		targetRectangle.setFill(targetColour);

		Random rand = new Random();

		targetRed = rand.nextInt(18) * 15;
		targetGreen = rand.nextInt(18) * 15;
		targetBlue = rand.nextInt(18) * 15;

		Color targetColor = Color.rgb(
				targetRed, targetGreen, targetBlue);
		targetRectangle.setFill(targetColor);

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
