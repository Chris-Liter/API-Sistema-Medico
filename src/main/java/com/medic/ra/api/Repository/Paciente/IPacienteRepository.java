package com.medic.ra.api.Repository.Paciente;

import java.util.List;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Medico;

public interface IPacienteRepository {
    List<Cita> verHistorialCitas(int id);
    CertificadoMedico solicitarCertificado(Medico medico);
}
