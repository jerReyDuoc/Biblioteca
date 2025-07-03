package cl.reyes.biblioteca.response;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PrestamoResponse {
    private int idPrestamo;
    private Date fechaInicio;
    private Date fechaTermino;
    private Boolean estado;
    private LibroResponse libro;
    private ClienteResponse cliente;
}
