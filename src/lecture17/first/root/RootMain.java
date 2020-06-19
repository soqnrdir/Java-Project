package lecture17.first.root;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RootMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Roots.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("InputExample");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
