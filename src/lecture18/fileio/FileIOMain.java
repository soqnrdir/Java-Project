package lecture18.fileio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FileIOMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FileIO.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("파일IO");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
