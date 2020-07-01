package lecture18.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

public class FileIOController implements Initializable {

	@FXML TextArea contentsArea;
	private File file;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML public void openAction() throws Exception {
		FileChooser chooser = new FileChooser(); //chooser을 통해 정보전달 가능
		file = chooser.showOpenDialog(null);
//		FileInputStream inputStream = new FileInputStream(file);
//		byte[] buffer = new byte[2048];
//		while (inputStream.read(buffer) != -1) {
//			contentsArea.setText(new String(buffer));
//		}
//		inputStream.close();
		FileReader reader = new FileReader(file);
		char[] cbuf = new char[4];
		StringBuffer buffer = new StringBuffer();
		while (reader.read(cbuf) != -1) {
			buffer.append(new String(cbuf));
		}
		reader.close();
		contentsArea.setText(buffer.toString());
	}

	@FXML public void saveAction() throws Exception {
//		FileOutputStream outputStream = new FileOutputStream(file); //전역변수로 선언한 file을 넣어 정보가 유지될 수 있도록 함
//		outputStream.write(contentsArea.getText().getBytes()); 
//		outputStream.close();
		FileWriter writer = new FileWriter(file);
		writer.write(contentsArea.getText()); //String은 char의 배열형태라 바로 getText.
		writer.close();
	}

	@FXML public void newAction() throws Exception {

	}
}
