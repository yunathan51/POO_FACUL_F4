package atividade_condominio;

import javax.swing.*;

public class Despesas {

    private int nmrAP;
    private int anoDespesa;

    private int mesDespesa;
    private String nomeDespesa;

    private double valorDespesa;

    public void registrarDespesaGeral() {
        setNomeDespesa(JOptionPane.showInputDialog("Digite o nome da despesa: ").toUpperCase());
        setAnoDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa: ")));
        setMesDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da despesa: ")));
        setValorDespesa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da despesa: ")));


    }

    public void registrarDespesaAP(int nmrAP) {
        setNmrAP(nmrAP);
        setAnoDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa: ")));
        setMesDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da despesa: ")));
        setNomeDespesa(JOptionPane.showInputDialog("Digite o nome da despesa: ").toUpperCase());
        setValorDespesa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da despesa: ")));

    }


        public String getNomeDespesa () {
            return nomeDespesa;
        }

        public void setNomeDespesa (String nomeDespesa){
            this.nomeDespesa = nomeDespesa;
        }

        public double getValorDespesa () {
            return valorDespesa;
        }

        public void setValorDespesa ( double valorDespesa){
            this.valorDespesa = valorDespesa;
        }

        public int getAnoDespesa () {
            return anoDespesa;
        }

        public void setAnoDespesa ( int anoDespesa){
            this.anoDespesa = anoDespesa;
        }

        public int getMesDespesa () {
            return mesDespesa;
        }

        public void setMesDespesa ( int mesDespesa){
            this.mesDespesa = mesDespesa;
        }

    public int getNmrAP() {
        return nmrAP;
    }

    public void setNmrAP(int nmrAP) {
        this.nmrAP = nmrAP;
    }

}
