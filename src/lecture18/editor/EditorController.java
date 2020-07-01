package lecture18.editor;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.scene.control.TextArea;

public class EditorController implements Initializable {

	@FXML
	TextField pathfield;
	@FXML
	TextArea contentsArea;
	private File file;
	private FileChooser chooser;
	private FileWriter writer;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void openAction() throws Exception {
		chooser = new FileChooser();
		file = chooser.showOpenDialog(null);
		pathfield.setText(file.getPath());
		// 파일 입력
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String temp;
		StringBuffer buffer = new StringBuffer();
		while ((temp = reader.readLine()) != null) {
			buffer.append(temp + "\n");
		}
		contentsArea.setText(buffer.toString());
		reader.close();

	}

	@FXML
	public void saveAction() throws Exception {
		writer = new FileWriter(file);
		writer.write(contentsArea.getText());
		writer.close();
	}

	@FXML
	public void newSaveAction() throws Exception {
		file = chooser.showOpenDialog(null);
		writer.write(contentsArea.getText());

	
		
		
	}
	
}
