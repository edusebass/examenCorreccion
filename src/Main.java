import java.lang.reflect.Array;
import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //objeto1
        Pais pais1 = new Pais("España", "Europa");
        //objeto2
        Provincia prov1 = new Provincia("Ecuador", "America", "Pichincha");
        //objeto 3
        Ciudad ciu1 = new Ciudad("España", "Europa", "Andalucia", "Granada");
        //objeto 4
        Barrio bar1 = new Barrio("Ecuador", "America", "Cuenca", "Cuenca capital", "Jaime Roldos", 4000);


        //Array de la clase base
        Pais[] objetos = new Pais[4];

        //Almacena los objetos en el array
        objetos[0] = pais1;
        objetos[1] = prov1;
        objetos[2] = ciu1;
        objetos[3] = bar1;

        //Accede a los objetos del array
        Pais primerObjeto = objetos[0];
        Provincia segundoObjeto = (Provincia) objetos[1];
        Ciudad tercerObjeto = (Ciudad) objetos[2];
        Barrio cuartoObjeto = (Barrio) objetos[3];
        System.out.println(objetos[0]);
    }
}