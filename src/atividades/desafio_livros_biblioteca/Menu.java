package atividades.desafio_livros_biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>();

        String menu = "1 - CADASTRAR LIVRO\n" +
                "2 - LISTAR TODOS OS LIVROS CADASTRADOS\n" +
                "3 - PESQUISAR LIVRO POR AUTOR\n" +
                "4 - LISTAR POR SEXO\n" +
                "5 - PESQUISAR POR FAIXA DE PREÇO\n" +
                "6 - LISTAR POR IDADE DO AUTOR\n" +
                "7 - SAIR";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

                if (op == 1) {

                    Livro B = new Livro();
                    B.cadastro();
                    livros.add(B);

                }

                if (op == 2) {
                    String print = "";
                    for (Livro B : livros) {
                        print += B.exibirDados();
                    }
                    JOptionPane.showMessageDialog(null, print);
                }

                if (op == 3) {
                    String listar = "INFORME O NOME DO AUTOR PARA BUSCAR\n\n";
                    String resultado = "LIVROS:\n\n";
                    String index ="";
                    for (Livro B : livros) {

                        listar += B.exibirAutores();
                    }
                    index = JOptionPane.showInputDialog(listar).toLowerCase();
                    for (Livro B :livros) {
                        if (index.equalsIgnoreCase(B.getNomeLivro())) {
                            resultado += B.exibirDados();
                        }
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                }

        } while(op != 7);
    }
}
