package jeu;

public class CaseNormale extends Case {
	
	public CaseNormale(int numeroCase,IAffichage affichage) {
		super(numeroCase,affichage);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
		affichage.afficherCaseNormale();
	}
}
