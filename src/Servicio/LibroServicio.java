
package Servicio;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LibroServicio {
    private HashSet<Libro> libreria; // Creo el mapa
    private Scanner leer; 

    public LibroServicio() {
        this.libreria=new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    public Libro crearLibro(){
        
            Libro lb=new Libro();
        
        System.out.println("titulo del libro");
        lb.setTitulo(leer.next());
        System.out.println("autor");
        lb.setAutor(leer.next());
        System.out.println("cantidad de ejemplares");
        lb.setNumEjemplares(leer.nextInt());
        System.out.println("ejemplares prestados");
        lb.setNumEjePrestados(leer.nextInt());
    libreria.add(lb);
        return lb;
        
        }
    public void mostrarLibro(){
        
        for (Libro aux : libreria) {
        System.out.println(aux);
        }
    }
    public void prestarLibro() {
        System.out.println("que libro desea buscar");
        String titulo = leer.next();

        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libreria.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro l = it.next();
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                libroEncontrado = l;

                String rta = "";
                System.out.println("quiere pedir un ejemplar ");
                rta = leer.next();
                if (rta.equalsIgnoreCase("si")) {
                    if (l.getNumEjemplares() > l.getNumEjePrestados()) {

                        int prestados = l.getNumEjePrestados() + 1;

                        l.setNumEjePrestados(prestados);
                        System.out.println("se encontro" + l);
                    } else {

                        System.out.println("no se encontro ese librro");
                    }
                }

            }
        }
    }
       public void devolverLibro() {
        System.out.println("que libro desea devolver");
        String titulo = leer.next();

        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libreria.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro l = it.next();
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                libroEncontrado = l;
                        int prestados = l.getNumEjePrestados() - 1;

                        l.setNumEjePrestados(prestados);
                        System.out.println("gracias por devolver " + l);
                    } else {

                        System.out.println("no se encontro ese librro");
                    }
                }

            }
        }
    

