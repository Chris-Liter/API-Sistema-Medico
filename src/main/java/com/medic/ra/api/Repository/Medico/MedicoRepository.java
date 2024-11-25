package com.medic.ra.api.Repository.Medico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medic.ra.api.Model.CertificadoMedico;
import com.medic.ra.api.Model.Cita;
import com.medic.ra.api.Model.Consulta;
import com.medic.ra.api.Model.Medico;
import com.medic.ra.api.Model.Paciente;

@Repository
public class MedicoRepository implements IMedicoRepository{

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public List<Cita> verAgenda(int id) {
        String sql = "SELECT * FROM certificadomedico where medico_id = ?";
        return jdbc.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Cita.class));
    }

    @Override
    public void registrarConsulta(Paciente paciente, Consulta consulta) {
        String sql = "INSERT INTO paciente(nombre, apellido, cedula, telefono, direccion, correo, diagnostico) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        String verificarCedula = "SELECT * FROM paciente where cedula = ?";
        List<Paciente> ced = jdbc.query(verificarCedula, new Object[]{paciente.getCedula()}, new BeanPropertyRowMapper<>(Paciente.class));
        if(ced.size() <= 0){
            jdbc.update(sql, paciente.getNombre(), paciente.getApellido(), paciente.getCedula(), paciente.getTelefono(), paciente.getDireccion(), paciente.getCorreo(), paciente.getDiagnostico());
        }
        
        String consultaP = "SELECT * FROM paciente where cedula = ?";
        List<Paciente> pacientes = jdbc.query(consultaP, new Object[]{paciente.getCedula()}, new BeanPropertyRowMapper<>(Paciente.class));

        for(Paciente pa: pacientes){
            
        String sql2 = "INSERT INTO consulta(fecha, detalles, signosvitales, paciente_id, medico_id) VALUES (?, ?, ?, ?, ?)";
        jdbc.update(sql2, consulta.getFecha(), consulta.getDetalles(), consulta.getSignosVitales(), pa.getId(), consulta.getMedico_id());
        }
    }

    @Override
    public List<CertificadoMedico> emitirCertificados(int paciente) {
        String sql = "SELECT * FROM certificadomedico where paciente_id = ?";
        return jdbc.query(sql, new Object[]{paciente}, new BeanPropertyRowMapper<>(CertificadoMedico.class));
    }

    @Override
    public int crearMedico(Medico medico) {
        String sql = "INSERT INTO medico(especialidad, usuario_id) VALUES (?, ?)";
    try {
        System.out.println("Usuario creado con éxito.");
        return jdbc.update(sql, medico.getEspecialidad(), medico.getUsuario_id());
        
    } catch (DataAccessException e) {
        System.err.println("Error al insertar el medico: " + e.getMessage());
        return 0;
    }
    }
    
}
