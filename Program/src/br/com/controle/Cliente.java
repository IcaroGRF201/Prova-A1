
package br.com.controle;

public class Cliente extends Pessoa{
    private String cpf;
    private NotaFiscal notaFiscal;

    public Cliente(String cpf, NotaFiscal notaFiscal, String nome) {
        super(nome);
        this.cpf = cpf;
        this.notaFiscal = notaFiscal;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    @Override
    public String toString() {
        return "\n Cliente:" +
                super.toString() +
                "\nCPF: " + cpf + 
                notaFiscal.toString();
    }
}
