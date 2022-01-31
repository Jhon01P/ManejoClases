
package ec.edu.intsuperior.modelo;

public class Provincia {
    private String idProvincia;
    private String nombreProvincia;
    private Canton canton;

    public Provincia() {
    }

    public Provincia(String idProvincia, String nombreProvincia, Canton canton) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.canton = canton;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }
    
}
