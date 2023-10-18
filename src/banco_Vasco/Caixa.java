package banco_Vasco;


import javax.swing.*;

public class Caixa {


    public void Depositar(){
     Contas C = new Contas();
        String exibir = "Escolha a conta para depositar: \n\n";

        for (Contas conta : Menu.contas) {
            exibir += conta.contasCadastradas() + "\n";
        }



        int escolher  = Integer.parseInt(JOptionPane.showInputDialog(exibir));

        for (Contas conta : Menu.contas) {
            if (escolher == conta.getNumeroConta()) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para depositar: "));
                conta.setSaldo(conta.getSaldo() + valor);
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "Conta não encontrada");
            }

        }

    }

    public void Sacar(){
        Contas C = new Contas();
        String exibir = "Escolha a conta para depositar: \n\n";

        for (Contas conta : Menu.contas) {
            exibir += conta.contasCadastradas() + "\n";
        }

        int escolher  = Integer.parseInt(JOptionPane.showInputDialog(exibir));

            for (Contas conta : Menu.contas) {
                if (escolher == conta.getNumeroConta()) {
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para sacar: "));
                            if (valor <= conta.getSaldo()) {
                                conta.setSaldo(conta.getSaldo() - valor);
                                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                            }
                } else {
                    JOptionPane.showMessageDialog(null, "Conta não encontrada");
                }
            }

    }

    public void Transferir() {
        Contas C = new Contas();
        String exibir = "";

        for (Contas conta : Menu.contas) {
            exibir += conta.contasCadastradas() + "\n";
        }

        int escolher1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma conta para sacar\n\n" + exibir));

            for (Contas conta : Menu.contas) {
                if (escolher1 == conta.getNumeroConta()) {
                    int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade para sacar: "));
                        for (Contas contas : Menu.contas) {
                            if (quantidade1 <= contas.getSaldo()) {
                                int escolher2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a conta para depositar: \n\n" + exibir));
                                    for (Contas conta1 : Menu.contas) {
                                        if (escolher2 == conta1.getNumeroConta()) {
                                            conta.setSaldo(conta.getSaldo() - quantidade1);
                                            conta1.setSaldo(conta1.getSaldo() + quantidade1);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Conta 2 não encontrada");
                                        }
                                    }

                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                            }
                        }

                } else {
                    JOptionPane.showMessageDialog(null, "Conta não encontrada");
                }
            }
    }


}
