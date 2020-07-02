package kr.or.nextit;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
//4
public class GameClearController implements Initializable {
	@FXML
	Label congraduation;
	@FXML
	ImageView slime1Image;
	@FXML
	ImageView slime2image;
	private Image slime1;
	private Image slime2;
	private TranslateTransition transition;
	private MediaPlayer clear;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		String path = "/home/pc16/Desktop/프로젝트mp3/clear.mp3";
		Media media = new Media(new File(path).toURI().toString());
		clear = new MediaPlayer(media);
		clear.play();

		slime1 = new Image(getClass().getResource("images/waterSlime.png").toExternalForm());
		slime2 = new Image(getClass().getResource("images/fireSlime.png").toExternalForm());

		slime1Image.setImage(slime1);
		slime2image.setImage(slime2);

		transition = new TranslateTransition();
		transition.setDuration(Duration.millis(1000));
		transition.setToX(800);
		transition.setAutoReverse(true);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.setNode(slime1Image);
		transition.play();

		transition = new TranslateTransition();
		transition.setDuration(Duration.millis(1000));
		transition.setToX(-750);
		transition.setAutoReverse(true);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.setNode(slime2image);
		transition.play();

		transition = new TranslateTransition();
		transition.setDuration(Duration.millis(500));
		transition.setToY(-70);
		transition.setAutoReverse(true);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.setNode(congraduation);
		transition.play();
	}

	@FXML
	public void exitAction() {
		clear.stop();
		Platform.exit();
	}
}
