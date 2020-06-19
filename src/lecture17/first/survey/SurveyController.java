package lecture17.first.survey;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SurveyController implements Initializable {

	@FXML
	ToggleGroup yorN1;
	@FXML
	ToggleGroup yorN2;
	@FXML
	ToggleGroup yorN3;
	@FXML
	ToggleGroup yorN4;
	@FXML
	ToggleGroup yorN5;
	@FXML
	ToggleButton yes;
	@FXML
	ToggleGroup yorN6;
	@FXML
	CheckBox etc;
	@FXML
	CheckBox cough;
	@FXML
	CheckBox tasteSmellParalysis;
	@FXML
	CheckBox headache;
	@FXML
	CheckBox diarrhea;
	@FXML
	CheckBox sickness;
	@FXML
	CheckBox throwUp;
	@FXML
	CheckBox whirl;
	@FXML
	CheckBox musclePain;
	@FXML
	CheckBox phlegm;
	@FXML
	CheckBox difficultyBreathing;
	@FXML
	CheckBox soreThroat;
	@FXML
	TextField etcText;
	@FXML
	Label sympton;
	private List<CheckBox> checkList;
	private List<ToggleGroup> selectList;
	@FXML
	Button save;
	@FXML
	AnchorPane question7;
	int cnt = 0;
	@FXML
	Label todayDate;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//오늘날짜 출력하기
		todayDate.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")));
		//CheckBox 배열생성
		checkList = Arrays.asList(soreThroat, difficultyBreathing, phlegm, musclePain, whirl, throwUp, sickness,
				diarrhea, headache, tasteSmellParalysis, cough, etc);
		//ToggleGroup 배열생성
		selectList = Arrays.asList(yorN1, yorN2, yorN3, yorN4, yorN5, yorN6);
		//6번 문항의 예를 선택하면 visible상태가 아닌 것들을 보여줌.
		yes.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				question7.setVisible(observable.getValue());
			}
		});
		//기타 항목에 값이 있으면 체크박스 선택 
		etcText.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				etc.setSelected(observable.getValue().intValue() > 0);
			}
		});
		selectList.forEach(new Consumer<ToggleGroup>() { // 매개변수가 있고, 리턴값이 x
			@Override
			public void accept(ToggleGroup t) {
				t.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
					@Override
					public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue,
							Toggle newValue) {
						if (newValue == null) {
							oldValue.setSelected(true);
						}
					}
				});

			}
		});
	}

	@FXML
	public void surveySave() {
		//ToggleGroup 결과 출력
		for (int i = 0; i < selectList.size(); i++) {
			System.out.print((i+1) + "번: " + selectList.get(i).getSelectedToggle().getUserData() + ", ");
		}
		System.out.print("7번: ");
		//내가한 방법
		/*System.out.println("1번: " + yorN1.getSelectedToggle().getUserData() + ", 2번: "
				+ yorN2.getSelectedToggle().getUserData() + ", 3번: " + yorN3.getSelectedToggle().getUserData()
				+ ", 4번: " + yorN4.getSelectedToggle().getUserData() + ", 5번: "
				+ yorN5.getSelectedToggle().getUserData() + ", 6번: " + yorN6.getSelectedToggle().getUserData());
		System.out.print("7번:");*/
		//CheckBox 결과 출력
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				cnt++;
				if (cnt == 1) {
					System.out.print(checkList.get(i).getUserData().toString());
				} else {
					System.out.print(", " + checkList.get(i).getUserData().toString());
				}
			}
		}
		cnt = 0;
		//만약 etcText에 입력값이 있으면 출력조건
		if (etcText.getLength() > 0) {
			System.out.println("(" + etcText.getText() + ")");
		}
	}
}
