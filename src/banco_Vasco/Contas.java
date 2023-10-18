package banco_Vasco;

import javax.swing.*;
import java.util.ArrayList;

public class Contas {



    private String nomeCorrentista;
    private int numeroConta;
    private int agencia;

    private int saldo =0;
    //private int tipoConta;

    public void registrarConta() {

        setNomeCorrentista(JOptionPane.showInputDialog("Informe seu nome: "));
        setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta: ")));
        setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a agencia: ")));
        setSaldo(saldo);


    }

    public String contasCadastradas() {
        String exibir = getNomeCorrentista() + " | " + getNumeroConta() + " | " + getAgencia() + " | " + getSaldo() + "\n";

        return exibir;
    }


    /*
Um banco deseja informatizar seu sistema bancário.
Todas as contas possuem:
● número
● agencia
● nome do correntista
● saldo
E podem realizar:
● Depósito
● Saque
● Transferência

 */



















    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}


