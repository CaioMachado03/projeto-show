package Logistica;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Informações da classe ingressos
        String codigoIngressos = JOptionPane.showInputDialog("Informe o código do ingresso");
        String data = JOptionPane.showInputDialog("Informe a data do evento");
        String horario = JOptionPane.showInputDialog("Informe o horário do evento");
        int preço = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço do ingresso"));

        // Informações da classe lote do ingresso
        int lote = Integer.parseInt(JOptionPane.showInputDialog("Informe o lote do Ingresso"));
        int preçoLote = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço do lote"));
        String quantidadeLote = JOptionPane.showInputDialog("Informe a quantidade de ingressos disponíveis  por lote");
        String beneficioLote = JOptionPane.showInputDialog("Informe os benefícios do lote");

    }

}
