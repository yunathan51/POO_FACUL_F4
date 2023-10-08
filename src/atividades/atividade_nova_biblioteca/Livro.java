package atividades.atividade_nova_biblioteca;

import javax.swing.*;

public class Livro {

    private String titulo;
    private Autor autor;
    private Bibliotecario responsavel;
    private boolean emprestado;



    public Livro(String titulo, Autor autor, Bibliotecario responsavel) {
        this.titulo = titulo;
        this.autor = autor;
        this.responsavel = responsavel;
    }

    public void emprestar(String pessoa) {
        JOptionPane.showMessageDialog(null, "O livro " + this.titulo + " foi emprestado para " + pessoa);
    }























    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Bibliotecario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Bibliotecario responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
