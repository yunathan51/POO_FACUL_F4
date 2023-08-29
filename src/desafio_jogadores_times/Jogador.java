package desafio_jogadores_times;

import javax.swing.*;

public class Jogador {

    private String nomeJog;
    private int nmrCamisa;
    private int nmrGols;

    public void cadastrar() {
        setNomeJog(JOptionPane.showInputDialog("INFORME O NOME DO JOGADOR"));
        setNmrCamisa(Integer.parseInt(JOptionPane.showInputDialog("INFORME O NMR DA CAMISA")));
        setNmrGols(Integer.parseInt(JOptionPane.showInputDialog("INFORME A QTD DE GOLS")));
    }

    public String exibirJogador() {
        return getNomeJog() + " | " + getNmrCamisa() + " | " + getNmrGols() + "\n";
    }

    public String getNomeJog() {
        return nomeJog;
    }

    public void setNomeJog(String nomeJog) {
        this.nomeJog = nomeJog;
    }

    public int getNmrCamisa() {
        return nmrCamisa;
    }

    public void setNmrCamisa(int nmrCamisa) {
        this.nmrCamisa = nmrCamisa;
    }

    public int getNmrGols() {
        return nmrGols;
    }

    public void setNmrGols(int nmrGols) {
        this.nmrGols = nmrGols;
    }

}
