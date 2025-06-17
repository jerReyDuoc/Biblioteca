
package cl.reyes.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name="boleta_factura")
public class BoletaFactura {
    @Column(name="id")
    @Id
    private int id;
    private int valor;
}
