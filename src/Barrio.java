public class Barrio {
    private String nom_pais;
    private String continente_pais;

    // constructor
    public Barrio(String nom_pais, String continente_pais) {
        this.nom_pais = nom_pais;
        this.continente_pais = continente_pais;
    }

    //getters and setters
    public String getNom_pais() {
        return nom_pais;
    }

    public void setNom_pais(String nom_pais) {
        this.nom_pais = nom_pais;
    }

    public String getContinente_pais() {
        return continente_pais;
    }

    public void setContinente_pais(String continente_pais) {
        this.continente_pais = continente_pais;
    }

    // metodo
    public void paism() {
        System.out.println("Soy un pais");
    }
}
