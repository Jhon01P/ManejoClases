
package ec.edu.intsuperior.modelo;


public class Canton {
   private String idCanton;
   private String nombreCanton;
   private Parroquia parroquia;

    public Canton() {
    }

    public Canton(String idCanton, String nombreCanton, Parroquia parroquia) {
        this.idCanton = idCanton;
        this.nombreCanton = nombreCanton;
        this.parroquia = parroquia;
    }

    public String getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(String idCanton) {
        this.idCanton = idCanton;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }
   
}
