package cl.pizarro.prueba2.dto.BoletaDTO;

public class BoletaDTO {
    private String nombreLibro;
    private double precio;
    private String nombreUsuario;

    public BoletaDTO() {
    }

    public BoletaDTO(String nombreLibro, double precio, String nombreUsuario) {
        this.nombreLibro = nombreLibro;
        this.precio = precio;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
