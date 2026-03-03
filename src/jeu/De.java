package jeu;
import java.util.Random;//la librairie permettant de générer aleatoirement les nombres de 1 à 6

public class De {
//Création des attributs
	private Random random; //pour generer des nombres de 1 à 6

	//Création du constructeur
	public De() {
		random = new Random();
		
	}
	
	//Création de la méthode lancerDe()
	public int lancerDe() {
		return random.nextInt(6) + 1;
	}
}
