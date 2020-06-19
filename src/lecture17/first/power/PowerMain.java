package lecture17.first.power;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PowerMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Power.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("파워버튼");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
