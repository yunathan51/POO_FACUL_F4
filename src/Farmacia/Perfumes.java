package Farmacia;

public class Perfumes extends Produtos{

    public Perfumes() {
        super();
    }

    public Perfumes(String nome, int estoque, int valor) {
        super(nome, estoque, valor, false);
    }

    @Override
    public boolean comprarProduto(Cliente c, String produto, int qtd) {
        if (c.saldoDevedor < 100) {
            estoque -= qtd;
            c.saldoDevedor += (valor * qtd);
            return true;
        }
        return false;
    }
}
