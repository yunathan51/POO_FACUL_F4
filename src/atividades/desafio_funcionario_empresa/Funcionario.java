package atividades.desafio_funcionario_empresa;

import javax.swing.*;

public class Funcionario {

    private int totalFuncionarios =0;
    private int idadeFuncionario =0;
    private int idadeMinima = 18;
    private String nomeFuncionario ="";

    public void cadastro() {
        setNomeFuncionario(JOptionPane.showInputDialog("Informe o nome do funcionario:"));
        setIdadeFuncionario(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do funcionario:")));
        if (idadeMinima <= getIdadeFuncionario()) {
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NÃO APTO A TRABALHO DEVIDO IDADE!");
        }
        incremento();
    }
    public void incremento() {
        totalFuncionarios++;
    }




    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }
}
