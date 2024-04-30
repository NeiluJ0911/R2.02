package unilim.info.ihm.tp2.exo1; 

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormInscriptionFX extends Application {
    private Label lblTitreHaut;
    private Label lblTitreHaut2;
    private Label lblCivilite;
    private ComboBox<String> cbbCivilite;
    private Label lblNom;
    private TextField tfdNom;
    private Label lblPrenom;
    private TextField tfdPrenom;
    private Label lblEmail;
    private TextField tfdEmail;
    private Label lblConfirmeEmail;
    private TextField tfdConfirmeEmail;
    private CheckBox chbCGU;
    private Label lblCGU;
    private Button btnSouscrire;
    private Label lblInscrit;
    private VBox vBoxBouton;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.lblTitreHaut = new Label();
        this.lblTitreHaut.setText("Souscrivez à notre newsletter !");
        this.lblTitreHaut.setAlignment(Pos.CENTER);
        this.lblTitreHaut.setMaxWidth(Double.MAX_VALUE);
        this.lblTitreHaut.setUnderline(true);

        this.lblTitreHaut2 = new Label();
        this.lblTitreHaut2.setText("Bienvenue à notre newsletter, inscrivez-vous pour avoir des nouvelles.");
        this.lblTitreHaut2.setAlignment(Pos.CENTER);
        this.lblTitreHaut2.setMaxWidth(Double.MAX_VALUE);

        String civilite[] = {"M.", "Mme", "Mlle"};

        this.lblCivilite = new Label("Civilité");
        this.cbbCivilite = new ComboBox<String>();
        this.cbbCivilite.getItems().addAll(civilite);
        this.cbbCivilite.setValue(civilite[0]);

        this.lblNom = new Label("Nom");
        this.tfdNom = new TextField();

        this.lblPrenom = new Label("Prénom");
        this.tfdPrenom = new TextField();

        this.lblEmail = new Label("Adresse email");
        this.tfdEmail = new TextField();

        this.lblConfirmeEmail = new Label("Confirmez votre email");
        this.tfdConfirmeEmail = new TextField();

        this.chbCGU = new CheckBox();
        this.lblCGU = new Label("J'accepte les conditions générales d'utilisation de la newsletter");

        this.vBoxBouton = new VBox();
        this.btnSouscrire = new Button();
        this.btnSouscrire.setText("Souscrire");
        this.lblInscrit = new Label("Utilisateur non inscrit");

        BorderPane root = new BorderPane();

        GridPane grid = new GridPane();

        grid.add(this.lblCivilite, 0, 0);
        grid.add(this.cbbCivilite, 0, 1);
        grid.add(this.lblNom, 0, 2);
        grid.add(this.tfdNom, 0, 3);
        grid.add(this.lblPrenom, 2, 2);
        grid.add(this.tfdPrenom, 2, 3);
        grid.add(this.lblEmail, 0, 4);
        grid.add(this.tfdEmail, 0, 5);
        grid.add(this.lblConfirmeEmail, 2, 4);
        grid.add(this.tfdConfirmeEmail, 2, 5);
        grid.add(this.chbCGU, 0, 6);
        grid.add(this.lblCGU, 2, 6);

        grid.setHgap(10);
        grid.setVgap(12);

        VBox box = new VBox();

        box.setPadding(new Insets(10));
        box.getChildren().addAll(lblTitreHaut, lblTitreHaut2);
        box.setSpacing(10);

        BorderPane.setMargin(box, new Insets(0, 0, 10, 0));
        root.setTop(box);

        BorderPane.setMargin(grid, new Insets(0, 0, 0, 30));
        root.setCenter(grid);
        
        vBoxBouton.setAlignment(Pos.CENTER);

        vBoxBouton.getChildren().addAll(btnSouscrire, lblInscrit);
        root.setBottom(this.vBoxBouton);

        VBox.setMargin(this.btnSouscrire, new Insets(15, 15, 15, 15));
        BorderPane.setAlignment(this.vBoxBouton, Pos.CENTER);

        Scene scene = new Scene(root, 600, 450);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Application Newsletter");
        primaryStage.show();
    }
}
