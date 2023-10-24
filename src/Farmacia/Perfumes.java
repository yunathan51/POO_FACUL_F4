package Farmacia;

public class Perfumes extends Produtos{

    public Perfumes() {
        super();
    }

    public Perfumes(String nome, int valor, int estoque, boolean precisaReceita) {
        super(nome, valor, estoque, precisaReceita);
    }


    @Override
    public boolean venda(Cliente c, int qtd) {
        if (c.getSaldoDevedor() < 100) {
            if (estoque > 0) {
                estoque -= qtd;
                c.setSaldoDevedor(c.getSaldoDevedor() + (valor * qtd));
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
