package exCarros;

import javax.swing.*;
import java.util.ArrayList;

public class operacoes {
    public static void main(String[] args) {

        ArrayList<carros_cadastro> carros = new ArrayList<carros_cadastro>();

        do {

            int operador = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada\n\n" +
                    "1 - CADASTRAR VEICULO\n" +
                    "2 - LISTAR VEICULOS\n" +
                    "3 - LISTAR POR ANO\n" +
                    "4 - LISTAR POR COR\n" +
                    "5 - LISTAR POR MARCA\n" +
                    "6 - SAIR"));

            switch (operador) {

                case 1:
                    carros_cadastro a = new carros_cadastro();
                    a.cadastro();
                    carros.add(a);
                break;

                case 2:
                    String resultado = "CARROS CADASTRADOS:\n\n";
                    for (carros_cadastro a1 : carros) {
                        resultado += a1.exibirDados();

                    } JOptionPane.showMessageDialog(null, resultado);
                break;

                case 3:
                    int anoDesejado = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano desejado"));
                    String resultAno = "CARROS DO ANO INFORMADO\n\n";
                    for (carros_cadastro a2 : carros) {
                        if (anoDesejado == a2.anoProd) {
                            resultAno += a2.exibirDados();
                        }
                    } JOptionPane.showMessageDialog(null, resultAno);
                break;

                case 4:
                    String corDesejada = JOptionPane.showInputDialog("Informe a cor desejada");
                    String resultCor = "CARROS DO COR INFORMADA\n\n";
                    for (carros_cadastro a3 : carros) {
                        if (corDesejada.equalsIgnoreCase(a3.corCarro)) {
                            resultCor += a3.exibirDados();
                        }
                    } JOptionPane.showMessageDialog(null, resultCor);
                break;

                case 5:
                    String modeloDesejada = JOptionPane.showInputDialog("Informe a cor desejada");
                    String resultModelo = "CARROS DO COR INFORMADA\n\n";
                    for (carros_cadastro a3 : carros) {
                        if (modeloDesejada.equalsIgnoreCase(a3.corCarro)) {
                            resultModelo += a3.exibirDados();
                        }
                    } JOptionPane.showMessageDialog(null, resultModelo);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");

            }
        } while (1 == 1);



    }
}
