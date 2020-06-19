package lecture17.first.buttons;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;

public class ButtonController implements Initializable { // 초기화를 가능하게 해주는 인터페이스

	@FXML
	CheckBox glassesCheck;
	@FXML
	CheckBox maskCheck;
	@FXML
	ToggleGroup levelGroup;
	@FXML
	ToggleGroup languegeGroup;
	@FXML
	Label resultLabel;
	private List<CheckBox> checkList; // 전역변수로 사용하기 위해 필드 선언
	// 여기서 JavaFX 객체를 초기화

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(glassesCheck, maskCheck);
		// 토글버튼의 값이 변경될 때마다 이벤트 발생
		languegeGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				if (newValue == null) {
					oldValue.setSelected(true);
				}
			}
		});
	}

	@FXML
	public void confirmAction() {
		StringBuilder builder = new StringBuilder();
		// check box
		for (int i = 0; i < checkList.size(); i++) { // 반복문으로 자동으로 처리하기 위해.
			if (checkList.get(i).isSelected()) { // 체크되어있는 객체만 출력하도록 설계
				builder.append(checkList.get(i).getUserData().toString() + ", ");
			}

		}
		// radio button
		if (levelGroup.getSelectedToggle() != null) {
			builder.append(((RadioButton) levelGroup.getSelectedToggle()).getText());
		}
		// toggle button
		if (languegeGroup.getSelectedToggle() != null) {
			builder.append(", " + languegeGroup.getSelectedToggle().getUserData());// 셋 중에 선택 한 것 하나만. 캐스팅해서 text로 표현
		}
		resultLabel.setText(builder.toString());
	}

}
