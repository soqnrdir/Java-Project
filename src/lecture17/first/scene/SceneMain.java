package lecture17.first.scene;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// fxml파일을 불러온다.
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml")); //같은 패키지에 있을 경우에만 가능
		primaryStage.setScene(new Scene(root));  
		primaryStage.setTitle("처음 JavaFX 파일"); //타이틀 정의
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
