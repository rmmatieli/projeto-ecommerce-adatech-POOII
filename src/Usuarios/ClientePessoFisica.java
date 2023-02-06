package Usuarios;

public class ClientePessoFisica extends Usuario {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClientePessoFisica(int id, String nome, String sobrenome, String sexo, String dataNascimento, String cpf) {
        super(id, nome, sobrenome, sexo, dataNascimento);
        this.cpf = cpf;
    }
}
