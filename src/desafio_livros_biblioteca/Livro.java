package desafio_livros_biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Livro {

    private String nomeLivro;
    private Double preco;
    ArrayList<Autor> autores = new ArrayList<Autor>();
    ArrayList<Livro> livros = new ArrayList<Livro>();


    public void cadastro() {
        //Livro A = new Livro();
        setNomeLivro(JOptionPane.showInputDialog("INFORME O NOME DO LIVRO").toLowerCase());
        String outroAutor = "";
        do {
            Autor j = new Autor();
            j.cadAutor();
            autores.add(j);
            outroAutor =  JOptionPane.showInputDialog("DESEJAS CADASTRAR OUTRO AUTOR? S/N");
        } while (outroAutor.equalsIgnoreCase("S"));

        setPreco(Double.parseDouble(JOptionPane.showInputDialog("INFORME O PREÇO DO LIVRO:")));
        while (getPreco() <= 0) {
            setPreco(Double.parseDouble(JOptionPane.showInputDialog("PREÇO INVALIDO! INFORME CORRETAMENTE:")));
        }
        livros.add(this);
    }

    public String exibirDados() {
        String dados = " | ";
        for (Livro A : livros) {
            dados += A.getNomeLivro() + " | " + "R$ " + A.getPreco() + " | \n";
        }
        for (Autor j : autores) {
            dados += " | " + j.getNomeAutor() + " | " + j.getSexo() + " | " + j.getIdade() + " | " + "\n\n";
        }
        return dados;
    }

    public String exibirAutores() {
        String dados = " | ";
        for (Autor j : autores) {
            dados += j.getNomeAutor() + " | \n";
        }
        return dados;
    }































    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
