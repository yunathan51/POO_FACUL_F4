package atividade_nova_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private List<Livro> livrosEscritos;


    public Autor(String nome) {
        this.nome = nome;
        this.livrosEscritos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livrosEscritos.add(livro);
    }






























    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public void setLivrosEscritos(List<Livro> livrosEscritos) {
        this.livrosEscritos = livrosEscritos;
    }
}
