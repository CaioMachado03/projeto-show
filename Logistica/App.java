package Logistica;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Informações da classe ingressos

        String codigoIngressos = JOptionPane.showInputDialog("Informe o código do ingresso");
        String data = JOptionPane.showInputDialog("Informe a data do evento");
        String horario = JOptionPane.showInputDialog("Informe o horário do evento");
        String preço = JOptionPane.showInputDialog("Informe o preço do ingresso");
        Lote lote;

        Ingressos ingresso1 = new Ingressos(codigoIngressos, data, horario, preço, lote);

        System.out.println("O código do ingresso é:" + ingresso1.getCodigoIngressos());
        System.out.println("A data do evento é:" + ingresso1.getData());
        System.out.println("O horário do evento é" + ingresso1.getHorario());
        System.out.println("O preco do ingresso é:" + ingresso1.getPreço());
        System.out.println("O lote do ingresso é:" + ingresso1.getLote());
        // Informações da classe lotedoingresso
        String lote1 = JOptionPane.showInputDialog("Informe o lote do ingresso:");
        String preçoLote = JOptionPane.showInputDialog("Informe o preço do lote");
        String quantidadeLote = JOptionPane.showInputDialog("Informe a quantidade de ingressos disponíveis  por lote");
        String beneficioLote = JOptionPane.showInputDialog("Informe os benefícios do lote");

        Lote lote01 = new Lote(lote, preçoLote, quantidadeLote, beneficioLote);

        System.out.println("O lote do ingresso é:" + lote01.getLotes());
        System.out.println("O valor do lote é:" + lote01.getPreçoLote());
        System.out.println("A quantidade diponíveil desse lote é:" + lote01.getQuantidadeLote());
        System.out.println("Os benefícios desse lote são:" + lote01.getBeneficioLote());

        // Informações da classe eventos

        String nomeDoEvento = JOptionPane.showInputDialog("Informe o nome do evento");
        String descrição = JOptionPane.showInputDialog("Informe as descrições sobre o evento");
        String tipoDoEvento = JOptionPane.showInputDialog("Informe o tipo do evento");
        String duraçãoDoEvento = JOptionPane.showInputDialog("Informe a duração do evento");

        Evento Evento1 = new Evento(nomeDoEvento, descrição, tipoDoEvento, duraçãoDoEvento);

        System.out.println("O nome do evento é:" + Evento1.getNomeDoEvento());
        System.out.println("As descrições sobre o evento são:" + Evento1.getDescrição());
        System.out.println("O evento e do tipo:" + Evento1.getTipoDoEvento());
        System.out.println("A duração do evento é de:" + Evento1.getDuraçãoDoEvento());

        // Informções da classe tipodeevento

        String genero = JOptionPane.showInputDialog("Informe o gênero do evento");
        String faixaEtaria = JOptionPane.showInputDialog("Informe a faixa etaria para o evento");

        Tipo tpde = new Tipo(genero, faixaEtaria);
        System.out.println("O gênero do evento é:" + tpde.getFaixaEtaria());
        System.out.println("A faixa etaria para entrar no evento é" + tpde.getFaixaEtaria());

        // Informações da classe local

        String endereço = JOptionPane.showInputDialog("Informe o endereço do local do evento");
        String capacidade = JOptionPane.showInputDialog("Informe a capacidade do local do evento");
        String acessibilidade = JOptionPane
                .showInputDialog("Informe se o local possui acessibilidade para pessoas com deficiência");
        String nomeDoLocal = JOptionPane.showInputDialog("Informe o nome do local que será realizado o evento");

        Local lugar = new Local(endereço, capacidade, acessibilidade, nomeDoLocal);
        System.out.println("O endereço é:" + lugar.getEndereço());
        System.out.println("A capacidade total do local é de:" + lugar.getCapacidade());
        System.out.println("O local possui acessibilidade para pessoas com deficiências:" + lugar.getAcessibilidade());
        System.out.println("O nome do local é:" + lugar.getNomeDoLocal());
    }
}
