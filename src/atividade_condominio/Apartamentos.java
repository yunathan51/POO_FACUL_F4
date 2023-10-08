package atividade_condominio;

import javax.swing.*;

public class Apartamentos {

    private String nomeProprietario;
    private int numeroAP;
    private char bloco;
    private Double metrosQuadrados;


    public void registrarApartamento() {

        setNomeProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário: "));
        setBloco(JOptionPane.showInputDialog("Digite o bloco do apartamento: ").charAt(0));
        setNumeroAP(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: ")));
        setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do apartamento: ")));



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
    }











}
