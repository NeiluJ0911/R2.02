package unilim.info.ihm.tp3;

import java.io.File;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import unilim.info.ihm.tp3.model.AchatCondiment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	/*
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane root = new GridPane();
		root.setMinWidth(800);
		root.setMaxWidth(800);
		Scene scene = new Scene(root, 750, 500);
		
		Label titreSauvegardeCondiment = new Label();
		titreSauvegardeCondiment.setText("Sauvegarde de condiment");
		
		Label titreListeCondiment = new Label();
		titreListeCondiment.setText("Liste des condiments");
		
		Label labelNom = new Label();
		labelNom.setText("Nom* :");
		TextField taperNom = new TextField();
		
		Label labelType = new Label();
		labelType.setText("Type* :");
		TextField taperType = new TextField();
		
		Label labelPrix = new Label();
		labelPrix.setText("Prix* :");
		TextField taperPrix = new TextField();
		
		Label labelQuantite = new Label();
		labelQuantite.setText("Quantité* :");
		TextField taperQuantite = new TextField();
		
		Label labelImage = new Label();
		labelImage.setText("Image* :");
		FileChooser dialogueChoisirImage = new FileChooser();
        Button boutonChoisirImage = new Button("Photo");
        Label labelImageChemin = new Label();
        labelImageChemin.setText("");
 
        boutonChoisirImage.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(final ActionEvent e) {
                    File file = dialogueChoisirImage.showOpenDialog(primaryStage);
                    
                    if (file != null) {
                        labelImageChemin.setText(file.getPath());
                    }
                    
                }
            });
        
        
        Button boutonSauvegarder = new Button("Sauvegarder");
        boutonSauvegarder.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(final ActionEvent e) {
                    	Color couleur = null;
                    	if (taperType.getText() == "Fruit") {
                    		couleur = Color.RED;
                    	} else if (taperType.getText() == "Légume"){
                    		couleur = Color.GREEN;
                    	}
                    	
                    	ArrayList<AchatCondiment> condiments = new ArrayList<>();
                    	
                        condiments.add(new AchatCondiment(taperNom.getText(), couleur, new ImageView(new Image(labelImageChemin.getText())), taperPrix.getText(), taperQuantite.getText()));
                        
                    }
                });
            
            
		

		VBox vboxGauche = new VBox(titreSauvegardeCondiment, labelNom, taperNom, labelType, taperType, labelPrix, taperPrix, labelQuantite, taperQuantite, labelImage, labelImageChemin, boutonChoisirImage, boutonSauvegarder);
		vboxGauche.setMinWidth(350);
		vboxGauche.setPadding(new Insets(10));
		VBox vboxDroite = new VBox(titreListeCondiment);
		vboxDroite.setMinWidth(350);
		root.add(vboxGauche,0,0);
		root.add(vboxDroite,1,0);
		
		primaryStage.setTitle("Outils d'achat de condiment");
		primaryStage.setScene(scene);
		primaryStage.setWidth(700);
		primaryStage.setHeight(500);
		primaryStage.show();
		*/
		// Instanciation des différents composants
		
		Label titreSouligne = new Label();
		titreSouligne.setText("Souscrivez à notre newsletter !");
		
		Label bienvenue = new Label();
		bienvenue.setText("Bienvenue à notre newsletter, inscrivez-vous pour avoir des nouvelles.");
		
		Label civilite = new Label();
		civilite.setText("Civilité");
		
		ComboBox<String> civiliteListe = new ComboBox<>();
		civiliteListe.getItems().addAll("M.","Mme","Mlle");
		civiliteListe.setValue("M.");
		
		Label nom = new Label();
		nom.setText("Nom");
		TextField taperNom = new TextField();
		
		Label erreurNom = new Label();
		erreurNom.setText("Le nom est obligatoire");
		erreurNom.setVisible(false);
		erreurNom.setPadding(new Insets(50, 0, 0, 0));
		erreurNom.setTextFill(Color.RED);
		
		
		Label prenom = new Label();
		prenom.setText("Prénom");
		TextField taperPrenom = new TextField();
		
		Label erreurPrenom = new Label();
		erreurPrenom.setText("Le prénom est obligatoire");
		erreurPrenom.setVisible(false);
		erreurPrenom.setPadding(new Insets(50, 0, 0, 0));
		erreurPrenom.setTextFill(Color.RED);
		
		Label email = new Label();
		email.setText("Adresse email");
		TextField taperEmail = new TextField();
		
		Label erreurMail = new Label();
		erreurMail.setText("Le mail est obligatoire");
		erreurMail.setVisible(false);
		erreurMail.setPadding(new Insets(50, 0, 0, 0));
		erreurMail.setTextFill(Color.RED);
		
		Label confirmeEmail = new Label();
		confirmeEmail.setText("Confirmer votre email");
		TextField taperConfirmeEmail = new TextField();
		
		Label erreurConfirmeEmail = new Label();
		erreurConfirmeEmail.setText("La vérification du mail est obligatoire");
		erreurConfirmeEmail.setVisible(false);
		erreurConfirmeEmail.setPadding(new Insets(50, 0, 0, 0));
		erreurConfirmeEmail.setTextFill(Color.RED);
		
		Button souscrire = new Button();
		souscrire.setText("Souscrire");
		
		souscrire.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event filter");
			}
		});
		
		souscrire.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("event handler");
			}
		});
		
		Label erreurConditions = new Label("il faut accepter les CGU");
		erreurConditions.setVisible(false);
		erreurConditions.setPadding(new Insets(20, 0, 0, 0));
		erreurConditions.setTextFill(Color.RED);
		
		CheckBox chkConditions = new CheckBox();
		Label lblConditions = new Label("J'accepte les conditions générales d'utilisation de la newsletter");
		
		souscrire.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("convenience method");
				if (taperNom.getLength() == 0) {
					erreurNom.setVisible(true);
				}
				if (taperPrenom.getLength() == 0) {
				erreurPrenom.setVisible(true);
				}
				if (taperEmail.getLength() == 0) {
				erreurMail.setVisible(true);
				}
				if (taperConfirmeEmail.getLength() == 0) {
				erreurConfirmeEmail.setVisible(true);
				}
				if (!chkConditions.isSelected()){
					erreurConditions.setVisible(true);
				}
			}
		});
		

		
		
		
		Label etatSouscrire = new Label("Utilisateur non inscrit");
		
		
		
		
		// Format du texte des composants
		
		titreSouligne.setUnderline(true);
		titreSouligne.setPadding(new Insets(0, 0, 10, 0));
		

		vboxHaut.setAlignment(Pos.CENTER);
		
		GridPane grid = new GridPane();
		root.setCenter(grid);
		
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setPadding(new Insets(0, 0, 0, 20));
		grid.setHgap(20);
		grid.setVgap(15);
		
		grid.add(civilite, 0, 0);
		grid.add(civiliteListe, 0, 1);
		
		grid.add(nom, 0, 2);
		grid.add(prenom, 1, 2);
		
		grid.add(taperNom, 0, 3);
		
		grid.add(taperPrenom, 1, 3);

		
		grid.add(email, 0, 5);
		grid.add(confirmeEmail, 1, 5);
		
		grid.add(taperEmail, 0, 6);
		grid.add(taperConfirmeEmail, 1, 6);
		

		grid.add(erreurNom, 0, 3);
		grid.add(erreurPrenom, 1, 3);
		grid.add(erreurMail, 0, 6);
		grid.add(erreurConfirmeEmail, 1, 6);
		
		HBox conditions = new HBox(chkConditions, lblConditions);
		conditions.setPadding(new Insets(0, 0, 0, 0));
		
		grid.add(conditions, 0, 7);
		grid.add(erreurConditions, 0, 7);
		
		
		
		VBox btnSouscrire = new VBox(souscrire, etatSouscrire);
		grid.add(btnSouscrire, 0, 0);
		root.setBottom(btnSouscrire);
		btnSouscrire.setAlignment(Pos.CENTER);
		btnSouscrire.setPadding(new Insets(0, 0, 30, 0));	
		
		
		// Instanciation de la scène
		
	}

}
