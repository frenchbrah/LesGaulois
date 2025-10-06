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

	public int prendreLouche() {
		if (this.quantitePotion >= 1) {
			this.quantitePotion -= 1;
			return this.forcePotion;
		} else {
			this.forcePotion = 0;
			return this.forcePotion;
		}

	}
}
