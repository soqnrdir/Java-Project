package lecture17.first.example13;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class ComedyController implements Initializable {

	@FXML Label leftLabel;
	@FXML Label rightLabel;
	private Timeline timeline;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Random random = new Random();
		KeyFrame keyFrame = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				leftLabel.setText(random.nextInt(900) + 100 + "");
				rightLabel.setText(random.nextInt(900) + 100 + "");
			}
		});
	    timeline = new Timeline(keyFrame);
	    timeline.setCycleCount(50);
	}
	@FXML public void startAction() {
		timeline.play();
	}

}
