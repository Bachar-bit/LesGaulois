package personnages;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;
    
    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.chaudron = new Chaudron();
    }
    
    public String getNom() {
        return nom;
    }
    
    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }
    
    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }
    
    public void fabriquerPotion(int quantite, int forcePotion) {
        chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concoct� " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }
    
    public void booster(Gaulois gaulois) {
        if (chaudron.restePotion()) {
            int forcePotion = chaudron.prendreLouche();
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
        } else {
            parler("D�sol� " + gaulois.getNom() + " il n'y a plus une goutte de potion.");
        }
    }
}
