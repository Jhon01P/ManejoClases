
package ec.edu.intsuperior.modelo;


public class Genero {
     private String masculino;
     private String femenino;

    public Genero() {
    }

    public Genero(String masculino, String femenino) {
        this.masculino = masculino;
        this.femenino = femenino;
    }

    public String getMasculino() {
        return masculino;
    }

    public void setMasculino(String masculino) {
        this.masculino = masculino;
    }

    public String getFemenino() {
        return femenino;
    }

    public void setFemenino(String femenino) {
        this.femenino = femenino;
    }
     
}
