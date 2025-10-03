package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		if (this.quantitePotion <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion += quantite;
	}
}
