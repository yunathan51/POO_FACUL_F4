package atividade_nova_biblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Livro> livros = new ArrayList<>();
    private static List<Autor> autores = new ArrayList<>();
    private static List<Bibliotecario> bibliotecarios = new ArrayList<>();

    public static void main(String[] args) {

        int op = 0;

        do {
            op = menu();
            switch (op) {
                case 1:
                    cadAutor();
                    break;
                case 2:
                    cadBibliotecario();
                    break;
                case 3:
                    cadLivro();
                    break;
                case 4:
                    listarLivrosAutor();
                    break;
                case 5:
                    listarResponsaBibliotecario();
                    break;
                case 6:
                    emprestarLivro();
                    break;
                case 7:
                    devolverLivro();
                    break;
                case 8:
                    listarTodosLivros();
                    break;
            }

        } while (op != 9);

    }

    private static int menu() {
        String escolha = "Escolha uma opção:\n" +
                        "1. Cadastrar Autor\n" +
                        "2. Cadastrar Bibliotecário\n" +
                        "3. Cadastrar Livro\n" +
                        "4. Listar Livros de um Autor\n" +
                        "5. Listar Livros sob Responsabilidade de um Bibliotecário\n" +
                        "6. Emprestar Livro\n" +
                        "7. Devolver livro\n" +
                        "8. Disponibilidade\n" +
                        "9. Sair";

        return Integer.parseInt(JOptionPane.showInputDialog(escolha));
    }

    private static void cadAutor() {
        Autor autor = new Autor(JOptionPane.showInputDialog("Digite o nome do autor: "));
        autores.add(autor);
        JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
    }

    private static void cadBibliotecario() {
        Bibliotecario bibliotecario = new Bibliotecario(JOptionPane.showInputDialog("Digite o nome do bibliotecario: "));
        bibliotecarios.add(bibliotecario);
        JOptionPane.showMessageDialog(null, "Bibliotecario cadastrado com sucesso!");
    }

    private static void cadLivro() {
        String titulo = JOptionPane.showInputDialog("Informe o nome do livro: ");

        String exibir = "Autores cadastrados:\n";
        for (Autor autor : autores) {
            int i = 0;
            i++;
            exibir += i  + " - "+ autor.getNome() + "\n";
        }

        int autor = Integer.parseInt(JOptionPane.showInputDialog(exibir + "Informe o autor do livro: "));
        Autor autorLivro = autores.get(autor - 1);

        exibir = "Bibliotecarios cadastrados:\n";
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int i = 0;
            i++;
            exibir += i  + " - "+ bibliotecario.getNome() + "\n";
        }

        int bibliotecario = Integer.parseInt(JOptionPane.showInputDialog(exibir + "Informe o bibliotecario responsavel: "));
        Bibliotecario bibliotecarioLivro = bibliotecarios.get(bibliotecario - 1);

        Livro novoLivro = new Livro(titulo, autorLivro, bibliotecarioLivro);
        livros.add(novoLivro);
        autorLivro.adicionarLivro(novoLivro);
        bibliotecarioLivro.adicionaLivro(novoLivro);
    }

    private static void listarLivrosAutor() {
        String exibir = "Autores: \n";
        for (Autor autor : autores) {
            int i = 0;
            i++;
            exibir += i  + " - "+ autor.getNome() + "\n";
        }
        int nomeAutor = Integer.parseInt(JOptionPane.showInputDialog(exibir + "digite o nome do autor desejado: "));

        for (Autor autor : autores) {
            if (autor.getNome().equals(autores.get(nomeAutor - 1).getNome())) {
                exibir = "Livros escritos por " + autor.getNome() + ":\n";
                for (Livro livro : autor.getLivrosEscritos()) {
                    exibir += livro.getTitulo() + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, exibir);

    }

    private static void listarResponsaBibliotecario() {
        String exibir = "Bibliotecarios: \n";
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int i = 0;
            i++;
            exibir += i  + " - "+ bibliotecario.getNome() + "\n";
        }
        int nomeBibliotecario = Integer.parseInt(JOptionPane.showInputDialog(exibir + "digite o nome do bibliotecario desejado: "));

        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNome().equals(bibliotecarios.get(nomeBibliotecario - 1).getNome())) {
                exibir = "Livros sob a responsabilidade de " + bibliotecario.getNome() + ":\n";
                for (Livro livro : bibliotecario.getLivrosResponsabilidade()) {
                    exibir += livro.getTitulo() + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, exibir);



    }

    private static void emprestarLivro() {
        String pessoaEmprestar = JOptionPane.showInputDialog("Informe o nome da pessoa que deseja emprestar o livro: ");
        String exibir = "Livros disponiveis: \n";
        int i = 0;
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                i++;
                exibir += i  + " - "+ livro.getTitulo() + "\n";
            }
        }

        int escolheLivro = Integer.parseInt(JOptionPane.showInputDialog(exibir + "Informe o livro que deseja emprestar: "));
        boolean livroDisponivel = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(livros.get(escolheLivro - 1).getTitulo())) {
                livro.emprestar(pessoaEmprestar);
                JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
                livroDisponivel = true;
                livro.setEmprestado(true);
            }
        }

        if (!livroDisponivel) {
            JOptionPane.showMessageDialog(null, "Livro não disponivel!");
        }
    }

    private static void listarTodosLivros() {
        String listaLivros = "Lista de Todos os Livros:\n";

        for (Livro livro : livros) {
            boolean disponivel = !livro.isEmprestado(); // Verifica se o livro não está emprestado

            listaLivros += "\n" + livro.getTitulo() + "\n";
            listaLivros += (disponivel ? "DISPONÍVEL" : "INDISPONÍVEL") + "\n\n";
        }

        JOptionPane.showMessageDialog(null, listaLivros);
    }

    private static void devolverLivro() {
        String exibir = "Livros: \n";
        int i = 0;
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                i++;
                exibir += i  + " - "+ livro.getTitulo() + "\n";
            }
        }
        int escolheLivro = Integer.parseInt(JOptionPane.showInputDialog(exibir + "Informe o livro que deseja devolver: "));
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(livros.get(escolheLivro - 1).getTitulo())) {
                livro.setEmprestado(false);
                JOptionPane.showMessageDialog(null, livro.getTitulo() + " devolvido com sucesso!");
            }
        }

    }
}
