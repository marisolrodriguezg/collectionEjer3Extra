
package Entidades;
//La clase Libro debe guardar el título del libro,
//autor, número de ejemplares y número de ejemplares prestados.

import java.util.Objects;

public class Libro {
    String titulo;
    String Autor;
    int numEjemplares;
    int numEjePrestados;

    public Libro() {
    }

    public Libro(String titulo, String Autor, int numEjemplares, int numEjePrestados) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.numEjemplares = numEjemplares;
        this.numEjePrestados = numEjePrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjePrestados() {
        return numEjePrestados;
    }

    public void setNumEjePrestados(int numEjePrestados) {
        this.numEjePrestados = numEjePrestados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.numEjemplares);
        hash = 97 * hash + Objects.hashCode(this.numEjePrestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.Autor, other.Autor)) {
            return false;
        }
        if (!Objects.equals(this.numEjemplares, other.numEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numEjePrestados, other.numEjePrestados)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", Autor=" + Autor + ", numEjemplares=" + numEjemplares + ", numEjePrestados=" + numEjePrestados + '}';
    }
    
}
