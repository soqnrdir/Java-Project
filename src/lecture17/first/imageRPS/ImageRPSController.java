package lecture17.first.imageRPS;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ToggleGroup;

public class ImageRPSController implements Initializable {
	int randomNum = (int) (Math.random() * 2);
	@FXML
	Label result;
	@FXML
	ImageView imagePlayer;
	@FXML
	ImageView imageAi;
	private List<Image> personList;
	private List<Image> aiList;
	@FXML
	ToggleGroup rspGroup;
	int index;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		personList = new ArrayList<Image>();
		aiList = new ArrayList<Image>();
		personList.add(new Image(getClass().getResource("가위_왼쪽.png").toExternalForm()));
		personList.add(new Image(getClass().getResource("바위_왼쪽.png").toExternalForm()));
		personList.add(new Image(getClass().getResource("보_왼쪽.png").toExternalForm()));
		aiList.add(new Image(getClass().getResource("가위_오른쪽.png").toExternalForm()));
		aiList.add(new Image(getClass().getResource("바위_오른쪽.png").toExternalForm()));
		aiList.add(new Image(getClass().getResource("보_오른쪽.png").toExternalForm()));

	}

	@FXML
	public void startGame() {

		StringBuilder builder = new StringBuilder();

		imageAi.setImage(aiList.get(randomNum));
		if (randomNum == 0) {
			if (rspGroup.getSelectedToggle().getUserData().equals("0")) {
				builder.append("무승부입니다");
			} else if (rspGroup.getSelectedToggle().getUserData().equals("1")) {
				builder.append("사람승!!");
			} else {
				builder.append("Ai승!!");
			}

		} else if (randomNum == 1) {
			if (rspGroup.getSelectedToggle().getUserData().equals("0")) {
				builder.append("Ai승!!");
			} else if (rspGroup.getSelectedToggle().getUserData().equals("1")) {
				builder.append("무승부입니다");
			} else {
				builder.append("사람승!!");
			}
		} else if (randomNum == 2) {
			if (rspGroup.getSelectedToggle().getUserData().equals("0")) {
				builder.append("사람 승!!");
			} else if (rspGroup.getSelectedToggle().getUserData().equals("1")) {
				builder.append("Ai승!!");
			} else {
				builder.append("무승부입니다");
			}
		}
		result.setText(builder.toString());
	}

	@FXML
	public void scissorsClick() {
		imagePlayer.setImage(personList.get(0));
	}

	@FXML
	public void rockClick() {
		imagePlayer.setImage(personList.get(1));
	}

	@FXML
	public void paperClick() {
		imagePlayer.setImage(personList.get(2));
	}
}
