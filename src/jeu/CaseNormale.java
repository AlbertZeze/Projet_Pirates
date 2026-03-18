package jeu;

public class CaseNormale extends Case {
	//Création du constructeur
	public CaseNormale(int numeroCase,IAffichage affichage) {
		super(numeroCase,affichage);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
		//System.out.println(" Case normale : Rien ne se passe");
		affichage.afficherCaseNormale();
	}
}
