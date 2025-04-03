package dsw.sigconbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       // Permitira manejar código limpiara: generará los gettes, setter, constructores
@Entity     // Permitira realizar las operaciones CRUD
@Builder    //
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tipo_documento")


public class TipoDocumento {
   @Id
   @Column(name="id_tipo_documento")
    
   private Integer idTIpoDocumento;
   private String descripcion;
    
}
