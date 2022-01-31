
package ec.edu.intsuperior.modelo;


public class TipoSangre {
    private String codigoSangre;
    private String tipoSangre;

    public TipoSangre() {
    }

    public TipoSangre(String codigoSangre, String tipoSangre) {
        this.codigoSangre = codigoSangre;
        this.tipoSangre = tipoSangre;
    }

    public String getCodigoSangre() {
        return codigoSangre;
    }

    public void setCodigoSangre(String codigoSangre) {
        this.codigoSangre = codigoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
}
