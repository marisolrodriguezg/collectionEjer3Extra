
package collectionextra3libreria;

import Entidades.Libro;
import Servicio.LibroServicio;
import java.util.Scanner;

public class CollectionExtra3Libreria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroServicio ls = new LibroServicio();

        String respuesta = "";
        do {
            ls.crearLibro();

            System.out.println("Quiere ingresar otro Producto?(si/no)");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));
        ls.mostrarLibro();
        
       ls.prestarLibro();
       ls.mostrarLibro();
       ls.devolverLibro();
    }

}
