package atividades.atividade_pessoa_remedio;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    private static ArrayList<Medicamento> remedios = new ArrayList<Medicamento>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {

        int operador = 0;

        do {
            operador = menu();
            switch (operador) {

                case 1: {
                    cadRemed();
                    break;
                }

                case 2:
                    JOptionPane.showMessageDialog(null, exibirRemedios());
                    break;

                case 3:
                    cadPessoa();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, exibirPessoas());
                    break;

                case 5:
                    receitarRemed();
                    break;
            }

        } while (operador != 6);






    }

    public static int menu() {
        String menu = "1 - CADASTRO REMEDIOS\n" +
                "2 - LISTAR REMEDIOS\n" +
                "3 - CADASTRO PESSOA\n" +
                "4 - LISTAR PESSOAS\n" +
                "5 - RECEITAR REMÉDIO\n" +
                "6 - SAIR";

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void cadRemed() {
        Medicamento remedio = new Medicamento();
        remedio.cadRemedio();
        remedios.add(remedio);
    }

    private static String exibirRemedios() {
        String lista = "";
        for (Medicamento remedio : remedios) {
            lista += remedio.exibirRemed(remedios);
        }
        return lista;
    }

    private static void cadPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.cadastrarPessoa();
        pessoas.add(pessoa);
    }

    private static String exibirPessoas() {
        String exibir = "";
        for (Pessoa pessoa : pessoas) {
            exibir += pessoa.exibirPessoa(pessoas);
        }
        return exibir;
    }

    private static void receitarRemed() {
        String exibir = "SELECIONE A PESSOA:\n\n";
        int i = 0;
        for (Pessoa pessoa : pessoas) {
            i++;
            exibir += i + " - " + pessoa.getNome() + "\n";
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog(exibir)) - 1;

        Pessoa pessoa = pessoas.get(op);

        String remediosDisponiveis = "REMEDIOS DISPONIVEIS\n\n";
        int C = 0;
        for (Medicamento remedio : remedios) {
            C++;
            if (remedio.getAdcIndicacao().equalsIgnoreCase(pessoas.get(op).getSintoma()) || !remedio.getAdcContraIndicacao().equalsIgnoreCase(pessoas.get(op).getCondicaoSaude())) {
                remediosDisponiveis += C + remedio.getNomeRemedio() + "\n";
            }

            if (remediosDisponiveis != "REMEDIOS DISPONIVEIS\n\n") {
                int escolherRemedio = Integer.parseInt(JOptionPane.showInputDialog(remediosDisponiveis)) - 1;
                Medicamento remedioSelecionado = remedios.get(escolherRemedio);
                pessoas.get(op).getRemediosDescritos().add(remedioSelecionado);
            }

        }


    }


}
