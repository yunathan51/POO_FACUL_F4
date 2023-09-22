package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Medicamento {

    private ArrayList<Medicamento> contraIndicacao = new ArrayList<Medicamento>();
    private ArrayList<Medicamento> Topindicacao = new ArrayList<Medicamento>();

    private String nomeRemedio;
    private String administracao;

    private String indicacao;
    private String contraIndicao;

    public void cadRemed() {

        setNomeRemedio(JOptionPane.showInputDialog("INFORME O NOME DO REMEDIO").toLowerCase());
        setAdministracao(JOptionPane.showInputDialog("ORAL | TOPICO | INJETAVEL").toLowerCase());
        String continua;
        do {
            Medicamento A = new Medicamento();
            indicacao = JOptionPane.showInputDialog("INFORME A INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setIndicacao(indicacao);
            Topindicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRA INDICAÇÃO? (S/N)").toUpperCase();
        }while (continua.equalsIgnoreCase("S"));

        do {
            Medicamento A = new Medicamento();
            contraIndicao = JOptionPane.showInputDialog("INFORME A CONTRA INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setContraIndicao(contraIndicao);
            contraIndicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR CONTRA CONTRA INDICAÇÃO? (S/N)").toUpperCase();
        } while (continua.equalsIgnoreCase("S"));
    }

    public String exibirRemed(ArrayList<Medicamento> remedios) {
        String lista = "";
        for (Medicamento r : remedios) {
            lista += "NOME: " + r.getNomeRemedio() + "\n";
            lista+= "USO: " + r.getAdministracao() + "\n";

            lista += "\nINDICAÇÕES:\n";

            for (Medicamento indicacao : r.getTopindicacao()) {
                lista += "- " + indicacao.getIndicacao() + "\n";
            }

            lista+= "\n\nCONTRA INDICAÇÕES:\n";
            for (Medicamento contraIndicacao : r.getContraIndicacao()) {
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

    public ArrayList<Medicamento> getContraIndicacao() {
        return contraIndicacao;
    }

    public void setContraIndicacao(ArrayList<Medicamento> contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
    }

    public ArrayList<Medicamento> getTopindicacao() {
        return Topindicacao;
    }

    public void setTopindicacao(ArrayList<Medicamento> topindicacao) {
        Topindicacao = topindicacao;
    }
}