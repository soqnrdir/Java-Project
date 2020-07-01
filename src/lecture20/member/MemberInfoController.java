package lecture20.member;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class MemberInfoController implements Initializable {

	@FXML TableView<InfoModel> infoTableView;
	@FXML TableColumn<InfoModel, Integer> infoNoColumn;
	@FXML TableColumn<InfoModel, String> pcNoColumn;
	@FXML TableColumn<InfoModel, String> nameColumn;
	@FXML TableColumn<InfoModel, String> emailColumn;
	@FXML TableColumn<InfoModel, String> hobbyColumn;
	@FXML TextField pcNoField;
	@FXML TextField nameField;
	@FXML TextField emailField;
	@FXML TextField hobbyField;
	private ObservableList<InfoModel> infoList;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	List<InfoModel> list = new InfoDAO().selectList();
	infoList = FXCollections.observableArrayList(list);
	infoTableView.setItems(infoList);
	infoNoColumn.setCellValueFactory(param -> param.getValue().infoNoProperty().asObject());
	pcNoColumn.setCellValueFactory(param -> param.getValue().pcNoProperty());
	nameColumn.setCellValueFactory(param -> param.getValue().nmProperty());
	emailColumn.setCellValueFactory(param -> param.getValue().emailProperty());
	hobbyColumn.setCellValueFactory(param -> param.getValue().hobbyProperty());
	// 테이블 수정하기
	infoTableView.setEditable(true);
	// 컬럼을 더블클릭했을 때 실행
	hobbyColumn.setCellFactory(TextFieldTableCell.forTableColumn());
	hobbyColumn.setOnEditCommit(event -> {
	infoTableView.getSelectionModel().getSelectedItem().setHobby(event.getNewValue());
		new InfoDAO().update(infoTableView.getSelectionModel().getSelectedItem());
	});
	
	// 컨텍스트 메뉴(마우스 오른쪽 눌렀을 때 나오는 메뉴)
	ContextMenu contextMenu = new ContextMenu();
	MenuItem menuItem = new MenuItem("선택항목삭제");
	// 메뉴를 선택했을 때 실행할 내용 설정
	menuItem.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			int infoNo = infoTableView.getSelectionModel().getSelectedItem().getInfoNo();
			new InfoDAO().delete(infoNo);
			infoList.remove(infoTableView.getSelectionModel().getSelectedItem());
		}
	});
	hobbyColumn.setOnEditCommit(event -> {
	});
	
	//컨텍스트 메뉴에 삭제 메뉴 등록
	contextMenu.getItems().add(menuItem);
	//테이블뷰의 셀을 선택하고 마우스 오른쪽 버튼을 클릭했을 때 메뉴 나타나게 하기
	infoTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			if(event.getButton() == MouseButton.SECONDARY) {
				contextMenu.show(infoTableView, event.getScreenX(), event.getScreenY());
			}
			
		}
	});
	
	}
	
	@FXML public void registerAction() {
		String pcNo = pcNoField.getText();
		String nm = nameField.getText();
		String email =emailField.getText();
		String hobby = hobbyField.getText();
		new InfoDAO().insert(new InfoModel(pcNo, nm, email, hobby));
		infoList.setAll(new InfoDAO().selectList());

	}



}
