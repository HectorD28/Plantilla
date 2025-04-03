package dsw.sigconbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       // Permitira manejar código limpiara: generará los gettes, setter, constructores
@Entity     // Permitira realizar las operaciones CRUD
@Builder    
@NoArgsConstructor
@AllArgsConstructor
@Table(name="persona")



public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona") // Se define para aquellos datos que no son iguales en la base de datos
    private Long idPersona;
    @Column(name="apellido_paterno")
    private String apellidoPaterno;
    @Column(name="apellido_materno")
    private String apellidoMaterno;
    private String nombres;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    private String ndocumento;
    private String direccion;
    
    
    @ManyToOne(fetch=FetchType.EAGER) // Muchas instancias de personas se vinculan con una instancia tipoDocumento
    @JoinColumn(name="id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idubigeo", referencedColumnName = "idubigeo")
    private Ubigeo ubigeo;
}
