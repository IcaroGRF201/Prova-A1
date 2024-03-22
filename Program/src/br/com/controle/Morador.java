
package br.com.controle;

public class Morador extends Pessoa{
    private String rg;

    public Morador(String rg, String nome) {
        super(nome);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Override
    public String toString() {
        return "\n --- Morador ---" + 
                super.toString() + 
               "\nRG: " + rg; 
    }
}
