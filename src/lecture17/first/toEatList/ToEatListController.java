package lecture17.first.toEatList;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class ToEatListController implements Initializable {

	@FXML
	TextField searchField;
	@FXML
	ListView<String> menuList;
	@FXML
	Button insertButton;
	@FXML
	TextField inputField;
	private ObservableList<String> list;@FXML Button searchButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		FilteredList<String> filteredList = new FilteredList<String>(list);
		menuList.setItems(filteredList);
		searchField.textProperty().addListener(new ChangeListener<String>() {
	
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// 검색
				filteredList.setPredicate(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.contains(observable.getValue());
						
					}
				});

			}
		});

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
	}

	@FXML
	public void keyPressed(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			insertAction();
		}
	}

	@FXML
	public void insertAction() {
		list.add(inputField.getText());
		inputField.setText("");
		inputField.requestFocus();
	}

	@FXML
	public void delectAction() {
		int selectedIndex = menuList.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { // 선택한 항목이 없을경우
			new Alert(AlertType.WARNING, "삭제할 항목을 선택하세요.", ButtonType.OK).show(); // 알림창 실행
		} else {
			Optional<ButtonType> wait = new Alert(AlertType.CONFIRMATION, "선택된 항목을 삭제하시겠습니까?.", ButtonType.NO, ButtonType.YES).showAndWait();
			if(wait.get() == ButtonType.YES) {
			list.remove(selectedIndex);
			
			}
		}
	}

	@FXML public void searchAction() {}
}
