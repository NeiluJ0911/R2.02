package unlim.info.ihm.tp3.controller;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
	

}
