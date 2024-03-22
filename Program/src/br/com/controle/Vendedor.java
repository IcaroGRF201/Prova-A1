
package br.com.controle;

public class Vendedor extends Pessoa {
    private double comissao;
    private ContraCheque contraCheque;

    public Vendedor(double comissao, ContraCheque contraCheque, String nome) {
        super(nome);
        this.comissao = comissao;
        this.contraCheque = contraCheque;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public ContraCheque getContraCheque() {
        return contraCheque;
    }

    public void setContraCheque(ContraCheque contraCheque) {
        this.contraCheque = contraCheque;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nComissão: R$" + String.format("%,.2f", comissao) +
               contraCheque.toString();
    }
}
