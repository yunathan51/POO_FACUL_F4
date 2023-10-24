package Farmacia;

public class Produtos {

    protected String nome;
    protected int valor;
    protected int estoque;
    protected boolean precisaReceita;

    @Override
    public String toString() {
        return getNome() + " - R$" + getValor() + " - QTD: " + getEstoque() + "\n";
    }

    public Produtos() {
        this("", 0, 0, false);
    }

    public Produtos(String nome, int valor, int estoque, boolean precisaReceita) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.precisaReceita = precisaReceita;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
