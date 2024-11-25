package com.medic.ra.api.Controller.Paciente;

import java.util.List;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Medico;

public interface IPacienteController {
    List<Cita> verHistorialCitas(int id);
    CertificadoMedico solicitarCertificado(Medico medico);
}
