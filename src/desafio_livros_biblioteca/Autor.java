package desafio_livros_biblioteca;

import javax.swing.*;

public class Autor {


    public void cadAutor() {
        setNomeAutor(JOptionPane.showInputDialog("INFORME O NOME DO AUTOR"));
        setSexo(JOptionPane.showInputDialog("INFORME O SEXO DO AUTOR| M/F").toUpperCase());
        while(!getSexo().equals("M") || !getSexo().equals("F")) {
            setSexo(JOptionPane.showInputDialog("SEXO INVALIDO, INFORME NOVAMENTE| M/F").toUpperCase());
        }
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("INFORME A IDADE DO AUTOR")));
        while (getIdade() < 0) {
            setIdade(Integer.parseInt(JOptionPane.showInputDialog("IDADE INVALIDA! INFORME UMA IDADE VALIDA")));
        }
    }

    public String exibirAut() {
        return getNomeAutor() + " | " + getSexo() + " | " + getIdade() + "\n";
    }



    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String nomeAutor;
    private String sexo;
    private int idade;



}
