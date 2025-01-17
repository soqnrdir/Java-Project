package lecture17.first.example14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TransitionSceneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("TransitionScene.fxml"));
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("화면전환");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
