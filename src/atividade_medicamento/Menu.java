package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;


public class Menu {

    public static void main(String[] args) {

        ArrayList<Medicamentoo> remedios = new ArrayList<Medicamentoo>();
        ArrayList<Paciente> pessoas = new ArrayList<Paciente>();

        String menu = "1 - CADASTRO REMEDIOS\n" +
                "2 - LISTAR REMEDIOS\n" +
                "3 - CADASTRO PESSOA\n" +
                "4 - LISTAR PESSOAS\n" +
                "5 - RECEITAR REMÉDIO";

        int op =0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {


                Medicamentoo C = new Medicamentoo();
                C.cadRemed();
                remedios.add(C);

            }

            if (op == 2) {
                String lista = "";
                for (Medicamentoo R : remedios) {
                    lista += R.exibirRemed(remedios);
                }
                JOptionPane.showMessageDialog(null, lista);
            }

            if (op == 3) {
                Paciente E = new Paciente();
                E.cadastrarPessoa();
                pessoas.add(E);
            }

            if (op == 4) {
                String exib = "";
                for (Paciente P : pessoas) {
                    exib += P.exibirPessoa(pessoas);
                }
                JOptionPane.showMessageDialog(null, exib);
            }

            if (op == 5) {
                String exibir = "SELECIONE A PESSOA:\n\n";
                int i = 0;
                for (Paciente P : pessoas) {
                    i++;
                    exibir += i + " | " + P.getNome() + "\n";
                }
                int index = Integer.parseInt(JOptionPane.showInputDialog(exibir)) - 1;
                Paciente pacienteSelecionado = pessoas.get(index);

                String exibirRemedios = "REMÉDIOS DISPONIVEIS:\n\n";

                for(Medicamentoo R : remedios) {
                    if (R.getIndicacao().equalsIgnoreCase(pessoas.get(index).getSintoma()) || !R.getIndicacao().equalsIgnoreCase(pessoas.get(index).getCondicaoSaude())) {
                        exibirRemedios += R.getNomeRemedio() + "\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "NÃO HÁ REMÉDIOS DISPONIVEIS PARA ESTA PESSOA");
                    }
                }
                if (exibirRemedios != "REMÉDIOS DISPONIVEIS\n\n") {
                    int indexRemedio = Integer.parseInt(JOptionPane.showInputDialog(exibirRemedios)) - 1;
                    Medicamentoo remedioSelecionado = remedios.get(indexRemedio);
                    pessoas.get(index).setRemediosDescritos(remedios.get(indexRemedio));
                    pacienteSelecionado.getRemediosPrescritos().add(remedioSelecionado);
                }

                /*String exibirRemedios = "SELECIONE O REMÉDIO:\n\n";
                int j = 0;
                for (Medicamentoo R : remedios) {
                    j++;
                    exibirRemedios += j + " | " + R.getNomeRemedio() + "\n";
                }
                int indexRemedio = Integer.parseInt(JOptionPane.showInputDialog(exibirRemedios)) - 1;
                */
            }

        } while (op != 0);





    }
}