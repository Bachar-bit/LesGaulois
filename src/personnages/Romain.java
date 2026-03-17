package personnages;

import java.io.ObjectInputStream.GetField;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() : "Invariant violé : la force doit être >= 0";
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
    private boolean isInvariantVerified() {
        return force >= 0;
    }

	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
        if (force < 1) {
            this.force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }
        assert isInvariantVerified() : "Invariant violé : la force doit être >= 0";
	}
	
    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
    }
}
