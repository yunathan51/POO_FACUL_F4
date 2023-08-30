package desafio_livros_biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>();

        String menu = "1 - CADASTRAR LIVRO\n" +
                "2 - LISTAR TODOS OS LIVROS CADASTRADOS\n" +
                "3 - PESQUISAR LIVRO POR AUTOR\n" +
                "4 - LISTAR POR SEXO\n" +
                "5 - PESQUISAR POR FAIXA DE PREÇO" +
                "6 - LISTAR POR IDADE DO AUTOR" +
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

        } while(op != 7);
    }
}
