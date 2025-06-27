package cl.reyes.biblioteca.model;


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


@Table(name = "libro")
public class Libro {
    @Column(name = "id_libro")
    @Id
    private int idLibro;
    private String titulo;
    private Genero genero;
    private Autor autor;
    private Editorial editorial;

}
