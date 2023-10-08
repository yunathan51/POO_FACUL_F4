package atividades.desafio_jogadores_times;

import javax.swing.*;
import java.util.ArrayList;

public class Times {

    private String nomeTime;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();


    public void cadastroTime() {
        setNomeTime(JOptionPane.showInputDialog("INFORME O NOME DO TIME"));
        String continuar = "";
        do {
            Jogador j = new Jogador();
            j.cadastrar();
            jogadores.add(j);
            continuar = JOptionPane.showInputDialog("DESEJA CADASTRAR NOVO JOGADOR? S/N");
        } while (continuar.equalsIgnoreCase("S"));
    }

    public String exibirDados() {
        String dados = " | " + getNomeTime() + " | \n";
        for (Jogador j : jogadores) {
            dados += j.exibirJogador();
        }
        return dados;
    }

    public Jogador artilheiroTime() {
        Jogador art = jogadores.get(0);
        for (Jogador j : jogadores) {
            if (j.getNmrGols() > art.getNmrGols()) {
                art = j;
            }
        }
    return art;
    }

    public int getGolsTime() {
        int gols = 0;
        for (Jogador j : jogadores) {
            gols += j.getNmrGols();
        }
        return gols;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }


}
