
package ec.edu.intsuperior.modelo;
public class Parroquia {
     private String idParroquia;
     private String nombreParroquia;
     private Barrio barrio;

    public Parroquia() {
    }

    public Parroquia(String idParroquia, String nombreParroquia, Barrio barrio) {
        this.idParroquia = idParroquia;
        this.nombreParroquia = nombreParroquia;
        this.barrio = barrio;
    }

    public String getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(String idParroquia) {
        this.idParroquia = idParroquia;
    }

    public String getNombreParroquia() {
        return nombreParroquia;
    }

    public void setNombreParroquia(String nombreParroquia) {
        this.nombreParroquia = nombreParroquia;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    
}
