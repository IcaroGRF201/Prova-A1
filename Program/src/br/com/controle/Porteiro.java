
package br.com.controle;

public class Porteiro extends Pessoa{
    private String turno;
    private double salario;

    public Porteiro(String turno, double salario, String nome) {
        super(nome);
        this.turno = turno;
        this.salario = salario;
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
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nTurno: " + turno +
               "\nSalário: " + salario;
    }
}
