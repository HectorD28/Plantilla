package dsw.sigconbackend.dto;

import dsw.sigconbackend.model.Persona;
import dsw.sigconbackend.model.TipoDocumento;
import dsw.sigconbackend.model.Ubigeo;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonaResponse { // Se detalla la respuesta no id
    private Long idPersona;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private Date fechaNacimiento;
    private Integer idTipoDocumento;
    private String ndocumento;
    private String direccion;
    private TipoDocumento tipoDocumento;
    private Ubigeo ubigeo;
    
    public static PersonaResponse fromEntity(Persona persona){
        return PersonaResponse.builder()
                .idPersona(persona.getIdPersona())
                .apellidoPaterno(persona.getApellidoPaterno()==null ? "":persona.getApellidoPaterno())
                .apellidoMaterno(persona.getApellidoMaterno()==null ? "":persona.getApellidoMaterno())
                .nombres(persona.getNombres()==null ? "":persona.getNombres())
                .fechaNacimiento(persona.getFechaNacimiento())
                .ndocumento(persona.getNdocumento()==null ? "":persona.getNdocumento())
                .direccion(persona.getDireccion()==null ? "":persona.getDireccion())
                .tipoDocumento(persona.getTipoDocumento())
                .ubigeo(persona.getUbigeo())          
                .build();
                
    }
    
    public static List<PersonaResponse> fromEntities(List<Persona> persona){
        return persona.stream()
                .map(PersonaResponse::fromEntity) // Mapeo: invocación del método y se guarda en collect
                .collect(Collectors.toList());
    }
            

}
