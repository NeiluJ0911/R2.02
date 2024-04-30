package unlim.info.ihm.tp3.controller;

import java.io.File;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ChoixPhotoController implements EventHandler<MouseEvent> {

	private Stage mainStage;
	private Label lblPhoto;
	
	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
	public ChoixPhotoController(Label lblPhoto,Stage mainStage) {
		this.mainStage = mainStage;
		this.lblPhoto = lblPhoto;
	}
	
	public void choisirImage() {
	    FileChooser fileChooser = new FileChooser();
	    FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("Images", "*.jpg", "*.png", "*.gif");
	    fileChooser.getExtensionFilters().add(extensionFilter);

	    File file = fileChooser.showOpenDialog(mainStage);
	    if (file != null) {
	        lblPhoto.setText(file.getAbsolutePath());
	    }
	}
	

}
