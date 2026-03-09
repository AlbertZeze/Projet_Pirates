package jeu;

public class CaseNormale extends Case {
	//Création du constructeur
	public CaseNormale(int numeroCase) {
		super(numeroCase);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
		System.out.println(" Case normale : Rien ne se passe");
	}
}
