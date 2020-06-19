package lecture17.first.buttons;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Buttons.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("버튼 종류 연습");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
