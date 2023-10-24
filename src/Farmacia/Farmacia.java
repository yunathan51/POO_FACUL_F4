package Farmacia;



public class Farmacia {

    public boolean vender(Produtos prod, Cliente cliente, int qtd, String produto) {
        if (prod.precisaReceita) {
            if (cliente.possuiReceita) {
                if (prod.nome.equals(produto)) {
                    if (prod.estoque > qtd) {
                        prod.estoque -= qtd;
                        cliente.saldoDevedor += (prod.valor * qtd);
                        return true;
                    } else {
                        return false;

                    }
                }
            } else {
                return false;
            }
        }
        return false;
    }

}
