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

@Table(name = "cliente")
public class Cliente {
    @Column(name = "id_cliente")
    @Id
    private int idCliente;
    private String nombre;
    private String apellido;
    private int edad;
}
