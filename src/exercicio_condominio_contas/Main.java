package exercicio_condominio_contas;

import java.util.ArrayList;
import javax.swing.*;

public class Main {
    private static final ArrayList<Apartamento> apartamentos = new ArrayList<>();
    private static final ArrayList<Despesas> despesasCondo = new ArrayList<>();
    private static final ArrayList<Despesas> despesasAP = new ArrayList<>();

    public static void main(String[] args) {
        int op = 0;

        do {
            op = menu();
            switch (op) {
                case 1:
                    cadastrarApartamento();
                    break;
                case 2:
                    cadastrarDespesa();
                    break;
                case 3:
                    exibirApartamento();
                    break;
                case 4:
                    exibirContas();
                    break;
                case 5:
                    listarDividas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (op != 0);
    }

    public static int menu() {
        String menu = "1 - Cadastrar apartamento\n"
                + "2 - Cadastrar despesa\n"
                + "3 - Exibir apartamentos\n"
                + "4 - Exibir contas\n"
                + "0 - Sair\n\n"
                + "Escolha uma opção: ";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public static void cadastrarApartamento() {
        Apartamento ap = new Apartamento();
        ap.registrarApartamento(ap.getMetrosQuadrados());
        apartamentos.add(ap);
    }

    public static void cadastrarDespesa() {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Informar uma despesa do condominio ou de um apartamento?\n\n"
                        + "1 - Condominio\n"
                        + "2 - Apartamento\n"));

        switch (escolha) {
            case 1:
                Despesas despesa1 = new Despesas();
                Apartamento ap1 = new Apartamento();
                despesa1.cadDespesaCondominio();
                despesasCondo.add(despesa1);
                double dividido = despesa1.getValorDespesa() / apartamentos.size();

                for (Apartamento A : apartamentos) {
                    Despesas despesas = new Despesas();
                    despesas.setNumAP(A.getNumeroAP());
                    despesas.setNomeDespesa("DESPESA DO CONDOMINIO");
                    despesas.setAnoDespesa(despesa1.getAnoDespesa());
                    despesas.setMesDespesa(despesa1.getMesDespesa());
                    despesas.setValorDespesa(dividido);
                    despesasAP.add(despesas);

                }


                break;
            case 2:
                Despesas despesas2 = new Despesas();

                String escolheAP = "Escolha o apartamento";
                for (Apartamento A : apartamentos) {
                    escolheAP += A.getNomeProprietario() + " " + A.getNumeroAP() + "\n";
                }
                int escolherAP =
                        Integer.parseInt(JOptionPane.showInputDialog(escolheAP));

                for (Apartamento A : apartamentos) {
                    if (escolherAP == A.getNumeroAP()) {
                        despesas2.cadDespesaApartamento(escolherAP);
                        despesasAP.add(despesas2);
                    }
                }
        }
    }

    public static void exibirApartamento() {
        String exibir = "";

        for (Apartamento A : apartamentos) {
            exibir += A.exibirAPs();
        }
        JOptionPane.showMessageDialog(null, exibir);
    }

    public static void exibirContas() {
        int escolhe = Integer.parseInt(JOptionPane.showInputDialog(
                "Exibir contas do condominio ou de um apartamento em expecifico?\n\n"
                        + "1 - Condominio\n"
                        + "2 - Apartamento\n"));

        switch (escolhe) {
            case 1:
                String resultado = "Contas do condominio\n\n";
                for (Despesas A : despesasCondo) {
                    resultado += A.exibirContas();
                }
                if (!resultado.equals("Contas do condominio\n\n")) {
                    JOptionPane.showMessageDialog(null, resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Nada encontrado!");
                }
                break;

            case 2:
                String apartamentoConta = "escolha o apartamento: \n\n";
                String resultado2 = "";
                for (Apartamento A : apartamentos) {
                    apartamentoConta +=
                            A.getNomeProprietario() + " " + A.getNumeroAP() + "\n";
                }

                int escolheAP =
                        Integer.parseInt(JOptionPane.showInputDialog(apartamentoConta));

                for (Despesas A : despesasAP) {
                    if (escolheAP == A.getNumAP()) {
                        resultado2 += A.exibirContas();
                    }
                }

                if (!resultado2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, resultado2);
                } else {
                    JOptionPane.showMessageDialog(null, "nada encontrado!");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Escolha invalida!");
        }
    }

    public static void listarDividas() {
        String exibir = "Moradores: ";

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe um ano para  buscar: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe  o mes: "));

        for (Despesas A : despesasAP) {

            if (ano == A.getAnoDespesa() && mes == A.getMesDespesa()) {
                for (Apartamento B : apartamentos) {
                    exibir += B.getNomeProprietario() + " " + (B.getValorFixoAP() + A.getValorDespesa()) + "\n";
                }

            }
        }
        if (!exibir.equals("Moradores: ")) {
            JOptionPane.showMessageDialog(null, exibir);
        } else {
            JOptionPane.showMessageDialog(null, "Nada encontrado");
        }
    }
}
