package lecture17.first.imageView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageViewMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ImageView.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("이미지 뷰");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
