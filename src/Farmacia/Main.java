package Farmacia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        ArrayList<EquipMedicos> equipMedicos = new ArrayList<EquipMedicos>();
        ArrayList<Medicamentos> medicamentos = new ArrayList<>();
        ArrayList<Perfumes> perfumes = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();



        //cria contas
        clientes.add(new Cliente("João", true, 0));
        System.out.println(clientes.get(0));
        clientes.add(new Cliente("Maria", true, 0));
        System.out.println(clientes.get(1));
        //cria contas


        //cria produtos
        medicamentos.add(new Medicamentos("Dipirona", 10, 10, true));
        System.out.println(medicamentos.get(0));
        equipMedicos.add(new EquipMedicos("Termometro", 10, 10, false));
        System.out.println(equipMedicos.get(0));
        perfumes.add(new Perfumes("Perfume", 10, 10, false));
        System.out.println(perfumes.get(0));
        //cria produtos


        //faz a venda do produto
        farmacia.vender(medicamentos.get(0), clientes.get(0), 1, "Dipirona");
        System.out.println(clientes.get(0));


        //paga a conta
        clientes.get(0).pagarConta(10);
        System.out.println(clientes.get(0));







    }
}
