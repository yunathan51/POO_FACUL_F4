package teste_banco_contas;

import java.util.ArrayList;

public class Conta {

    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Conta> contas = new ArrayList<Conta>();

    //private int numeroConta = 0;

    public void cadastro() {
        Usuario C = new Usuario();
        C.cadastrar();
        C.setSaldoConta((double) 0);
       //numeroConta++;
        usuarios.add(C);

    }

    public String exibir() {
        String mostrar = "";
        for (Usuario C : usuarios) {
            mostrar += C.getNmrConta() + "| " + C.getNomeUser() + " "  + C.getIdadeUser() + " | R$" + C.getSaldoConta() + "\n";
        }
        return mostrar;
    }









    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /*public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    } */

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }


}
