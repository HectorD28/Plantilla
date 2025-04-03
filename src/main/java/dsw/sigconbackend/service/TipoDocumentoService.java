/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsw.sigconbackend.service;

import dsw.sigconbackend.model.TipoDocumento;
import dsw.sigconbackend.repository.TipoDocumentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TipoDocumentoService {
    @Autowired 
    TipoDocumentoRepository tipoDocumentoRepository;
    
    public List<TipoDocumento> getTipoDocumentos(){
        return (List<TipoDocumento>)tipoDocumentoRepository.findAll();
    }
}
