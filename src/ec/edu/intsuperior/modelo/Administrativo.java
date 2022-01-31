
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Administrativo extends Persona {
    private Area area;
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(Area area, String cargo) {
        this.area = area;
        this.cargo = cargo;
    }

    public Administrativo(Area area, String cargo, String cedula, String apellido1, String apellido2, String nombre1, String nombre2, String email, String telefono, Date fechaNacimiento, Region region, Genero genero, TipoSangre tipoSangre) {
        super(cedula, apellido1, apellido2, nombre1, nombre2, email, telefono, fechaNacimiento, region, genero, tipoSangre);
        this.area = area;
        this.cargo = cargo;
    }

    

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
