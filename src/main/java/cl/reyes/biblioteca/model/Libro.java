package cl.reyes.biblioteca.model;

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

@Table(name = "libro")
public class Libro {
    @Column(name = "id_libro")
    @Id
    private int idLibro;
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "id_autor")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Editorial editorial;

}
