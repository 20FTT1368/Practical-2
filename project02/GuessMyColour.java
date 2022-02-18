package project02;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
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
	private int red = 0;
	private int green = 0;
	private int blue = 0;

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

		HBox buttonPane = new HBox();

		Font font = Font.font("Dialog", FontWeight.BOLD, 18);

		Button moreRedButton = new Button("+");
		moreRedButton.setBackground(new Background(
				new BackgroundFill(Color.RED, null, null)));
		moreRedButton.setFont(font);

		Button lessRedButton = new Button("-");
		lessRedButton.setBackground(new Background(
				new BackgroundFill(Color.RED, null, null)));
		lessRedButton.setFont(font);

		Button moreGreenButton = new Button("+");
		moreGreenButton.setBackground(new Background(
				new BackgroundFill(Color.GREEN, null, null)));
		moreGreenButton.setFont(font);

		Button lessGreenButton = new Button("-");
		lessGreenButton.setBackground(new Background(
				new BackgroundFill(Color.GREEN, null, null)));
		lessGreenButton.setFont(font);

		Button moreBlueButton = new Button("+");
		moreBlueButton.setBackground(new Background(
				new BackgroundFill(Color.BLUE, null, null)));
		moreBlueButton.setFont(font);

		Button lessBlueButton = new Button("-");
		lessBlueButton.setBackground(new Background(
				new BackgroundFill(Color.BLUE, null, null)));
		lessBlueButton.setFont(font);

		moreRedButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						increaseRed();
					}
				});

		lessRedButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						decreaseRed();
					}
				});

		moreGreenButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						increaseGreen();
					}
				});

		lessGreenButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						decreaseGreen();
					}
				});

		moreBlueButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						increaseBlue();
					}
				});

		lessBlueButton.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						decreaseBlue();
					}
				});

		buttonPane.getChildren().addAll(
				moreRedButton, lessRedButton, moreGreenButton,
				lessGreenButton, moreBlueButton, lessBlueButton);

		rootPane.setBottom(buttonPane);


		titleLabel.setText("Guess My Colour");
		titleLabel.setBackground(new Background(
				new BackgroundFill(Color.BLACK, null, null)));
		titleLabel.setTextFill(Color.WHITE);

		Scene root = new Scene(rootPane);
		arg0.setScene(root);

	}	



	private void increaseRed() {
		if(red <= 240) {
			red = red + 15;
			updateColourSample();
		}
	}

	private void decreaseRed() {
		if(red >= 15) {
			red = red - 15;
			updateColourSample();
		}
	}
	private void increaseGreen() {
		if(green <= 240) {
			green = green + 15;
			updateColourSample();
		}
	}

	private void decreaseGreen() {
		if(green >= 15) {
			green = green - 15;
			updateColourSample();
		}
	}

	private void increaseBlue() {
		if(blue <= 240) {
			blue = blue + 15;
			updateColourSample();
		}
	}
	private void decreaseBlue() {
		if(blue >= 15) {
			blue = blue - 15;
			updateColourSample();
		}
	}

	private void updateColourSample() {
		Color color = Color.rgb(red, green, blue);
		sampleRectangle.setFill(color);

		if(red == targetRed && blue == targetBlue &&
				green == targetGreen) {

			String message = "Congratulation! You guessed it! Red = "
					+ targetRed + ", green = "
					+ targetGreen + ", blue = "
					+ targetBlue;
			Alert alert = new Alert(AlertType.INFORMATION);
			
			alert.setTitle("You did it");
			
			alert.setHeaderText(null);
			
			alert.setContentText(message);
			
			alert.showAndWait();
		}
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
