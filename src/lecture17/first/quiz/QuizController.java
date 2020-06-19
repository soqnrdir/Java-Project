package lecture17.first.quiz;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;

public class QuizController implements Initializable {

	@FXML
	Label resultLable;
	@FXML
	ToggleGroup answer;
	@FXML
	CheckBox ListView;
	@FXML
	CheckBox HBox;
	@FXML
	CheckBox CheckBox;
	@FXML
	CheckBox ComboBox;
	@FXML
	CheckBox AnchorPane;
	private List<CheckBox> checkList;
	@FXML Label resultLable2;

	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(AnchorPane, ComboBox, CheckBox, HBox, ListView);
	}

	@FXML
	public void confirmAction() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < checkList.size(); i++) { // 반복문으로 자동으로 처리하기 위해.
			if (checkList.get(i).isSelected()) { // 체크되어있는 객체만 출력하도록 설계
				builder.append(checkList.get(i).getUserData().toString() + ", ");
			}
		}
		// radio button
		if (answer.getSelectedToggle() != null) {
			builder.append("\n2번 JavaFX는" + ((RadioButton) answer.getSelectedToggle()).getText());
		}
		resultLable.setText(builder.toString());
		
	}
}
