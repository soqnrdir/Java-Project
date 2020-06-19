package lecture17.first.photoAlbum;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class PhotoAlbumController implements Initializable {

	
	@FXML ImageView photoImageVIew;
	private List<Image> imageList;
	IntegerProperty countProperty = new SimpleIntegerProperty();
	
	@FXML Button beforeButton;
	@FXML Button afterButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	imageList = new ArrayList<Image>();
	
	imageList.add(new Image(getClass().getResource("mumu1.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("mumu2.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("cat1.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("cat2.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("cat3.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("cat4.jpg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("TOTORO1.jpeg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("TOTORO2.jpeg").toExternalForm()));
	imageList.add(new Image(getClass().getResource("TOTORO3.jpeg").toExternalForm()));
	
	countProperty.addListener(new ChangeListener<Number>() {
		@Override
		public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

				beforeButton.setDisable(observable.getValue().intValue()==0);
			
				afterButton.setDisable(observable.getValue().intValue() == imageList.size()-1);
			}
			
		
	});
	
	}
	@FXML public void beforeImage() {
	/*	if(countProperty.get() == 0) {
			countProperty.set(imageList.size());
		} */
		countProperty.set(countProperty.get() -1);
		photoImageVIew.setImage(imageList.get(countProperty.get()));
		
	
	}
	@FXML public void afterImage() {
		/*if(countProperty.get() == imageList.size() -1) {
		   countProperty.set(countProperty.get()-1);
		} */
		countProperty.set(countProperty.get() +1);
		photoImageVIew.setImage(imageList.get(countProperty.get()));
		}
	
	}
