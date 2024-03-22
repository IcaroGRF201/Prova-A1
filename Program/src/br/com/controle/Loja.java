
package br.com.controle;

public class Loja {
    private int numero;
    private String nome;
    private Cliente cliente;
    private Vendedor vendedor;
    private Produto produto;
    private Contrato contrato;

    public Loja(int numero, String nome, Cliente cliente, Vendedor vendedor, Produto produto, Contrato contrato) {
        this.numero = numero;
        this.nome = nome;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.contrato = contrato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    @Override 
    public String toString() {
        return "\n === Loja === " + 
                "\n Número: " + numero + 
                "\n Nome: " + nome +
                cliente.toString() +
                vendedor.toString() +
                produto.toString() + 
                contrato.toString();
    }
}
