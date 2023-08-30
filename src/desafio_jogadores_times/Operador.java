package desafio_jogadores_times;

import javax.swing.*;
import java.util.ArrayList;

public class Operador {

    public static void main(String[] args) {

        ArrayList<Times> times = new ArrayList<Times>();

        String menu = "1 - CADASTRAR TIME\n"
                + "2 - LISTAR JOGADORES DE UM TIME\n"
                + "3 - ARTILHEIRO DE UM TIME\n"
                + "4 - TIME COM MAIOR QTD GOLS\n"
                + "5 - SAIR!\n";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
                Times t = new Times();
                t.cadastroTime();
                times.add(t);
            }
            if (op == 2) {

                String entrada = JOptionPane.showInputDialog("QUAL NOME DO TIME PARA CONSULTAR?").toUpperCase();
                String result = "JOGADORES DO TIME: " + entrada + "\n";

                for (Times t : times) {
                    if (entrada.equalsIgnoreCase(t.getNomeTime())) {
                        result += t.exibirDados();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 3) {

                String entrada = JOptionPane.showInputDialog("QUAL TIME PARA VER O ARTILHEIRO??").toUpperCase();
                String result = "ARTILHEIRO DO TIME: " + entrada + "\n";

                for (Times t : times) {
                    if (entrada.equalsIgnoreCase(t.getNomeTime())) {
                        Jogador artilheiro = t.artilheiroTime();
                        result += artilheiro.exibirJogador();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 4) {
                Times timeMaisGols = null;
                int maxGols = -1;

                for (Times t : times) {
                    int golsTime = t.getGolsTime();
                    if (golsTime > maxGols) {
                        maxGols = golsTime;
                        timeMaisGols = t;
                    }
                }

                if (timeMaisGols != null) {
                    JOptionPane.showMessageDialog(null,
                            "TIME COM MAIS GOLS" + timeMaisGols.getNomeTime() + " - Total de gols: " + maxGols);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Não há times cadastrados ou não foi possível determinar o time com mais gols.");
                }
            }

        } while (op != 5);
    }

}
