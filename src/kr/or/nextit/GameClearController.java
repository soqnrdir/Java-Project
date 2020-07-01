package kr.or.nextit;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class GameClearController implements Initializable {
	private MediaPlayer nextPage;
	@FXML Button goToStartButton;
	private Media media;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String path = "/home/pc16/Desktop/프로젝트mp3/clear.mp3";
		media = new Media(new File(path).toURI().toString());
		nextPage = new MediaPlayer(media);
	}
	
	@FXML public void goToStart() {
		nextPage.stop();
		Stage stage = (Stage)goToStartButton.getScene().getWindow();
	     Parent second;
		try {
			second = FXMLLoader.load(getClass().getResource("Slime.fxml"));
     stage.close();
     Scene sc = new Scene(second);
     sc.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
     stage.setScene(sc);
     stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML public void exitAction() {       
		  Platform.exit();
	}


}
