package LesGaulois;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		System.out.println(
				"J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
		chaudron.remplirChaudron(quantite, forcePotion);
	}
}
