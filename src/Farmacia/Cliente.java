package Farmacia;

public class Cliente {

    protected String nome;
    protected int saldoDevedor;
    protected boolean possuiReceita;

    public String toString() {
        return "Nome: " + this.nome + " R$: " + this.saldoDevedor;
    }

    public Cliente () {
        this("", false);
    }

    public Cliente (String nome, boolean possuiReceita) {
        this.nome = nome;
        this.saldoDevedor = 0;
        this.possuiReceita = possuiReceita;
    }

    public boolean pagarDivida(int vl) {
        if (this.saldoDevedor > 0) {
            this.saldoDevedor -= vl;
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
