
package br.com.controle;

public class Visitante extends Pessoa {
    private String rg;
    private String endereco;

    public Visitante(String rg, String endereco, String nome) {
        super(nome);
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "\n --- Visitante --- " +
               super.toString() +
               "\nRG: " + rg +
               "\nEndereço: " + endereco;
    }
}
