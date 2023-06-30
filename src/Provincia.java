public class Provincia extends Pais{
    private String nom_prov;

    //constructor
    public Provincia(String nom_pais, String continente_pais, String nom_prov) {
        super(nom_pais, continente_pais);
        this.nom_prov = nom_prov;
    }

    //getters and setters
    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    //metodos
    public void provinciam() {
        System.out.println("Soy una provincia");
    }
}
