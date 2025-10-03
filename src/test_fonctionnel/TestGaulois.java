package test_fonctionnel;

import LesGaulois.Gaulois;
import LesGaulois.Romain;

public class TestGaulois {
	public static void main(String args[]) {
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Gaulois Obelix = new Gaulois("Obélix", 16);
		Asterix.parler("Bonjour Obélix");
		Obelix.parler("Bonjoux Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée mon brave");
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la forêt " + Asterix.getNom() + " et " + Obelix.getNom()
				+ " tombent nez à nez sur le romain " + minus.getNom());
		for (

				int i = 0; i < 3; i++) {
			Asterix.frapper(minus);
		}

	}
}