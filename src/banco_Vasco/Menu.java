package banco_Vasco;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    static ArrayList<Contas> contas = new ArrayList<>();

    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();

            switch (op) {

                case 1:
                    Contas C = new Contas();
                    C.registrarConta();
                    contas.add(C);
                    break;

                case 2:
                    Contas D = new Contas();

                    String exibir = "";
                    for (Contas conta : contas) {
                        exibir += conta.contasCadastradas() + "\n";
                    }

                    JOptionPane.showMessageDialog(null, exibir);

                    break;

                case 3:
                    Caixa caixa = new Caixa();
                    caixa.Depositar();
                    break;

            }


        } while (op != 6);
    }


    public static int menu() {
        String menu = "1 - Cadastrar\n"
                + "2 - Listar Contas\n" +
                "3 - Depositar\n" +
                "4 - Sacar\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

}


