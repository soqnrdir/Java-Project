package lecture17.first.imageRPS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageRPSMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ImageRPS.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("가위바위보");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
