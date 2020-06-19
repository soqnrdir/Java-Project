package lecture17.first.tableView;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class TableViewController implements Initializable {

	@FXML
	TableView<MemberModel> membersTableView;
	@FXML
	TableColumn<MemberModel, String> nameColumn;
	@FXML
	TableColumn<MemberModel, String> moblieNumberColumn;
	@FXML
	TextField nameField;
	@FXML
	TextField mobileNumberField;
	@FXML
	Button addButton;
	private ObservableList<MemberModel> memberList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		memberList = FXCollections.observableArrayList();
		membersTableView.setItems(memberList);
		nameColumn.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<MemberModel, String>, ObservableValue<String>>() {
					@Override
					public ObservableValue<String> call(CellDataFeatures<MemberModel, String> param) {
						return param.getValue().getNameProperty();
					}
				});
		moblieNumberColumn.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<MemberModel, String>, ObservableValue<String>>() {
					@Override
					public ObservableValue<String> call(CellDataFeatures<MemberModel, String> param) {
						return param.getValue().mobileNumberProperty();
					}
				});
		// TextField에 데이터가 입력되어 있을 경우에만 등록 버튼 활성화

		/*nameField.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (observable.getValue().intValue() > 0) {
					addButton.setDisable(false);
				} else {
					addButton.setDisable(true);
				}
			}
		});
		mobileNumberField.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (observable.getValue().intValue() > 0) {
					addButton.setDisable(false);
				} else {
					addButton.setDisable(true);
					
				}
			}
		}); */
		
		//바인딩 둘다 값이 있어야 등록이 활성화 된다.
		addButton.disableProperty().bind(Bindings.createBooleanBinding(new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				return nameField.lengthProperty().get() == 0 || mobileNumberField.lengthProperty().get() == 0;

			}
		}, nameField.lengthProperty(), mobileNumberField.lengthProperty()));

	}

	@FXML
	public void addAction() {
		String name = nameField.getText();
		String mobileNumber = mobileNumberField.getText();
		memberList.add(new MemberModel(name, mobileNumber));
		nameField.setText("");
		mobileNumberField.setText("");
		nameField.requestFocus();
	}

	@FXML
	public void delectAction() {
		int selectedIndex = membersTableView.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { // 선택한 항목이 없을경우
			new Alert(AlertType.WARNING, "삭제할 항목을 선택하세요.", ButtonType.OK).show(); // 알림창 실행
		} else {
			Optional<ButtonType> wait = new Alert(AlertType.CONFIRMATION, "선택된 항목을 삭제하시겠습니까?.", ButtonType.NO,
					ButtonType.YES).showAndWait();
			if (wait.get() == ButtonType.YES) {
				memberList.remove(selectedIndex);

			}
		}

	}

}
