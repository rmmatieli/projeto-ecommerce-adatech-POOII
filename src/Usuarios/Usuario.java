package Usuarios;

public abstract class Usuario {

    private static int id;
    private String nome;
    private String sobrenome;
    private String nomeUsuario;
    private String sexo;
    private String dataNascimento;
    private String tipoUsuario = "Normal";
    private String senha;

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String sobrenome, String nomeUsuario, String sexo, String dataNascimento, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeUsuario = nomeUsuario;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        atualizaId();
    }

    public void atualizaId(){
        id++;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public abstract boolean validaLoginAdm();
}
