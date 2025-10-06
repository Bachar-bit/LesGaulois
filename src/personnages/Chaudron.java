package personnages;

public class Chaudron {
    private int quantitePotion;
    private int forcePotion;
    
    public Chaudron() {
        this.quantitePotion = 0;
        this.forcePotion = 0;
    }
    
    public void remplirChaudron(int quantite, int forcePotion) {
        this.quantitePotion = quantite;
        this.forcePotion = forcePotion;
    }
    
    public boolean restePotion() {
        return quantitePotion > 0;
    }
    
    public int prendreLouche() {
        if (quantitePotion > 0) {
            quantitePotion--;
            return forcePotion;
        }
        return 0;
    }
}