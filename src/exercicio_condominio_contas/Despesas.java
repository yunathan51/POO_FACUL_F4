package exercicio_condominio_contas;

import javax.swing.*;

public class Despesas {

    private String nomeDespesa;

    private int numAP;
    private int anoDespesa;
    private int mesDespesa;

    private Double valorDespesa;



    public void cadDespesaCondominio() {
        setNomeDespesa(JOptionPane.showInputDialog("Digite o nome da despesa: ").toUpperCase());
        setAnoDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa: ")));
        setMesDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da despesa: ")));
        setValorDespesa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da despesa: ")));
    }

    public void cadDespesaApartamento(int numAP) {
        setNumAP(numAP);
        setNomeDespesa(JOptionPane.showInputDialog("Digite o nome da despesa: ").toUpperCase());
        setAnoDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa: ")));
        setMesDespesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da despesa: ")));
        setValorDespesa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da despesa: ")));
    }

    public String exibirContas() {
        String exibirContas = getNomeDespesa() + "\n"
                + "ANO: " + getAnoDespesa() + "\n"
                + "MÊS: " + getMesDespesa() + "\n"
                + "VALOR: R$" + getValorDespesa() + "\n\n";
        return exibirContas;
    }



















    public String getNomeDespesa() {
        return nomeDespesa;
    }

    public void setNomeDespesa(String nomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }

    public int getAnoDespesa() {
        return anoDespesa;
    }

    public void setAnoDespesa(int anoDespesa) {
        this.anoDespesa = anoDespesa;
    }

    public int getMesDespesa() {
        return mesDespesa;
    }

    public void setMesDespesa(int mesDespesa) {
        this.mesDespesa = mesDespesa;
    }

    public Double getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(Double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public int getNumAP() {
        return numAP;
    }

    public void setNumAP(int numAP) {
        this.numAP = numAP;
    }


}
