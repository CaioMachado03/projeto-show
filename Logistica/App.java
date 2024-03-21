package Logistica;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Informações da classe ingressos
        String codigoIngressos = JOptionPane.showInputDialog("Informe o código do ingresso");
        System.out.println("O código do ingresso é:" + codigoIngressos);

        String data = JOptionPane.showInputDialog("Informe a data do evento");
        System.out.println("A data do evento é:" + data);

        String horario = JOptionPane.showInputDialog("Informe o horário do evento");
        System.out.println("O horário do evento é:" + horario);

        int preço = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço do ingresso"));
        System.out.println("O preço do ingresso é:" + preço);

        int lote = Integer.parseInt(JOptionPane.showInputDialog("Informe o lote do ingresso"));
        System.out.println("O lote do ingresso é:" + lote);

        int preçoLote = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço do lote"));
        System.out.println("O preço do lote é:" + preçoLote);

        String quantidadeLote = JOptionPane.showInputDialog("Informe a quantidade de ingressos disponíveis  por lote");
        System.out.println("A quantidade disponível por lote é de:" + quantidadeLote);

        String beneficioLote = JOptionPane.showInputDialog("Informe os benefícios do lote");
        System.out.println("Os benefícios do lote são:" + beneficioLote);

        String nomeDoEvento = JOptionPane.showInputDialog("Informe o nome do evento");
        System.out.println("O nome do evento é:" + nomeDoEvento);

        String descrição = JOptionPane.showInputDialog("Informe as descrições sobre o show");
        System.out.println("As descrições do eventos são:" + descrição);

        String tipoDoEvento = JOptionPane.showInputDialog("Informe o tipo do evento");
        System.out.println("O tipo de evento é:" + tipoDoEvento);

        String duraçãoDoEvento = JOptionPane.showInputDialog("Informe a duração do evento");
        System.out.println("A duração do evento é:" + duraçãoDoEvento);
    }
}
