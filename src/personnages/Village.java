package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] tabVillageois;
	private int nbVillageoisMax;

	public Village(String nom, int nbVillageoisMax, Gaulois chef) {
		super();
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.nbVillageoisMax = nbVillageoisMax;
		this.tabVillageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	int indiceVillageois = 0;

	public void ajouterVillageois(Gaulois gaulois) {
		this.tabVillageois[indiceVillageois] = gaulois;
		indiceVillageois++;
		this.nbVillageois++;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int numeroVillageois) {
		if (this.tabVillageois[numeroVillageois - 1] == null) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		} else {
			return (this.tabVillageois[numeroVillageois - 1]);
		}

	}

	public void afficherVillageois(Village village) {
		System.out.println("Dans le village " + this.getNom() + " du chef " + this.getChef().getNom()
				+ " vivent les légendaires Gaulois : \n");
		for (Gaulois gaulois : this.tabVillageois) {
			if (gaulois != null) {
				System.out.println("- " + gaulois.getNom());
			}
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 6);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois(village);
		Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		obelix.sePresenter();
		doublePolemix.sePresenter();
	}
}

//numeroVillageois
//setVillage