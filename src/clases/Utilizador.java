package clases;

public class Utilizador {
    
    private String nome;
    private String email;
    private String numeroCartao;
    private double credito;
    private int tipo; 

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Utilizador() {
    }
}
