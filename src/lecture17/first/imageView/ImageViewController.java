package lecture17.first.imageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewController implements Initializable {

	private List<Image> imageList;
	int count;
	@FXML ImageView photoImageView;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imageList = new ArrayList<Image>();
		// toExternalForm()는 toString()와 동일
		imageList.add(new Image(getClass().getResource("mumu1.jpg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("mumu2.jpg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("cat1.jpg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("cat2.jpg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("cat3.jpg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("cat4.jpg").toExternalForm()));

	}

	@FXML
	public void changeImageAction() {
		photoImageView.setImage(imageList.get(++count % imageList.size()));
	}
}

 









