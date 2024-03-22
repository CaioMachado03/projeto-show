package Logistica;

public class Evento {
    private String nomeDoEvento;
    private String descrição;
    private String tipoDoEvento;
    private String duraçãoDoEvento;
    private Local local;
    private Tipo tipo;

    // Construtor da CLASSE EVENTO
    public Evento(String nomeDoEvento, String descrição, String tipoDoEvento, String duraçãoDoEvento, Local local,
            Tipo tipo) {
        this.nomeDoEvento = nomeDoEvento;
        this.descrição = descrição;
        this.tipoDoEvento = tipoDoEvento;
        this.duraçãoDoEvento = duraçãoDoEvento;
        this.local = local;
        this.tipo = tipo;
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

    public Local getLocal() {
        return local;
    }

    public Tipo getTipo(){ 
        return tipo;
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

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setTipodeevento(Tipo tipo){ 
        this.tipo = tipo;
    }
}
