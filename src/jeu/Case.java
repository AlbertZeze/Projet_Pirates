package jeu;

public abstract class Case {
	//Déclaration des attributs
	protected int numeroCase;//puisque la classe est abstraite; les attributs sont de types protected
	
	//création du constructeur
	public Case(int numeroCase) {
		this.numeroCase=numeroCase;
	}

	//Le getteur
	public int getNumeroCase() {
		return numeroCase;
	}

	public abstract void declencherAction(Joueur joueur1, Joueur joueur2);
}
