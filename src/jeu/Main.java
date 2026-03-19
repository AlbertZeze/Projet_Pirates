package jeu;

public class Main {
public static void main(String[] args) {
	Jeu jeu = new Jeu();//on ne sait pas quelle interface le jeu utilise pour lancer le jeu
	jeu.lancerJeu();
}
}
