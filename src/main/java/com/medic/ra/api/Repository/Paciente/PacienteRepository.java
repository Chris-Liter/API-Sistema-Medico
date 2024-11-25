package com.medic.ra.api.Repository.Paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Medico;

@Repository
public class PacienteRepository implements IPacienteRepository{

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public List<Cita> verHistorialCitas(int id) {
        String sql = "SELECT * FROM certificadomedico where paciente_id = ?";
        return jdbc.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Cita.class));
    }

    @Override
    public CertificadoMedico solicitarCertificado(Medico medico) {
        String sql = "SELECT * FROM certificadomedico where medico_id = ?";
         return jdbc.queryForObject(sql, new Object[]{medico.getId()}, new BeanPropertyRowMapper<>(CertificadoMedico.class));
    }
    
}
