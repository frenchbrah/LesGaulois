package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return "Gaulois []";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);

		int forceCoup = (force * this.effetPotion) / 3;
		if (this.effetPotion == 1) {
			romain.recevoirCoup(force);
		} else {
			romain.recevoirCoup(forceCoup);
			this.effetPotion -= 1;
		}
	}

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		if (this.village == null) {
			System.out.println(this.prendreParole() + "Bonjour, je m'appelle " + this.getNom()
					+ ". Je voyage de village en village");
		}
		if (this.village.getChef() == this) {
			System.out.println(this.prendreParole() + "Bonjour, je m'appelle " + this.getNom()
					+ " Je suis le chef du village " + this.village.getNom());
		} else {
			System.out.println(this.prendreParole() + "Bonjour, je m'appelle " + this.getNom()
					+ " J'habite dans le village " + this.village.getNom());
		}
	}

}
