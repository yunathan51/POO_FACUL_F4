package desafio_livros_biblioteca;

import javax.swing.*;

public class Livros {

    private String titulo;
    private String autor;
    private double preco;


    public void cadastro() {
        setTitulo(JOptionPane.showInputDialog("INFORME O NOME DO LIVRO:").toLowerCase());
        setAutor(JOptionPane.showInputDialog("INFORME O AUTOR DO LIVRO:").toLowerCase());
        setPreco(Double.parseDouble(JOptionPane.showInputDialog("INFORME O PREÇO:")));
        if (getPreco() < 0) {
            setPreco(Double.parseDouble(JOptionPane.showInputDialog("PREÇO INVALIDO! DIGITE NOVAMENTE:")));
        }
    }
















    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
