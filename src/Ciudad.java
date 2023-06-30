public class Ciudad extends Provincia{
    private String nom_ciu;

    //constructor
    public Ciudad(String nom_pais, String continente_pais, String nom_prov, String nom_ciu) {
        super(nom_pais, continente_pais, nom_prov);
        this.nom_ciu = nom_ciu;
    }

    //getters and setters

    public String getNom_ciu() {
        return nom_ciu;
    }

    public void setNom_ciu(String nom_ciu) {
        this.nom_ciu = nom_ciu;
    }

    //metodo
    public void ciudadm() {
        System.out.println("Soy una ciudad");
    }
}
