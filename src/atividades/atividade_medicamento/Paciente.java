package atividades.atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Paciente {

    private ArrayList<Paciente> condicoesSaude = new ArrayList<Paciente>();

    private ArrayList<Medicamentoo> remediosDescritos = new ArrayList<Medicamentoo>();

    private String nome;

    private String sintoma;
    private String condicaoSaude;
    public void cadastrarPessoa() {
        setNome(JOptionPane.showInputDialog("digite o nome do usuario"));
        setSintoma(JOptionPane.showInputDialog("Informe o sintoma"));
        String continua;

        do {
            Paciente P = new Paciente();
            condicaoSaude = JOptionPane.showInputDialog("Digite a condição de saude");
            P.setCondicaoSaude(condicaoSaude);
            condicoesSaude.add(P);

            continua = JOptionPane.showInputDialog("Deseja cadastrar outra condição de saude?");
        } while (continua.equalsIgnoreCase("S"));
    }

    public String exibirPessoa(ArrayList<Paciente> pessoas) {
        String exib = "";

        for (Paciente A : pessoas) {
            exib += "NOME: " + A.getNome() + "\n";
            exib += "REMÉDIO/S: " + A.getRemediosDescritos() + "\n\n";

            exib += "CONDICAO DE SAUDE:\n ";
            for (Paciente P : A.getCondicoesSaude()) {
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

    public ArrayList<Paciente> getCondicoesSaude() {
        return condicoesSaude;
    }

    public void setCondicoesSaude(ArrayList<Paciente> condicoesSaude) {
        this.condicoesSaude = condicoesSaude;
    }

    public ArrayList<Medicamentoo> getRemediosDescritos() {
        return remediosDescritos;
    }

    public void setRemediosDescritos(ArrayList<Medicamentoo> remediosDescritos) {
        this.remediosDescritos = remediosDescritos;
    }

    public ArrayList<Medicamentoo> getRemediosPrescritos() {
        return remediosDescritos;
    }

    public void setRemediosDescritos(Medicamentoo medicamentoo) {
    }
}