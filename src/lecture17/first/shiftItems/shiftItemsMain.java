package lecture17.first.shiftItems;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class shiftItemsMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ShiftItems.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("리스트 옮기기");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
