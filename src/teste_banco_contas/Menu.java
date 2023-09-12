package teste_banco_contas;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<Conta>();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        String menu = "1 - CADASTRAR NOVA CONTA\n" +
                "2 - EXIBIR CONTAS\n" +
                "3 - ADICIONAR SALDO";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                Usuario A = new Usuario();
                Conta C = new Conta();
                C.cadastro();
                contas.add(C);
                usuarios.add(A);
            }

            if (op == 2) {
                String print = "";
                for (Conta C : contas) {
                    print += C.exibir();
                }
                JOptionPane.showMessageDialog(null, print);
            }

            if (op == 3) {
                    //fazer o usuario digitar o numero da conta e o programa verificar se existe
                //se existir, mostrar uma mensagem de sucesso apenas
                //se nao existir, mostrar uma mensagem de erro

                int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO DA CONTA"));
double valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR A SER ADICIONADO"));
                for (Conta C : contas) {

                }
            }


        } while (op != 4);
    }
}
