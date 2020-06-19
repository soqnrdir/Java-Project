package lecture17.first.currentTime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CurrentTimeMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("CurrentTime.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("현재시간");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
