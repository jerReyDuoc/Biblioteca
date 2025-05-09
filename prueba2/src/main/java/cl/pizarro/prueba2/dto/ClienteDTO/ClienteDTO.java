package cl.pizarro.prueba2.dto.ClienteDTO;

import cl.pizarro.prueba2.service.Impl.ClienteService;
//import cl.pizarro.prueba2.dto.BiblotecaDTO.BiblotecaDTO;
//import cl.pizarro.prueba2.service.Impl.BiblotecaService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "Bibloteca_vergara")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ClienteDTO {
     @Id
    @Column(name= "id_Cliente")
 private int idCliente;
 private String Nombre;
 private int numero;
 private String primNombre;
    private String segNombre;
    public ClienteDTO insertCliente(ClienteService clienteService) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCliente'");
    }
 
}
