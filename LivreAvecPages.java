class DOC {
    protected  String titre;
    protected String auteur;
    protected  int anneePublication;

    public DOC(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
}
 public int getAnneePublication() {
        return anneePublication;
}

    public void setTitre(String titre) {
        this.titre = titre;
}

    public void setAuteur(String auteur) {
        this.auteur = auteur;
}

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
}

public void afficher() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Année de publication: " + anneePublication);
}
public String getTitre() {
        return titre;
}

    public String getAuteur() {
        return auteur;
}
    @Override
    public String toString(){
        return "DOC" +
        "titre: " + titre + "  "
        +"auteur: " + auteur + "  " +
        "anneePublication: " + anneePublication;    
    }
}


//la class fille

public class LivreAvecPages extends DOC {
    private int nombrePage;

    public LivreAvecPages(String titre, String auteur, int anneePublication, int nombrePage) {
        // Appel au constructeur de la classe mère
        super(titre, auteur, anneePublication); 
        this.nombrePage = nombrePage;
}
    public int getNombrePage() {
        return nombrePage;
}

    public void setNombrePage(int nombrePage) {
        this.nombrePage = nombrePage;
}
    @Override
    public void afficher() {
        super.afficher(); 
        System.out.println("Nombre de pages: " + nombrePage);
}
}

//classe fille 2
class magazine extends DOC{
    private final int moiPublication;
    private final int numeropublication;
    public magazine(String titre, String auteur, int anneePublication,int moiPublication,int numeropublication){
        super(titre, auteur, anneePublication);
        this.moiPublication=moiPublication;
        this.numeropublication=numeropublication;    
}
@Override
    public void afficher(){
        super.afficher();
        System.out.println("Mois de publication: " + moiPublication);
        System.out.println("Numero de publication: " + numeropublication);
    }
    @Override
    public String toString(){
        return "Magazing" +
        "titre: " + titre + "  "
        +"auteur: " + auteur + "  "
        +"anneePublication: " + anneePublication + "  " +
        "moiPublication: " + moiPublication + "  " + 
        "numeropublication: " + numeropublication;
    }
    
}