package atividade_pessoa_remedio;

import atividade_medicamento.Paciente;

import javax.swing.*;
import java.util.ArrayList;

public class Pessoa {

    private ArrayList<Pessoa> condicoesSaude = new ArrayList<Pessoa>();

    private ArrayList<Medicamento> remediosDescritos = new ArrayList<Medicamento>();

    private String nome;

    private String sintoma;
    private String condicaoSaude;



    public void cadastrarPessoa() {
        setNome(JOptionPane.showInputDialog("DIGITE O NOME DO USUARIO"));
        setSintoma(JOptionPane.showInputDialog("INFORME O SINTOMA"));
        String continua;

        do {
            Pessoa pessoa = new Pessoa();
            condicaoSaude = JOptionPane.showInputDialog("DIGITE A CONDIÇÃO DE SAUDE");
            pessoa.setCondicaoSaude(condicaoSaude);
            condicoesSaude.add(pessoa);

            continua = JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRA CONDIÇÃO DE SAUDE? S/N");
        } while (continua.equalsIgnoreCase("S"));
    }



    public String exibirPessoa(ArrayList<Pessoa> pessoas) {
        String exibir = "";

        for (Pessoa A : pessoas) {
            exibir += "NOME: " + A.getNome() + "\n";
            exibir += "REMÉDIO/S: " + A.getRemediosDescritos() + "\n\n";

            exibir += "CONDICAO DE SAUDE:\n ";

            for (Pessoa P : A.getCondicoesSaude()) {
                exibir += "- " + P.getCondicaoSaude() + "\n";
            }

            exibir += "\nSINTOMA: " + getSintoma();

        }
        return exibir;
    }












    public ArrayList<Pessoa> getCondicoesSaude() {
        return condicoesSaude;
    }

    public void setCondicoesSaude(ArrayList<Pessoa> condicoesSaude) {
        this.condicoesSaude = condicoesSaude;
    }

    public ArrayList<Medicamento> getRemediosDescritos() {
        return remediosDescritos;
    }

    public void setRemediosDescritos(ArrayList<Medicamento> remediosDescritos) {
        this.remediosDescritos = remediosDescritos;
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



}
