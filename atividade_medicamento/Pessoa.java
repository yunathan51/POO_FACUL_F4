package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Pessoa {

    private ArrayList<Pessoa> condicoesSaude = new ArrayList<Pessoa>();

    private ArrayList<Pessoa> remediosDescritos = new ArrayList<Pessoa>();

    private String nome;

    private String sintoma;
    private String condicaoSaude;
    public void cadastrarPessoa() {
        setNome(JOptionPane.showInputDialog("digite o nome do usuario"));
        setSintoma(JOptionPane.showInputDialog("Informe o sintoma"));
        String continua;

        do {
            Pessoa P = new Pessoa();
            condicaoSaude = JOptionPane.showInputDialog("Digite a condição de saude");
            P.setCondicaoSaude(condicaoSaude);
            condicoesSaude.add(P);

            continua = JOptionPane.showInputDialog("Deseja cadastrar outra condição de saude?");
        } while (continua.equalsIgnoreCase("S"));
    }

    public String exibirPessoa(ArrayList<Pessoa> pessoas) {
        String exib = "";

        for (Pessoa A : pessoas) {
            exib += "NOME: " + A.getNome() + "\n";
            exib += "REMÉDIO/S: " + A.getRemediosDescritos() + "\n\n";

            exib += "CONDICAO DE SAUDE:\n ";
            for (Pessoa P : A.getCondicoesSaude()) {
                exib += "- " + P.getCondicaoSaude() + "\n";
            }

            exib += "\nSINTOMA: " + getSintoma();

        }
        return exib;
    }










    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getCondicaoSaude() {
        return condicaoSaude;
    }

    public void setCondicaoSaude(String condicaoSaude) {
        this.condicaoSaude = condicaoSaude;
    }

    public ArrayList<Pessoa> getCondicoesSaude() {
        return condicoesSaude;
    }

    public void setCondicoesSaude(ArrayList<Pessoa> condicoesSaude) {
        this.condicoesSaude = condicoesSaude;
    }

    public ArrayList<Pessoa> getRemediosDescritos() {
        return remediosDescritos;
    }

    public void setRemediosDescritos(ArrayList<Pessoa> remediosDescritos) {
        this.remediosDescritos = remediosDescritos;
    }


}