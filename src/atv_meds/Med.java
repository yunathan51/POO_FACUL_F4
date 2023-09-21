package atv_meds;

import javax.swing.*;
import java.util.ArrayList;

public class Med {

    private ArrayList<Med> contraIndicacao = new ArrayList<Med>();
    private ArrayList<Med> Topindicacao = new ArrayList<Med>();

    private String nomeRemedio;
    private String administracao;

    private String indicacao;
    private String contraIndicao;

    public void cadRemed() {
        Med remedio = new Med();

        setNomeRemedio(JOptionPane.showInputDialog("INFORME O NOME DO REMEDIO").toLowerCase());
        setAdministracao(JOptionPane.showInputDialog("ORAL | TOPICO | INJETAVEL").toLowerCase());
        String continua = "";
        do {
            Med A = new Med();
            indicacao = JOptionPane.showInputDialog("INFORME A INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setIndicacao(indicacao);
            Topindicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRA INDICAÇÃO? (S/N)").toUpperCase();
        }while (continua.equalsIgnoreCase("S"));

        do {
            Med A = new Med();
            contraIndicao = JOptionPane.showInputDialog("INFORME A CONTRA INDICAÇÃO DO REMEDIO").toLowerCase();
            A.setContraIndicao(contraIndicao);
            contraIndicacao.add(A);

            continua = JOptionPane.showInputDialog("DESEJA ADICIONAR CONTRA CONTRA INDICAÇÃO? (S/N)").toUpperCase();
        } while (continua.equalsIgnoreCase("S"));
    }

    public String exibirRemed(ArrayList<Med> remedios) {
        String lista = "";
        for (Med r : remedios) {
            lista += "NOME: " + r.getNomeRemedio() + "\n";
            lista+= "USO: " + r.getAdministracao() + "\n";

            lista += "\nINDICAÇÕES:\n";

            for (Med indicacao : r.getTopindicacao()) {
                lista += "- " + indicacao.getIndicacao() + "\n";
            }

            lista+= "\n\nCONTRA INDICAÇÕES:\n";
            for (Med contraIndicacao : r.getContraIndicacao()) {
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

    public ArrayList<Med> getContraIndicacao() {
        return contraIndicacao;
    }

    public void setContraIndicacao(ArrayList<Med> contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
    }

    public ArrayList<Med> getTopindicacao() {
        return Topindicacao;
    }

    public void setTopindicacao(ArrayList<Med> topindicacao) {
        Topindicacao = topindicacao;
    }
}