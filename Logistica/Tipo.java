package Logistica;

public class Tipo {
    private String genero;
    private String faixaEtaria;

    public Tipo(String genero, String faixaEtaria) {
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
    }

    // metodos getters
    public String getGenero() {
        return genero;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    // metdos setters
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
