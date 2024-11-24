package com.medic.ra.api.Controller.Usuario;

import java.util.List;

import com.medic.ra.api.Model.Usuario;

public interface IUsuarioController {
    Usuario login(String email, String password);
    void cerrarSesion();
    int crearUsuario(Usuario usuario);
    int update(Usuario usuario);
    int delete(int id);
    List<Usuario> getAll();

}
