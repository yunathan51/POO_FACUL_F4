package atividade_medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Paciente {

    ArrayList<Paciente> condicoesSaude = new ArrayList<Paciente>();
    ArrayList<Paciente> sintomas = new ArrayList<Paciente>();

    private String nomePessoa;
    private String sintoma;
    private String condicoes;


    public void cadastraPessoa() {
        setNomePessoa(JOptionPane.showInputDialog("Informe o nome da pessoa"));
        JOptionPane.showMessageDialog(null, "Informe os sintomas ou a condição de saude da pessoa");
        String op = "";

        do {
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("1 - Sintoma\n2 - Condição de saúde\n3 - Sair"));

            switch (escolha) {
                case 1:
                    setSintoma(JOptionPane.showInputDialog("Informe o sintoma"));
                    sintomas.add(this);
                    break;
                case 2:
                    setCondicoes(JOptionPane.showInputDialog("Informe a condição de saúde"));
                    condicoesSaude.add(this);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

            op = JOptionPane.showInputDialog("Deseja cadastrar outro sintoma/condição? (S/N)");
        } while (op.equalsIgnoreCase("S"));


    }

    public String exibirPessoa() {
        return getNomePessoa() + "\n" + getSintoma() + "\n" + getCondicoes();
    }




















    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }



}
