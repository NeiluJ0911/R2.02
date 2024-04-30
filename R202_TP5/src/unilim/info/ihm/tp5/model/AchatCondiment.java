package unilim.info.ihm.tp5.model;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class AchatCondiment {
	
	public String nom;
	public Color color;
	public ImageView image;
	public String prix;
	public String quantite;
	
	public AchatCondiment(String nom, Color color, ImageView image, String prix, String quantite) {
		
		this.nom = nom;
		this.color = color;
		this.image = image;
		this.prix = prix;
		this.quantite = quantite;
	}
}
