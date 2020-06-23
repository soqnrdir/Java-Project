package lecture17.first.example14;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;
import javafx.util.Duration;
import lecture17.first.login.LoginController;

public class TransitionController {

	@FXML
	StackPane stackPane;
	@FXML
	Label resultLabel;

	@FXML
	public void loginAction() throws IOException {
		// Parent login =
		// FXMLLoader.load(getClass().getResource("../login/Logins.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../login/Logins.fxml"));
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			@Override
			public Object call(Class<?> param) {
				return new LoginController(new LoginListener() {
					@Override
					public void login(String id, String password) {
						resultLabel.setText("id: " + id + ", pw: " + password);						
					}
				});
			}
		});
		Parent login = loader.load();
		stackPane.getChildren().add(login);
		// 시작위치
		login.setTranslateX(((AnchorPane) login).getPrefWidth());
		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}

}
