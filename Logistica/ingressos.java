package Logistica;

public class Ingressos {
    private String codigoIngressos;
    private String data;
    private String horario;
    private String preço;
    private Lote lote;
    private Evento evento;

    /**
     * @param codigoIngressos
     * @param data
     * @param horario
     * @param preço
     * @param lote
     * @param ev
     */
    public Ingressos(String codigoIngressos, String data, String horario, String preço, Lote lote, Evento evento) {
        this.codigoIngressos = codigoIngressos;
        this.data = data;
        this.horario = horario;
        this.preço = preço;
        this.lote = lote;
        this.evento = evento;

    }

    // metodos getters
    public String getCodigoIngressos() {
        return codigoIngressos;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getPreço() {
        return preço;
    }

    public Lote getLote() {
        return lote;
    }

    public Evento getEvento() {
        return evento;
    }

    // metodos setters da CLASSE INGRESSOS

    public void setCodigoIngressos(String codigoIngressos) {
        this.codigoIngressos = codigoIngressos;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
