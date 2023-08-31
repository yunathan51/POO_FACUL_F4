package desafio_funcionario_empresa;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario F = new Funcionario();

        String menu = "1 - CADASTRAR NOVO FUNCIONARIO\n" +
                "2 - VISUALIZAR QTD FUNCIONARIOS\n" +
                "3 - IDADE MINIMA\n" +
                "4 - SAIR";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                F.cadastro();
                funcionarios.add(F);
                
            }
            if (op == 2) {
                String exibir = "";
                exibir += F.getTotalFuncionarios();

                JOptionPane.showMessageDialog(null, "NO MOMENTO EXISTEM " + exibir + " FUNCIONARIOS");
            }

            if (op == 3) {
                JOptionPane.showMessageDialog(null, F.getIdadeMinima());
            }

        } while (op != 4);
    }
}
