package salao.beleza;

public class Cliente {

    private String nome;
    private String email;
    private String sexo;
    private Endereco endereco;
    public Cliente(String nome, String email, String sexo, Endereco endereco ){
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.endereco =endereco;


    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
}}
