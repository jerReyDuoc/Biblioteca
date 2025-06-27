package cl.reyes.biblioteca.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_termino")
    private Date fechaTermino;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Libro libro;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente cliente;
}
