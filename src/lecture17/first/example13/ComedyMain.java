package lecture17.first.example13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ComedyMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Comedy.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("이용진 VS 이상준");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
