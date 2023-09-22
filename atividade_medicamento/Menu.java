package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;


public class Menu {

    public static void main(String[] args) {

        ArrayList<Medicamento> remedios = new ArrayList<Medicamento>();
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        String menu = "1 - CADASTRO REMEDIOS\n" +
                "2 - LISTAR REMEDIOS\n" +
                "3 - CADASTRO PESSOA\n" +
                "4 - LISTAR PESSOAS\n" +
                "5 - RECEITAR REMÉDIO";

        int op =0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {


                Medicamento C = new Medicamento();
                C.cadRemed();
                remedios.add(C);

            }

            if (op == 2) {
                String lista = "";
                for (Medicamento R : remedios) {
                    lista += R.exibirRemed(remedios);
                }
                JOptionPane.showMessageDialog(null, lista);
            }

            if (op == 3) {
                Pessoa E = new Pessoa();
                E.cadastrarPessoa();
                pessoas.add(E);
            }

            if (op == 4) {
                String exib = "";
                for (Pessoa P : pessoas) {
                    exib += P.exibirPessoa(pessoas);
                }
                JOptionPane.showMessageDialog(null, exib);
            }

            if (op == 5) {


            }

        } while (op != 0);


    }
}