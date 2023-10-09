public class Livre {
    private int id, prix;
    private String titre, auteur;
    public int count;
    public Livre(int id, int prix, String titre, String auteur){
       count++;
        this.id=id;
        this.prix=prix;
        this.auteur=auteur;
        this.titre=titre;

    }
    //public String toString(){
     //   return (this.id +" ," +this.prix+" ," +this.auteur+" ," +this.titre);

    //}
}
