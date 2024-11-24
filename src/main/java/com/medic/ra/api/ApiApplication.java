package com.medic.ra.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medic.ra.api.Model.Usuario;
import com.medic.ra.api.Repository.UsuarioRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ApiApplication {
 	@Autowired
    private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(ApiApplication.class, args);
	}

    @PostConstruct
    public void init() {
        // Crear un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Jorge");
        usuario.setApellido("Pérez");
        usuario.setTelefono("1234567890");
        usuario.setDireccion("Calle Falsa 123");
        usuario.setEmail("jorge.perez@example.com");
        usuario.setPass("1234");
        // Guardar el usuario en la base de datos
        usuarioRepository.crearUsuario(usuario);
        System.out.println("Usuario inicial insertado en la base de datos");
    }

}
