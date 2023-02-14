package Usuarios;

import java.util.List;

public class ClientePessoFisica extends Usuario {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClientePessoFisica(String nome, String sobrenome, String nomeUsuario, String sexo, String dataNascimento, String senha, String cpf) {
        super(nome, sobrenome, nomeUsuario, sexo, dataNascimento, senha);
        this.cpf = cpf;
    }

    int atualizaId(int id){
        id = this.getId() + 1;
        return id;
    }
    @Override
    public boolean validaLoginAdm() {
        System.out.printf("Usuário %s não possui essa permissão!%n", getNomeUsuario());
        return false;
    }
}
