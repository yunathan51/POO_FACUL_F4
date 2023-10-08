package exercicio_condominio_contas;

import javax.swing.*;
import java.util.ArrayList;

public class Apartamento {


    ArrayList<Despesas> despesasDoAP = new ArrayList<>();

    private String nomeProprietario;

    private char bloco;
    private int numeroAP;
    private Double metrosQuadrados;

    private Double valorFixoAP;

    public Apartamento() { }

    public void registrarApartamento(Double valorFixoAP) {
        setNomeProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário: "));
        setBloco(JOptionPane.showInputDialog("Digite o bloco do apartamento: ").charAt(0));
        setNumeroAP(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: ")));
        setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do apartamento: ")));
        setValorFixoAP(getMetrosQuadrados() * 5);
    }

    public String exibirAPs() {
        String exibirApartamentos = "DONO: " + getNomeProprietario() + "\n"
                + "BLOCO: " + getBloco() + "\n"
                + "NÚMERO: " + getNumeroAP() + "\n"
                + "TAMANHO: " + getMetrosQuadrados() + "m²" + "\n"
                + "VALOR: " + getValorFixoAP() + "\n\n";
        return exibirApartamentos;
    }
































































    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getNumeroAP() {
        return numeroAP;
    }

    public void setNumeroAP(int numeroAP) {
        this.numeroAP = numeroAP;
    }

    public char getBloco() {
        return bloco;
    }

    public void setBloco(char bloco) {
        this.bloco = bloco;
    }

    public Double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(Double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;

    } public ArrayList<Despesas> getDespesasDoAP() {

        return despesasDoAP;
    }

    public void setDespesasDoAP(ArrayList<Despesas> despesasDoAP) {
        this.despesasDoAP = despesasDoAP;
    }

    public Double getValorFixoAP() {
        return valorFixoAP;
    }

    public void setValorFixoAP(Double valorFixoAP) {
        this.valorFixoAP = valorFixoAP;
    }

}
