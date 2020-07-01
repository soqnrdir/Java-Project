package kr.or.nextit;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class GameClearController {
	@FXML
	public void exitAction() {
		Platform.exit();
	}

}
 