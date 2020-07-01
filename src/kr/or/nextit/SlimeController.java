package kr.or.nextit;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
public class SlimeController implements Initializable {
	@FXML
	Label startLabel;
	@FXML
	Button nextButton;
	@FXML
	AnchorPane MainPane;
	@FXML
	Button startButton;
	@FXML
	Label explainLabel;
	private MediaPlayer mainBG;
	private MediaPlayer nextPage;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String path = "/home/pc16/Desktop/프로젝트mp3/MainBG.mp3";
		String path2 = "/home/pc16/Desktop/프로젝트mp3/nextPage.mp3";
	Media media = new Media(new File(path).toURI().toString());
	Media media2 = new Media(new File(path2).toURI().toString());
	
	
	mainBG = new MediaPlayer(media);
	nextPage = new MediaPlayer(media2);
	
	}

	@FXML
	public void nextAction() {
		mainBG.play();
		nextButton.setDisable(true);
		explainLabel.setText("Welcome To The Slime World!");
		startLabel.setText("Start버튼을 눌러주세요!");
		startButton.setDisable(false);
	}

	@FXML
	public void StartAction() {
		nextPage.play();
		mainBG.stop();
		Stage stage = (Stage) startButton.getScene().getWindow();
		Parent second;
		try {
			second = FXMLLoader.load(getClass().getResource("SlimeGameStart.fxml"));
			stage.close();
			Scene sc = new Scene(second);
			sc.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
			stage.setScene(sc);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
