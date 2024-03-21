package Logistica;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Informações da classe ingressos
        String codigoIngressos = JOptionPane.showInputDialog("Informe o código do ingresso");
        String data = JOptionPane.showInputDialog("Informe a data do evento");
        String horario = JOptionPane.showInputDialog("Informe o horário do evento");
        String preço = JOptionPane.showInputDialog("Informe o preço do ingresso");
        // Informações da classe lotedoingresso
        String lote = JOptionPane.showInputDialog("Informe o lote do ingresso");
        String preçoLote = JOptionPane.showInputDialog("Informe o preço do lote");
        String quantidadeLote = JOptionPane.showInputDialog("Informe a quantidade de ingressos disponíveis  por lote");
        String beneficioLote = JOptionPane.showInputDialog("Informe os benefícios do lote");
        // Informações da classe eventos
        String nomeDoEvento = JOptionPane.showInputDialog("Informe o nome do evento");
        String descrição = JOptionPane.showInputDialog("Informe as descrições sobre o evento");
        String tipoDoEvento = JOptionPane.showInputDialog("Informe o tipo do evento");
        String duraçãoDoEvento = JOptionPane.showInputDialog("Informe a duração do evento");
        // Informções da classe tipodeevento
        String genero = JOptionPane.showInputDialog("Informe o gênero do evento");
        String faixaEtaria = JOptionPane.showInputDialog("Informe a faixa etaria para o evento");
        // Informações da classe local
        String endereço = JOptionPane.showInputDialog("Informe o endereço do local do evento");
        String capacidade = JOptionPane.showInputDialog("Informe a capacidade do local do evento");
        String acessibilidade = JOptionPane
                .showInputDialog("Informe se o local possui acessibilidade para pessoas com deficiência");
        String nomeDoLocal = JOptionPane.showInputDialog("Informe o nome do local que será realizado o evento");
    }
}
