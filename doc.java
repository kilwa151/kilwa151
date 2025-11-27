 class doc{
	private String titre;
	private String auteur;
	private int anneePublication;
	
	public doc() {
		
	}
	public doc(String titre, String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
		
	}
	public String getTitre (){
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public int getAnneePublication () {
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
		System.out.println("le titre est : " + titre);
		System.out.println("l'auteur : "+auteur);
		System.out.println("l'annee de publication : " + anneePublication);
	}

	
}

class Main{
    public static void main(String[] args) {
        doc doc1 = new doc("Harry Potter", "J. K. Rowling", 1997);
        doc1.afficher();
    }
}