package lecture17.first.power;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PowerController {

	@FXML
	ImageView mouseClick;

	boolean powerFlag;

	Image powerOff = new Image(getClass().getResource("power_off.png").toExternalForm());
	Image powerOn = new Image(getClass().getResource("power_on.png").toExternalForm());

	@FXML
	public void clickThePower() {
		if (powerFlag) {
			mouseClick.setImage(powerOff);
			powerFlag = false;
		} else {
			mouseClick.setImage(powerOn);
			powerFlag = true;
		}
	}

}
