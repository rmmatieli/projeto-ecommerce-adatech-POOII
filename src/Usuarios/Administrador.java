package Usuarios;

import DAO.UsuarioDAO;

import java.util.List;

public class Administrador extends Usuario implements UsuarioDAO {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Administrador(int id, String nome, String sobrenome, String sexo, String dataNascimento, String cpf) {
        super(id, nome, sobrenome, sexo, dataNascimento);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "cpf='" + cpf + '\'' +
                "} " + super.toString();
    }

    public void cadastrarProduto(){

    }

    public void visualizarListaDeProdutos(){

    }

    public void editarProduto(){

    }

    public void removerProduto(){

    }

    @Override
    public void validaLogin() {

    }

    @Override
    public void validaLoginAdministrador(String Usuario, String Senha, Administrador administrador) {

    }

    @Override
    public List<Usuario> getTodosUsuarios() {
        return null;
    }
}
