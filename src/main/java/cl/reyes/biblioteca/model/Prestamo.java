package cl.reyes.biblioteca.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "prestamo")
public class Prestamo {
    @Column(name = "id_prestamo")
    @Id
    private int idPrestamo;
    private Date fechaInicio;
    private Date fechaTermino;
    private Libro libro;
    private Cliente cliente;
}
