package Logistica;

public class ingressos {
    private String codigoIngressos;
    private String data;
    private String horario;
    private int preço;

    // construtor da CLASSE INGRESSOS
    public ingressos(String codigoIngressos, String data, String horario, int preço) {
        this.codigoIngressos = codigoIngressos;
        this.data = data;
        this.horario = horario;
        this.preço = preço;
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

    public int getPreço() {
        return preço;
    }

    // metodos setters da CLASSE INGRESSOS

    public void setCodigoIngressos(String codigoIngressos) {
        this.codigoIngressos = codigoIngressos;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void serHorario(String horario) {
        this.horario = horario;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

}
