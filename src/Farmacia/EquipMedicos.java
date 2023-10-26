package Farmacia;

public class EquipMedicos extends Produtos{

    public EquipMedicos() {
        super();
    }


    public EquipMedicos(String nome, int estoque, int valor) {
        super(nome, estoque, valor, false);
    }

    @Override
    public boolean comprarProduto(Cliente c, String produto, int qtd) {
        if (nome.equals(produto)) {
                estoque -= qtd;
                c.saldoDevedor += (valor * qtd);
                return true;
            }
        return false;
    }

}
