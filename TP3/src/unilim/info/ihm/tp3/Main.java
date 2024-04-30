package unilim.info.ihm.tp3;

import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import unlim.info.ihm.tp3.controller.ChoixPhotoController;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Instanciation des différents composants
		
		Label titreSauvegarde = new Label();
		titreSauvegarde.setText("Sauvegarde de condiment");
		
		Label titreListe = new Label();
		titreListe.setText("Liste des condiments");
		
		
		Label nom = new Label();
		nom.setText("Nom *:");
		TextField taperNom = new TextField();
		
		Label erreurNom = new Label();
		erreurNom.setText("Le nom est obligatoire");
		erreurNom.setVisible(false);
		erreurNom.setPadding(new Insets(5, 0, 0, 0));
		erreurNom.setTextFill(Color.RED);
		
		
		Label type = new Label();
		type.setText("Type *:");
		TextField taperType = new TextField();
		
		Label erreurType = new Label();
		erreurType.setVisible(false);
		erreurType.setPadding(new Insets(5, 0, 0, 0));
		erreurType.setTextFill(Color.RED);
		
		
		Label prix = new Label();
		prix.setText("Prix *:");
		TextField taperPrix= new TextField();
		
		Label erreurPrix = new Label();
		erreurPrix.setText("Le prix est obligatoire");
		erreurPrix.setVisible(false);
		erreurPrix.setPadding(new Insets(5, 0, 0, 0));
		erreurPrix.setTextFill(Color.RED);
		
		
		Label quantite = new Label();
		quantite.setText("Quantité *:");
		TextField taperQuantite = new TextField();
		
		Label erreurQuantite = new Label();
		erreurQuantite.setText("La quantité est obligatoire");
		erreurQuantite.setVisible(false);
		erreurQuantite.setPadding(new Insets(5, 0, 0, 0));
		erreurQuantite.setTextFill(Color.RED);
		
		
		Label image = new Label();
		image.setText("Image *:");
		
		Label cheminImage = new Label();
		cheminImage.setText("");
		
		Button photo = new Button();
		photo.setText("Photo");
		
		Button sauvegarder = new Button();
		sauvegarder.setText("Sauvegarder");
		
		sauvegarder.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event filter");
			}
		});
		
		sauvegarder.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event handler");
			}
		});
		
			
		sauvegarder.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("convenience method");
				if (taperNom.getLength() == 0) {
					erreurNom.setVisible(true);
				}
				else {
					erreurNom.setVisible(false);
				}
					
				if (taperType.getLength() == 0) {
					erreurType.setText("Le type est obligatoire");
					erreurType.setVisible(true);
				}
				else {
					if(!taperType.getText().equals("Fruit") && !taperType.getText().equals("Légume")) {
						erreurType.setText("Le type doit être Fruit ou Légume");
					}
					else {
						erreurType.setVisible(false);
					}
				}
				if (taperPrix.getLength() == 0) {
					erreurPrix.setVisible(true);
				}
				else {
					erreurPrix.setVisible(false);
				}
				if (taperQuantite.getLength() == 0) {
					erreurQuantite.setVisible(true);
				}
				else {
					erreurQuantite.setVisible(false);
				}
			}
		});
		
		photo.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event filter");
			}
		});
		
		photo.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event handler");
			}
		});
		
		photo.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				ChoixPhotoController choixPhotoController = new ChoixPhotoController(cheminImage, primaryStage);
				choixPhotoController.choisirImage();
			}
		});
		
		GridPane root = new GridPane();
		
		
		// Format du texte des composants
		
		VBox vboxSauvegarde = new VBox(titreSauvegarde,nom,taperNom,erreurNom,type,taperType,erreurType,prix,taperPrix,erreurPrix,quantite,taperQuantite,erreurQuantite,image,cheminImage,photo,sauvegarder);
		vboxSauvegarde.setSpacing(0);
		vboxSauvegarde.setPadding(new Insets(10,2,10,20));
		vboxSauvegarde.setMinWidth(390);
		root.add(vboxSauvegarde, 0, 0);
		
		VBox vboxListe = new VBox(titreListe);
		vboxListe.setPadding(new Insets(10,20,10,2));
		vboxListe.setMinWidth(390);
		root.add(vboxListe, 1, 0);
		
		// Instanciation de la scène
		
		Scene scene = new Scene(root, 800, 500);
		
		primaryStage.setTitle("Outils d'achat de condiment");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}