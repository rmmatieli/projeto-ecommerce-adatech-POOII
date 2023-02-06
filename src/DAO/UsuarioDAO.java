package DAO;

import Usuarios.Administrador;
import Usuarios.Usuario;

import java.util.List;

public interface UsuarioDAO {

    void validaLogin();

    void validaLoginAdministrador(String Usuario, String Senha, Administrador administrador);
    List<Usuario> getTodosUsuarios();
}
