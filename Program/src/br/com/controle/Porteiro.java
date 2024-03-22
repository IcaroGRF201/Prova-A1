
package br.com.controle;

public class Porteiro extends Pessoa{
    private String turno;
    private double salario;
    private ContraCheque contraCheque;

    public Porteiro(String turno, double salario, ContraCheque contraCheque, String nome) {
        super(nome);
        this.turno = turno;
        this.salario = salario;
        this.contraCheque = contraCheque;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContraCheque getContraCheque() {
        return contraCheque;
    }

    public void setContraCheque(ContraCheque contraCheque) {
        this.contraCheque = contraCheque;
    }
   
    @Override
    public String toString() {
        return "\n Porteiro: " +
                super.toString() + 
                "\nTurno: " + turno +
                "\nSalário: " + salario + 
                contraCheque.toString();
    }
}
