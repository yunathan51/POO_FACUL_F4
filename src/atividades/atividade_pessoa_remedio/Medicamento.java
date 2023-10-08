package atividades.atividade_pessoa_remedio;

import javax.swing.*;
import java.util.ArrayList;


public class Medicamento {

    private ArrayList<Medicamento> indicacao = new ArrayList<Medicamento>();
    private ArrayList<Medicamento> contraIndicacao = new ArrayList<Medicamento>();

    private String nomeRemedio;
    private String administracao;

    private String adcIndicacao;
    private String adcContraIndicacao;


    public void cadRemedio() {

        setNomeRemedio(JOptionPane.showInputDialog("O NOME DO REMEDIO:").toUpperCase());
        setAdministracao(JOptionPane.showInputDialog("ORAL | TOPICO | INJETAVEL").toUpperCase());

        String continua = "";

        do {
            Medicamento remedio = new Medicamento();

            setAdministracao(JOptionPane.showInputDialog("INFORME A INDICAÇÃO DO REMEDIO").toUpperCase());
            remedio.setAdcIndicacao(adcIndicacao);
            indicacao.add(remedio);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRA INDICAÇÃO? (S/N)");

        } while (continua.equalsIgnoreCase("S"));

        do {
            Medicamento remedio = new Medicamento();

            setAdcContraIndicacao(JOptionPane.showInputDialog("INFORME A CONTRA INDICAÇÃO DO REMEDIO").toUpperCase());
            remedio.setAdcContraIndicacao(adcContraIndicacao);
            indicacao.add(remedio);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRA CONTRA INDICAÇÃO? (S/N)");

        } while (continua.equalsIgnoreCase("S"));
    }



    public String exibirRemed(ArrayList<Medicamento> remedios) {
        String lista = "";

            for (Medicamento A : remedios) {
            lista += "NOME: " + A.getNomeRemedio() + "\n";
            lista += "USO: " + A.getAdministracao() + "\n";
            lista += "\nINDICAÇÕES:\n";

            for (Medicamento indicacao : A.getIndicacao()) {
                lista += "- " + indicacao.getAdcIndicacao() + "\n";
            }

            lista += "\n\nCONTRA INDICAÇÕES:\n";

            for (Medicamento contraIndicacao : A.getContraIndicacao()) {
                lista += "- " + contraIndicacao.getAdcContraIndicacao() + "\n";
            }
        }
        return lista;
    }
































    public ArrayList<Medicamento> getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(ArrayList<Medicamento> indicacao) {
        this.indicacao = indicacao;
    }

    public ArrayList<Medicamento> getContraIndicacao() {
        return contraIndicacao;
    }

    public void setContraIndicacao(ArrayList<Medicamento> contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
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

    public String getAdcIndicacao() {
        return adcIndicacao;
    }

    public void setAdcIndicacao(String adcIndicacao) {
        this.adcIndicacao = adcIndicacao;
    }

    public String getAdcContraIndicacao() {
        return adcContraIndicacao;
    }

    public void setAdcContraIndicacao(String adcContraIndicacao) {
        this.adcContraIndicacao = adcContraIndicacao;
    }





}

