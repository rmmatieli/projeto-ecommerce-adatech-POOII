package Usuarios;

import DAO.UsuarioDAO;

import java.util.List;

public class ClientePessoaJuridica extends Usuario {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String CNPJ) {
        this.cnpj = CNPJ;
    }

    public ClientePessoaJuridica(int id, String nome, String sobrenome, String sexo, String dataNascimento, String cnpj) {
        super(id, nome, sobrenome, sexo, dataNascimento);
        this.cnpj = cnpj;
    }

}
