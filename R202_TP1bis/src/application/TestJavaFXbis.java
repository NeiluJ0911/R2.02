package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestJavaFXbis extends javafx.application.Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button bouton = new Button();
		bouton.setText("Valider");
		
		StackPane root = new StackPane();
		root.getChildren().add(bouton);
		
		Scene scene = new Scene(root,600,250);
		
		primaryStage.setTitle("Première fenêtre");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

