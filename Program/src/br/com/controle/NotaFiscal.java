
package br.com.controle;

public class NotaFiscal {
    private int numero;
    private double valor;
    private Produto produto;

    public NotaFiscal(int numero, double valor, Produto produto) {
        this.numero = numero;
        this.valor = valor;
        this.produto = produto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public String toString() {
        return "\nNota Fiscal" +
                "\n Número: " + numero +
                "\n Valor: R$" + String.format("%,.2f", valor) + 
                produto.toString();
    }
}
