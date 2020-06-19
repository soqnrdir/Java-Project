package lecture17.first.tableView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableViewMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("TableView.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("테이블 뷰");
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
