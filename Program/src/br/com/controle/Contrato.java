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
