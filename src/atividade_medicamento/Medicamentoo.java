package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Medicamentoo {

    ArrayList<Medicamentoo> contras = new ArrayList<Medicamentoo>();
    ArrayList<Medicamentoo> indicado = new ArrayList<Medicamentoo>();

    private String nomeMed;

    private String administracao;
    private String indicacao;

    private String contraIndicacao;

    private char perguntar;

    public void cadRemedio() {
        setNomeMed(JOptionPane.showInputDialog("Informe o nome do remédio"));
        setAdministracao(JOptionPane.showInputDialog("1 - Oral\n2 - Injetável\n3 - Tópico"));
        setPerguntar(JOptionPane.showInputDialog("Deseja adicionar contra indicação ou indicação? (S/N)").toUpperCase().charAt(0));
        String novamente = "";
            do {
                int escolha = Integer.parseInt(JOptionPane.showInputDialog("1 - Indicação\n2 - Contra indicação\n3 - Sair"));
                switch (escolha) {
                    case 1:
                        setIndicacao(JOptionPane.showInputDialog("Informe a indicação"));
                        indicado.add(this);
                        break;
                    case 2:
                        setContraIndicacao(JOptionPane.showInputDialog("Informe a contra indicação"));
                        contras.add(this);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saindo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }




                novamente = JOptionPane.showInputDialog("Deseja cadastrar alguma outra indicação/contra?").toUpperCase();
            } while (novamente.equalsIgnoreCase("S"));
    }

    public String exibirRemed() {










        return getNomeMed() + "\n" + getAdministracao() + "\n" + getIndicado() + "\n" + getContraIndicacao();
    }



/*
    public void cadContraIndicacao() {
        while (getPerguntar() == 'S') {
            String novaContraIndicao = JOptionPane.showInputDialog("Informe a contra indicação");
            setContraIndicacao(novaContraIndicao);

            char continua = JOptionPane.showInputDialog("Deseja adicionar mais contra indicações? (S/N)").toUpperCase().charAt(0);
            if (continua != 'S') {
                JOptionPane.showMessageDialog(null, "Optou por não cadastrar contra indicação");
                break;
            }
        }
    } */












































    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
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

    public String getContraIndicacao() {
        return contraIndicacao;
    }

    public void setContraIndicacao(String contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
    }

    public char getPerguntar() {
        return perguntar;
    }

    public void setPerguntar(char perguntar) {
        this.perguntar = perguntar;
    }

    public ArrayList<Medicamentoo> getContras() {
        return contras;
    }

    public void setContras(ArrayList<Medicamentoo> contras) {
        this.contras = contras;
    }

    public ArrayList<Medicamentoo> getIndicado() {
        return indicado;
    }

    public void setIndicado(ArrayList<Medicamentoo> indicado) {
        this.indicado = indicado;
    }
}
