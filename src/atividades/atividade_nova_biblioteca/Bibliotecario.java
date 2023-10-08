package atividades.atividade_nova_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {

    private String nome;
    private List<Livro> livrosResponsabilidade;


    public Bibliotecario(String nome) {
        this.nome = nome;
        this.livrosResponsabilidade = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, Autor autor) {
        Livro livro = new Livro(titulo, autor, this);
        this.livrosResponsabilidade.add(livro);
        autor.adicionarLivro(livro);
    }

    public void exibirLivrosResponsa() {
        String exibir = "Livros sobre a responsabilidade de " + this.nome + ":\n";
        for (Livro livro : this.livrosResponsabilidade) {
            exibir += livro.getTitulo() + "\n";
        }
    }

    public void adicionaLivro(Livro livro) {
        this.livrosResponsabilidade.add(livro);
    }























    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosResponsabilidade() {
        return livrosResponsabilidade;
    }

    public void setLivrosResponsabilidade(List<Livro> livrosResponsabilidade) {
        this.livrosResponsabilidade = livrosResponsabilidade;
    }
}
