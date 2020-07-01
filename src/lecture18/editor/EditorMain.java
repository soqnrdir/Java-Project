package lecture18.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditorMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Editor.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("에디터");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
