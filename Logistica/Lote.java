package Logistica;

public class Lote {
    private String lotes;
    private String preçoLote;
    private String quantidadeLote;
    private String beneficioLote;

    // Construtor da CLASSE LOTEDOINGRESSO
    public Lote(String lotes, String preçoLote, String quantidadeLote, String beneficioLote) {
        this.lotes = lotes;
        this.preçoLote = preçoLote;
        this.quantidadeLote = quantidadeLote;
        this.beneficioLote = beneficioLote;
    }

    // memtodods getters
    public String getLotes() {
        return lotes;
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
    public void setLotes(String lotes) {
        this.lotes = lotes;
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
