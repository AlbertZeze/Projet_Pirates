package jeu;
import java.util.Random;
public class CaseRouletteRusse extends Case {
	
	public CaseRouletteRusse(int numeroCase) {
		super(numeroCase);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
	//Pour générer aleatoirement un nombre;
		Random random = new Random();
	//nous utiliserons une variable nouvellePosition pour stocker ce resultat
		int nouvellePosition = random.nextInt(30)+1;
		//nous ferons un retour à une nouvelle positon
		joueur1.avancer(nouvellePosition - joueur1.getPositionPlateau());
		System.out.println("Roulette russe ! Nouvelle position : " +joueur1.getPositionPlateau() );
	}
}
