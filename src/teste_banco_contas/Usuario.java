package teste_banco_contas;


import javax.swing.*;

public class Usuario {

    private String nomeUser;
    private String sexoUser;
    private int idadeUser;
    private Double saldoConta;
    private int nmrConta;

    public void cadastrar() {
        setNomeUser(JOptionPane.showInputDialog("INFORME SEU NOME:").toUpperCase());
        setIdadeUser(Integer.parseInt(JOptionPane.showInputDialog("INFORME SUA IDADE:")));
        setSexoUser(JOptionPane.showInputDialog("INFORME SEU SEXO:"));
        setNmrConta(Integer.parseInt(JOptionPane.showInputDialog("INFORME O NUMERO DA CONTA A SER CRIADA")));
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getSexoUser() {
        return sexoUser;
    }

    public void setSexoUser(String sexoUser) {
        this.sexoUser = sexoUser;
    }

    public int getIdadeUser() {
        return idadeUser;
    }

    public void setIdadeUser(int idadeUser) {
        this.idadeUser = idadeUser;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getNmrConta() {
        return nmrConta;
    }

    public void setNmrConta(int nmrConta) {
        this.nmrConta = nmrConta;
    }


}
