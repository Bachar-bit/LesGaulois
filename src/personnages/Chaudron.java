package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public boolean remplirChaudron(int quantite, int forcePotion) {
        this.quantitePotion = quantite;
        this.forcePotion = forcePotion;
        return true;
    }

	public int prendreLouche() {
        quantitePotion--;
        return forcePotion;
    }

    public boolean resterPotion() {
        return quantitePotion != 0;
    }

}
