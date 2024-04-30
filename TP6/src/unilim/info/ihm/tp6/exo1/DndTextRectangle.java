package unilim.info.ihm.tp6.exo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DndTextRectangle extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text dragText = new Text(50,50,"DRAG ME");
		Text dropText = new Text(300,50,"DROP HERE");

		Group root = new Group();
		root.getChildren().add(dragText);
		root.getChildren().add(dropText);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Etude du mécanisme de Drag and Drop");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(100);
		primaryStage.show();
		
	}

}
