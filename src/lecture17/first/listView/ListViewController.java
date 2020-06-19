package lecture17.first.listView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class ListViewController implements Initializable {

	@FXML
	ListView<String> itemListView;
	@FXML
	TextField inputField;
	private ObservableList<String> list;
	@FXML
	Button insertButton;
	@FXML
	TextField searchField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		FilteredList<String> filteredList = new FilteredList<String>(list);
		// 연결해서 list에 담고있는 데이터를 보여준다.
		itemListView.setItems(filteredList);
		searchField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				//검색
				filteredList.setPredicate(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.contains(observable.getValue());
					}
				});

			}
		});

		// 글자가 입력되어 있지 않으면 추가버튼 비활성화
		inputField.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (observable.getValue().intValue() > 0) {
					insertButton.setDisable(false);
				} else {
					insertButton.setDisable(true);
				}
			}
		});
		// 입력창 엔터 적용하기 이벤트 키
		/*
		 * inputField.setOnKeyPressed(new EventHandler<KeyEvent>() {
		 * 
		 * @Override public void handle(KeyEvent event) {
		 * 
		 * 
		 * } });
		 */
	}

	@FXML
	public void insertAction() {
		// list에 inputField에 입력하는 값을 등록
		list.add(inputField.getText());
		inputField.setText("");
		inputField.requestFocus(); // 입력후에 마우스를 따로 클릭하지 않도록 포커스를 준다.
	}

	@FXML
	public void delectAction() {

		int selectedIndex = itemListView.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { // 선택한 항목이 없을경우
			new Alert(AlertType.WARNING, "삭제할 항목을 선택하세요.", ButtonType.OK).show(); // 알림창 실행
		} else {
			list.remove(selectedIndex);
		}
	}

	// 입력 창 엔터 적용하기
	@FXML
	public void keyPressed(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			insertAction();
		}
	}

}
