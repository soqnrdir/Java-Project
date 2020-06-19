package lecture17.first.survey;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SurveyMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Surveys.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("설문지 작성 연습");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
