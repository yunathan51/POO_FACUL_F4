package atividades.exCarros;

import javax.swing.*;

public class carros_cadastro {

    int anoProd;
    String corCarro;
    String marcaCarro;

    void cadastro () {
        marcaCarro = JOptionPane.showInputDialog("Informe a marca do veiculo");
        anoProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de produção"));
        corCarro = JOptionPane.showInputDialog("Informe a cor do veiculo");
    }

    String exibirDados() {
        return anoProd + " - " + marcaCarro + " - " + corCarro +"\n";
    }





}
