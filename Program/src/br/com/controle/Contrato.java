
package br.com.controle;

public class Contrato {

    public int Numero;
    public String Descricao;
    public double Valor;

    public Contrato(int Numero, String Descricao, double Valor) {
        this.Numero = Numero;
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return "Contrato"
                + "\n Numero:" + getNumero()
                + "\n Descrição:" + getDescricao()
                + "\n Valor:" + getValor();
    }
}
