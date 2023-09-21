package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {


    private static ArrayList<Medicamentoo> medicamentos = new ArrayList<Medicamentoo>();
    private static ArrayList<Paciente> sintomas = new ArrayList<Paciente>();

    public static void main(String[] args) {
        int op = 0;
        do {
            op = escolheMenu();
            switch (op) {
                case 1:
                    cadastraMed();
                    break;
                case 2:
                    cadastraPaciente();
                    break;
                case 3:
                    listarMed();
                    break;
                case 4:
                    listarPaciente();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (op != 0);
    }



    private static int escolheMenu() {
        String menu = "1 - CADASTRAR MEDICAMENTO\n" +
                "2 - CADASTRAR PACIENTE\n" +
                "3 - LISTAR MEDICAMENTOS\n" +
                "4 - LISTAR PACIENTES";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void cadastraMed() {
        Medicamentoo A = new Medicamentoo();
        A.cadRemedio();
        medicamentos.add(A);
    }

    private static void cadastraPaciente() {
        Paciente A = new Paciente();
        A.cadastraPessoa();
        sintomas.add(A);
    }

    private static void listarMed() {
        String lista = "";
        for (Medicamentoo medicamento : medicamentos) {
            lista += medicamento.exibirRemed() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    private static void listarPaciente() {
        String lista = "";
        for (Paciente paciente : sintomas) {
            lista += paciente.exibirPessoa() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }


}
