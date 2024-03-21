package Logistica;

public class evento {
    private String nomeDoEvento;
    private String descrição;
    private String tipoDoEvento;
    private String duraçãoDoEvento;

    // Construtor da CLASSE EVENTO
    public evento(String nomeDoEvento, String descrição, String tipoDoEvento, String duraçãoDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
        this.descrição = descrição;
        this.tipoDoEvento = tipoDoEvento;
        this.duraçãoDoEvento = duraçãoDoEvento;
    }

    // metodos getters
    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getDescrição() {
        return descrição;
    }

    public String getTipoDoEvento() {
        return tipoDoEvento;
    }

    public String getDuraçãoDoEvento() {
        return duraçãoDoEvento;
    }

    // metodos setters
    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setTipoDoEvento(String tipoDoEvento) {
        this.tipoDoEvento = tipoDoEvento;
    }

    public void setDuraçãoDoEvento(String duraçãoDoEvento) {
        this.duraçãoDoEvento = duraçãoDoEvento;
    }
}
