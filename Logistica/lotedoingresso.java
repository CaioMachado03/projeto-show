package Logistica;

public class lotedoingresso {
    private String lote;
    private String preçoLote;
    private String quantidadeLote;
    private String beneficioLote;

    // Construtor da CLASSE LOTEDOINGRESSO
    public lotedoingresso(String lote, String preçoLote, String quantidadeLote, String beneficioLote) {
        this.lote = lote;
        this.preçoLote = preçoLote;
        this.quantidadeLote = quantidadeLote;
        this.beneficioLote = beneficioLote;
    }

    // memtodods getters
    public String getLote() {
        return lote;
    }

    public String getPreçoLote() {
        return preçoLote;
    }

    public String getQuantidadeLote() {
        return quantidadeLote;
    }

    public String getBeneficioLote() {
        return beneficioLote;
    }

    // metodos setters
    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setPreçoLote(String preçoLote) {
        this.preçoLote = preçoLote;
    }

    public void setQuantidadeLote(String quantidadeLote) {
        this.quantidadeLote = quantidadeLote;
    }

    public void setBeneficioLote(String beneficioLote) {
        this.beneficioLote = beneficioLote;
    }
}
