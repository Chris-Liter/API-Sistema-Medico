package com.medic.ra.api.Controller.Medico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Consulta;
import com.medic.ra.api.Model.Medico;
import com.medic.ra.api.Model.Paciente;
import com.medic.ra.api.Repository.Medico.IMedicoRepository;


@Service
public class MedicoController implements IMedicoController{
    
    @Autowired
    private IMedicoRepository rep;

    @Override
    public List<Cita> verAgenda(int id) {
        List<Cita> listado = null;
        try {
            
            listado = rep.verAgenda(id);
        } catch (Exception e) {
            throw e;
        }
        return listado;
    }

    @Override
    public void registrarConsulta(Paciente paciente, Consulta consulta) {
        try {
            rep.registrarConsulta(paciente, consulta);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public CertificadoMedico emitirCertificados(Paciente paciente) {
        CertificadoMedico certificado = null;
        try {
            certificado = rep.emitirCertificados(paciente);
        } catch (Exception e) {
            throw e;
        }
        return certificado;
    }

    @Override
    public int crearMedico(Medico medico) {
        int row =0;
        try {
            row = rep.crearMedico(medico);
        } catch (Exception e) {
            throw e;
        }
        return row;
    }
}
