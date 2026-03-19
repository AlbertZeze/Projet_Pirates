package jeu;

public abstract class Case {
	
	protected int numeroCase;
	protected IAffichage affichage;
	
	
	public Case(int numeroCase,IAffichage affichage) {
		this.numeroCase=numeroCase;
		this.affichage=affichage;
	}

	
	public int getNumeroCase() {
		return numeroCase;
	}

	public abstract void declencherAction(Joueur joueur1, Joueur joueur2);
}
