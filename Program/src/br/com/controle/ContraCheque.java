/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author 356050
 */
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
        return "Contrato"
                + "\n Data:" + getData()
                + "\n Valor:" + getValor();
    }
    
}
