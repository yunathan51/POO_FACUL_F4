package atividade_condominio;

import javax.swing.*;
import java.util.ArrayList;

public class Condominio {

    private static ArrayList<Apartamentos> listaApartamentos = new ArrayList<Apartamentos>();
    private static ArrayList<Despesas> listaDespesasGerais = new ArrayList<Despesas>();
    private static ArrayList<Despesas> listaDespesasEspecificas = new ArrayList<Despesas>();

    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    registrarCondominio();
                    break;
                case 2:
                    registrarDespesa();
                    break;
                case 3:
                    listarAPs();
                    break;
                case 4:
                    listarDespesas();
                    break;
                case 5:
                    devidoPorMorador();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (op != 6);
    }

    public static void registrarCondominio() {
        Apartamentos apartamentos = new Apartamentos();
        apartamentos.registrarApartamento();
        listaApartamentos.add(apartamentos);
    }

    public static void registrarDespesa() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("DESPESA GERAL OU PARA UM AP ESPECIFICO?\n1. Geral\n2. Específico"));
        switch (op) {
            case 1:

                Despesas despesas = new Despesas();
                despesas.registrarDespesaGeral();
                listaDespesasGerais.add(despesas);

                double valorDividir = despesas.getValorDespesa() / listaApartamentos.size();

                for (Apartamentos A : listaApartamentos) {
                    Despesas divisao = new Despesas();
                    divisao.setNmrAP(A.getNumeroAP());
                    divisao.setNomeDespesa("DESPESAS DO CONDOMINIO");
                    divisao.setAnoDespesa((despesas.getAnoDespesa()));
                    divisao.setMesDespesa((despesas.getMesDespesa()));
                    divisao.setValorDespesa(valorDividir);
                    listaDespesasEspecificas.add(divisao);
                }
                break;

            case 2:
                String exibirApartamentos = "";

                for (Apartamentos A : listaApartamentos) {
                    exibirApartamentos += A.getNumeroAP() + " - ";
                }

                int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: " + "\n" + exibirApartamentos));
                    for (Apartamentos A : listaApartamentos) {
                        if (A.getNumeroAP() == escolha) {
                            int nmrAP = A.getNumeroAP();
                            Despesas despesasEspecificas = new Despesas();
                            despesasEspecificas.registrarDespesaAP(nmrAP);
                            listaDespesasEspecificas.add(despesasEspecificas);
                        }
                    }




        }
    }

    public static void listarAPs() {
        String exibirApartamentos = "";

        for (Apartamentos A : listaApartamentos) {
            exibirApartamentos += A.getNomeProprietario() + "\n" +
                    "BLOCO: " + A.getBloco() + "\n" +
                    "AP: " + A.getNumeroAP() + "\n" +
                    "METROS QUADRADOS: " + A.getMetrosQuadrados() + "\n" +
                    "DESPESAS FIXAS: $" + A.getMetrosQuadrados() * 5 + "\n\n";

        }
        JOptionPane.showMessageDialog(null, exibirApartamentos);
    }

    public static void listarDespesas() {
        String exibir = "";

        for (Apartamentos A : listaApartamentos) {
            exibir += A.getNumeroAP() + " - ";
        }

        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento para ver as despesas: " + "\n" + exibir));

        exibir = "";
        for (Despesas D : listaDespesasEspecificas) {
            if (D.getNmrAP() == op) {
                exibir += D.getNomeDespesa() + "\n" +
                        "ANO: " + D.getAnoDespesa() + "\n" +
                        "MÊS: " + D.getMesDespesa() + "\n" +
                        "VALOR: $" + D.getValorDespesa() + "\n\n";
                }

            }  if (exibir.isEmpty()){
            JOptionPane.showMessageDialog(null, "Apartamento não encontrado!");
            }  else {
            JOptionPane.showMessageDialog(null, exibir);
        }

    }

    public static void devidoPorMorador() {
        String exibir = "";
        int soma = 0;

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));

        for (Apartamentos A : listaApartamentos) {
            exibir +="\n" + A.getNomeProprietario() + " $";

            for (Despesas B : listaDespesasEspecificas) {
                if (B.getAnoDespesa() == ano && B.getMesDespesa() == mes) {
                    exibir += soma + B.getValorDespesa();
                }
            }
        }
        JOptionPane.showMessageDialog(null, exibir);
        }


    public static int menu() {
        String menu = "1. Registrar Condomínio\n" +
                "2. Registrar Despesa\n" +
                "3. Listar Apartamentos\n" +
                "4. Listar Despesas\n" +
                "5. Listar divida por ano e mes\n" +
                "6. Sair\n\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }




}
