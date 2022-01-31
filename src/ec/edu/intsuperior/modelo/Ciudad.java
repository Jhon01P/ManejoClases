
package ec.edu.intsuperior.modelo;

public class Ciudad {
    private String codigoCiudad;
    private String nombreCiudad;
    private Provincia  provincia;

    public Ciudad() {
    }

    public Ciudad(String codigoCiudad, String nombreCiudad, Provincia provincia) {
        this.codigoCiudad = codigoCiudad;
        this.nombreCiudad = nombreCiudad;
        this.provincia = provincia;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
}
