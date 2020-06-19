package lecture17.first;

import java.util.Optional;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
//import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstAppMain extends Application { // 추상 클래스

	@Override
	public void start(Stage primaryStage) throws Exception {
		// JavaFX 화면 코딩
		// primaryStage.setScene(new Scene(new Pane(), 800, 600)); 창 크기 설정
		Label label = new Label();
		label.setText("Hello, JavaFX"); // 레이블 생성
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인"); // 버튼 생성
		button.setOnAction(new EventHandler<ActionEvent>() { // 버튼 이벤트 발생 설정

			@Override
			public void handle(ActionEvent event) {
				Optional<ButtonType> wait = new Alert(AlertType.INFORMATION, "프로그램 종료", ButtonType.CLOSE).showAndWait();
				if (wait.get() == ButtonType.CLOSE) {
					Platform.exit(); // 버튼 상태를 설정해준다. 만약 버튼을 누르면 프로그램 종료가 실행되도록 설정하고 닫기를 누르면 종료.
				}
			}
		});

		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER); // 가운데로 정렬
		vBox.setSpacing(20); // 공간 사이의 간격 설정 (레이블과 버튼의 공간)
		vBox.setPadding(new Insets(20)); // 전체 여백의 공간의 간격 설정
		vBox.getChildren().add(label);
		vBox.getChildren().add(button); // 레이블과 버튼을 세로로 박스안에 감싸기

		Scene scene = new Scene(vBox); // 박스를 씬이 감싸도록 넣기

		primaryStage.setScene(scene);
		primaryStage.show(); // 윈도우 보여주기

	}

	public static void main(String[] args) {
		launch(args); // start를 호출 AppMain 객체 생성 및 메인 윈도우 생성
	}
}
