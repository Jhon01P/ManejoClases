
package ec.edu.intsuperior.modelo;

public class Region {
    private String idRegion;
    private String nombreRegion;
    private Provincia provincia;

    public Region() {
    }

    public Region(String idRegion, String nombreRegion, Provincia provincia) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.provincia = provincia;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
}
