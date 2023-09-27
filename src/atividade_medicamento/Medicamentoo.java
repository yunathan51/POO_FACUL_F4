package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Medicamentoo {

    private ArrayList<Medicamentoo> contraIndicacao = new ArrayList<Medicamentoo>();
    private ArrayList<Medicamentoo> Topindicacao = new ArrayList<Medicamentoo>();

    private String nomeRemedio;
    private String administracao;

    private String indicacao;
    private String contraIndicao;

    public void cadRemed() {

        setNomeRemedio(JOptionPane.showInputDialog("INFORME O NOME DO REMEDIO").toLowerCase());
        setAdministracao(JOptionPane.showInputDialog("ORAL | TOPICO | INJETAVEL").toLowerCase());
        String continua;
        do {
            Medicamentoo A = new Medicamentoo();
            indicacao = JOptionPane.showInputDialog("INFORME A INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setIndicacao(indicacao);
            Topindicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRA INDICAÇÃO? (S/N)").toUpperCase();
        }while (continua.equalsIgnoreCase("S"));

        do {
            Medicamentoo A = new Medicamentoo();
            contraIndicao = JOptionPane.showInputDialog("INFORME A CONTRA INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setContraIndicao(contraIndicao);
            contraIndicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR CONTRA CONTRA INDICAÇÃO? (S/N)").toUpperCase();
        } while (continua.equalsIgnoreCase("S"));
    }

    public String exibirRemed(ArrayList<Medicamentoo> remedios) {
        String lista = "";
        for (Medicamentoo r : remedios) {
            lista += "NOME: " + r.getNomeRemedio() + "\n";
            lista+= "USO: " + r.getAdministracao() + "\n";

            lista += "\nINDICAÇÕES:\n";

            for (Medicamentoo indicacao : r.getTopindicacao()) {
                lista += "- " + indicacao.getIndicacao() + "\n";
            }

            lista+= "\n\nCONTRA INDICAÇÕES:\n";
            for (Medicamentoo contraIndicacao : r.getContraIndicacao()) {
                lista += "- " + contraIndicacao.getContraIndicao() + "\n";
            }

            lista += "\n";
        }

        return lista;
    }









    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getContraIndicao() {
        return contraIndicao;
    }

    public void setContraIndicao(String contraIndicao) {
        this.contraIndicao = contraIndicao;
    }

    public ArrayList<Medicamentoo> getContraIndicacao() {
        return contraIndicacao;
    }

    public void setContraIndicacao(ArrayList<Medicamentoo> contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
    }

    public ArrayList<Medicamentoo> getTopindicacao() {
        return Topindicacao;
    }

    public void setTopindicacao(ArrayList<Medicamentoo> topindicacao) {
        Topindicacao = topindicacao;
    }
}