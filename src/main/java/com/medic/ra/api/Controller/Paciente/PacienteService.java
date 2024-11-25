package com.medic.ra.api.Controller.Paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Medico;





@RestController
@RequestMapping("api/paciente")
@CrossOrigin("*")
public class PacienteService {
    
    @Autowired
    private IPacienteController controller;


    @GetMapping("/list/{id}")
    public ResponseEntity<List<Cita>> getAll(@PathVariable int id) {
        var result = controller.verHistorialCitas(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @GetMapping("/certificado/{id}")
    public ResponseEntity<CertificadoMedico> getMethodName(@PathVariable Medico id) {
        var result = controller.solicitarCertificado(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    

}
