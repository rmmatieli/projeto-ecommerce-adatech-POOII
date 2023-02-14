package Usuarios;

public class ClientePessoaJuridica extends Usuario {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String CNPJ) {
        this.cnpj = CNPJ;
    }

    public ClientePessoaJuridica(String nome, String sobrenome, String nomeUsuario, String sexo, String dataNascimento, String senha, String cnpj) {
        super(nome, sobrenome, nomeUsuario, sexo, dataNascimento, senha);
        this.cnpj = cnpj;
    }

    @Override
    public boolean validaLoginAdm() {
        System.out.printf("Usuário %s não possui essa permissão!%n", getNomeUsuario());
        return false;
    }

}
