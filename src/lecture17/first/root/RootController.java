package lecture17.first.root;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class RootController implements Initializable {

	@FXML
	Button btnCancel;
	@FXML
	Button btnReg;
	@FXML
	TextArea txtContent;
	@FXML
	DatePicker dateExit;
	@FXML
	ComboBox<String> comboPublic;
	@FXML
	PasswordField txtPassword;
	@FXML
	TextField txtTitle;
	@FXML
	CheckBox visibleCheckBox;
	@FXML
	Label contentsLable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 콤보 박스
		ObservableList<String> list = FXCollections.observableArrayList("공개", "비공개");
		comboPublic.setItems(list);
		// 내용 보여주기
		visibleCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				contentsLable.setVisible(observable.getValue());
				txtContent.setVisible(observable.getValue());

			}
		});
		// 비밀번호를 입력하면 체크박스에 자동으로 체크가되도록 설정하기
		txtPassword.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				visibleCheckBox.setSelected(observable.getValue().intValue() > 0);//()안에 조건을 세운다.
			}
		});
	}
	public void handleBtnRegAction() {
		String title = txtTitle.getText();
		System.out.println("title: " + title);

		String password = txtPassword.getText();
		System.out.println("password: " + password);

		String strPublic = comboPublic.getValue();
		System.out.println("public: " + strPublic);

		LocalDate localDate = dateExit.getValue();
		if (localDate != null) {
			System.out.println("dateExit: " + localDate.toString());
		}

		String content = txtContent.getText();
		System.out.println("content: " + content);
	}
	
	
	@FXML
	public void handleBtnCancelAction() {
		Platform.exit();
	}

}
