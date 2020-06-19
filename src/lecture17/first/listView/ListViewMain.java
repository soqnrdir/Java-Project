package lecture17.first.listView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ListViewMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ListViews.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("입력 컨트롤");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
