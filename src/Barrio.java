public class Barrio extends Ciudad{
    private String nomb_ba;
    private int num_hab;

    //constructor
    public Barrio(String nom_pais, String continente_pais, String nom_prov, String nom_ciu, String nomb_ba, int num_hab) {
        super(nom_pais, continente_pais, nom_prov, nom_ciu);
        this.nomb_ba = nomb_ba;
        this.num_hab = num_hab;
    }

    //getters and setters
    public String getNomb_ba() {
        return nomb_ba;
    }

    public void setNomb_ba(String nomb_ba) {
        this.nomb_ba = nomb_ba;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        if (num_hab < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.num_hab = num_hab;
    }

    //metodos
    public void barriom() {
        System.out.println("Soy un barrio");
    }
}
