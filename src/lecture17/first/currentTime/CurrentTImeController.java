package lecture17.first.currentTime;

import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class CurrentTImeController implements Initializable {

	@FXML
	Label timeLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		timeLabel.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		// 시간이 경과됨을 출력하는 방법
		// 개발자가 직접 만든 Thread에서는 Main Thread의 UI를 직접 변경할 수 없다.
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				while(true) {
					//JavaFX Main Thread에서 UI를 변경할 수 있게 해준다.
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							timeLabel.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
						}
					});
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}

						
							
