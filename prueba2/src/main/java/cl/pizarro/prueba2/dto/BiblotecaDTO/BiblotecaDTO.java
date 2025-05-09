package cl.pizarro.prueba2.dto.BiblotecaDTO;

import cl.pizarro.prueba2.service.Impl.BiblotecaService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "Bibloteca_pizarro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BiblotecaDTO {
    @Id
    @Column(name= "id_Bibloteca")
 private int idBibloteca;
 private String color;
 private int pisos;
 public BiblotecaDTO insertarBibloteca(BiblotecaService biblotecaService) {
    throw new UnsupportedOperationException("Unimplemented method 'insertarBibloteca'");
 }

}
