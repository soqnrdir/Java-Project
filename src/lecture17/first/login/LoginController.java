package lecture17.first.login;



import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import lecture17.first.example14.LoginListener;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	AnchorPane loginPane;
	@FXML
	PasswordField pwField;
	@FXML
	TextField idField;
	private LoginListener listener;
	public LoginController() {
		
	}

	public LoginController(LoginListener listener) {
		this.listener = listener;
	}

	@FXML
	public void loginAction() {
		listener.login(idField.getText(), pwField.getText());
		dissmissScene();
	}

	@FXML
	public void cancelAction() {
		dissmissScene();
	}
	private void dissmissScene() {
		StackPane stackPane = (StackPane) loginPane.getParent();
		// 로그인화면 초기값
		loginPane.setTranslateY(0);
		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(loginPane.translateYProperty(), loginPane.getPrefHeight());
		KeyFrame keyFrame = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				stackPane.getChildren().remove(loginPane);
				
				
			}
			
		}, keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
		
		
	}
}
