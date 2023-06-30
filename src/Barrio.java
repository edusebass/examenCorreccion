public class Barrio extends Ciudad{
    private String nomb_ba;
    private int num_hab;

    //constructor
    public Barrio(String nom_pais, String continente_pais, String nom_prov, String nom_ciu, String nomb_ba, int num_hab) {
        super(nom_pais, continente_pais, nom_prov, nom_ciu);
        this.nomb_ba = nomb_ba;
        this.num_hab = num_hab;
    }
}
