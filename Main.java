//la class principale
public class Main {
    public static void main(String[] args) {
        LivreAvecPages livre = new LivreAvecPages("THHBCCHH", "GTUUCFIJD", 1774, 328 );
        livre.afficher();
        DOC doc1 = new magazine("", "", 0, 0, 0);
        System.out.println(doc1.toString());

}
}