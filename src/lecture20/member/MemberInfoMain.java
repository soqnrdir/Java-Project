package lecture20.member;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberInfoMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MemberInfo.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("멤버 정보");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
