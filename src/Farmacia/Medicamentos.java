package Farmacia;

public class Medicamentos extends Produtos{

    protected boolean precisaReceita;

    public Medicamentos() {
        super();
        precisaReceita = true;
    }



    public Medicamentos(String nome, int valor, int estoque, boolean precisaReceita) {
        super(nome, valor, estoque, precisaReceita);
        this.precisaReceita = precisaReceita;
    }















    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public void setPrecisaReceita(boolean precisaReceita) {
        this.precisaReceita = precisaReceita;
    }
}
