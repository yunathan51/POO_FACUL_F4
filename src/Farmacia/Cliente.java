package Farmacia;

public class Cliente {

    protected String nome;

    protected int saldoDevedor;

    protected boolean possuiReceita;


    @Override
    public String toString() {
        return getNome() + " - Deve: " + getSaldoDevedor() + "\n";
    }

    public Cliente() {
        this("", false, 0);

    }

    public Cliente(String nome, boolean possuiReceita, int saldoDevedor) {
        this.nome = nome;
        this.saldoDevedor = saldoDevedor;
        this.possuiReceita = possuiReceita;
    }

    public boolean pagarConta(int vl) {
        if (saldoDevedor > 0) {
            saldoDevedor -= vl;
            return true;
        } else {
            return false;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(int saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
}
