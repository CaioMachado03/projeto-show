package Logistica;

public class Local {
    private String endereço;
    private String capacidade;
    private String acessibilidade;
    private String nomeDoLocal;

    public Local(String endereço, String capacidade, String acessibilidade, String nomeDoLocal) {
        this.endereço = endereço;
        this.capacidade = capacidade;
        this.acessibilidade = acessibilidade;
        this.nomeDoLocal = nomeDoLocal;
    }

    // metodos getters
    public String getEndereço() {
        return endereço;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public String getAcessibilidade() {
        return acessibilidade;
    }

    public String getNomeDoLocal() {
        return nomeDoLocal;
    }

    // metodos setters
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public void setNomeDoLocal(String nomeDoLocal) {
        this.nomeDoLocal = nomeDoLocal;
    }
}
