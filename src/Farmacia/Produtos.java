package Farmacia;

public class Produtos {

    protected String nome;
    protected int valor;
    protected int estoque;
    protected boolean precisaReceita;


    public String toString() {
        return getNome() + " - QTD: " + getEstoque() + " - R$: " + getValor();
    }

    public Produtos() {
        this("", 0, 0, false);
    }

    public Produtos(String nome, int estoque, int valor, boolean precisaReceita) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
        this.precisaReceita = precisaReceita;
    }

    public boolean comprarProduto(Cliente c, String produto, int qtd) {
        if (precisaReceita && c.possuiReceita) {
            if (nome.equals(produto)) {
                estoque -= qtd;
                c.saldoDevedor += (valor * qtd);
                return true;
            }
        } else if (!precisaReceita && nome.equals(produto)) {
            estoque -= qtd;
            c.saldoDevedor += (valor * qtd);
            return true;
        }
        return false;
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

    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public void setPrecisaReceita(boolean precisaReceita) {
        this.precisaReceita = precisaReceita;
    }
}
