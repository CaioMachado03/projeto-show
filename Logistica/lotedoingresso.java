package Logistica;

public class lotedoingresso {
    private int lote;
    private int preçoLote;
    private String quantidadeLote;
    private String beneficioLote;

    // Construtor da CLASSE LOTEDOINGRESSO
    public lotedoingresso(int lote, int preçoLote, String quantidadeLote, String beneficioLote) {
        this.lote = lote;
        this.preçoLote = preçoLote;
        this.quantidadeLote = quantidadeLote;
        this.beneficioLote = beneficioLote;
    }

    // memtodods getters
    public int getLote() {
        return lote;
    }

    public int getPreçoLote() {
        return preçoLote;
    }

    public String getQuantidadeLote() {
        return quantidadeLote;
    }

    public String getBeneficioLote() {
        return beneficioLote;
    }

    // metodos setters
    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setPreçoLote(int preçoLote) {
        this.preçoLote = preçoLote;
    }

    public void setQuantidadeLote(String quantidadeLote) {
        this.quantidadeLote = quantidadeLote;
    }

    public void setBeneficioLote(String beneficioLote) {
        this.beneficioLote = beneficioLote;
    }
}
