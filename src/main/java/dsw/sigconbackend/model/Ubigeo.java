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
@Table(name="ubigeo")


public class Ubigeo {
    @Id
    @Column(name="idubigeo")
    
    private String idUbigeo; // Convención Camel Case
    private String departamento; 
    private String provincia; 
    private String distrito; 
    
    
}
