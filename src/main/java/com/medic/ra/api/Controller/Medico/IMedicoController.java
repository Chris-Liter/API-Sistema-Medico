package com.medic.ra.api.Controller.Medico;

import java.util.List;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Consulta;
import com.medic.ra.api.Model.Medico;
import com.medic.ra.api.Model.Paciente;

public interface IMedicoController {
    List<Cita> verAgenda(int id);
    void registrarConsulta(Paciente paciente, Consulta consulta);
    CertificadoMedico emitirCertificados(Paciente paciente);
    int crearMedico(Medico medico);
}
