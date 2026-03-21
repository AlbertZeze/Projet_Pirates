package jeu;
import java.util.Random;
public class CaseRouletteRusse extends Case {
	
	public CaseRouletteRusse(int numeroCase,IAffichage affichage) {
		super(numeroCase,affichage);
	}
	
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
	
		Random random = new Random();
	
		int nouvellePosition = random.nextInt(30)+1;
		
		joueur1.avancer(nouvellePosition - joueur1.getPositionPlateau());
		
	
		affichage.afficherCaseRusse(joueur1.getPositionPlateau());
	}
}
