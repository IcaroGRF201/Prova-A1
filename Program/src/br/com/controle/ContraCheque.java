
package br.com.controle;

public class ContraCheque {
    public String Data;
    public double Valor;

    public ContraCheque(String Data, double Valor) {
        this.Data = Data;
        this.Valor = Valor;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return "\nContra-Cheque"
                + "\n Data:" + getData()
                + "\n Valor:" + getValor();
    }
    
}
