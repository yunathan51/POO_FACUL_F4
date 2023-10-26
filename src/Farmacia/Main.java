package Farmacia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        produtos.add(new Medicamentos("Dipirona", 10, 10, false)); // Produto 0
        produtos.add(new EquipMedicos("Mascara", 10, 10)); // Produto 1
        produtos.add(new Perfumes("Perfume", 10, 10)); // Produto 2

        clientes.add(new Cliente("João", false)); // Cliente 0
        clientes.add(new Cliente("Maria", true)); // Cliente 1

        // Compra de produtos
        // seleciona produto, seleciona cliente, nome produto, quantidade
        produtos.get(0).comprarProduto(clientes.get(0), "Dipirona", 1);

        System.out.println(produtos.get(0));
        System.out.println(clientes.get(0));







    }
}
