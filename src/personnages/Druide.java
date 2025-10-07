package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron(0, 0);
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

	public void boosterGaulois(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom().equals("Obélix")) {
				parler("Non, " + gaulois.getNom()
						+ " Non! Et tu le sais très bien tu est tombé dans la marmite lorsque tu étais petit");
			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			}
		} else {
			parler("Désolé " + gaulois.getNom() + " je n'ai plus de potion magique.");
		}
	}
}