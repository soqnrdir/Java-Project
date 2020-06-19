package lecture17.first.shiftItems;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class ShiftItemsController implements Initializable {

	@FXML
	ListView<String> listView1;
	@FXML
	ListView<String> listView2;
	@FXML
	TextField inputField;
	@FXML
	Button insertButton;
	private ObservableList<String> list1;
	private ObservableList<String> list2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list1 = FXCollections.observableArrayList();

		listView1.setItems(list1);

		list2 = FXCollections.observableArrayList();

		listView2.setItems(list2);

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
	public void insertAction() {
		list1.add(inputField.getText());
		inputField.setText("");
		inputField.requestFocus();
	}
	/*
	public void moveItem(ObservableList<String> original, ObservableList<String> target, ObservableList<String> actionName ) {
		int selectedindex = -1;
		if(actionName.equals("right")) {
			int selectedIndex = listView1.getSelectionModel().getSelectedIndex();
		} else {
			int selectedIndex = listView2.getSelectionModel().getSelectedIndex();
		}
		target.add(original.get(selectedindex));
		original.remove(selectedindex);
	} */
	
	@FXML
	public void oneMoveRight() {
		int selectedIndex = listView1.getSelectionModel().getSelectedIndex();
		if (list1.isEmpty()) {
			new Alert(AlertType.WARNING, "이동할 항목이 없습니다.", ButtonType.OK).show();
		} else if (selectedIndex < 0) { // 선택한 항목이 없을경우
			new Alert(AlertType.WARNING, "이동할 항목을 선택하세요.", ButtonType.OK).show(); // 알림창 실행
		} else {
			list2.add(list1.get(selectedIndex));
			list1.remove(selectedIndex);

		}
	}

	@FXML
	public void oneMoveLeft() {
		int selectedIndex = listView2.getSelectionModel().getSelectedIndex();
		if (list2.isEmpty()) {
			new Alert(AlertType.WARNING, "이동할 항목이 없습니다.", ButtonType.OK).show();

		} else if (selectedIndex < 0) { // 선택한 항목이 없을경우
			new Alert(AlertType.WARNING, "이동할 항목을 선택하세요.", ButtonType.OK).show(); // 알림창 실행
		} else {
			list1.add(list2.get(selectedIndex));
			list2.remove(selectedIndex);
		}
	}

	@FXML
	public void allMoveRight() {
		if (list1.isEmpty()) {
			new Alert(AlertType.WARNING, "이동할 항목이 없습니다.", ButtonType.OK).show();
		} else {
			list2.addAll(list1);
			list1.clear();
		}
	}

	@FXML
	public void allMoveLeft() {
		if (list2.isEmpty()) {
			new Alert(AlertType.WARNING, "이동할 항목이 없습니다.", ButtonType.OK).show();
		} else {
			list1.addAll(list2);
			list2.clear();
		}
	}

	@FXML
	public void keyPressed(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			insertAction();
		}
	}

}
