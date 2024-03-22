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
public class Produto {

    public int Codigo;
    public String Nome;
    public double Valor;

    public Produto(int Codigo, String Nome, double Valor) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Valor = Valor;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return "\n Produto"
                + "\n Código:" + getCodigo()
                + "\n Nome:" + getNome()
                + "\n Valor:" + getValor();

    }
}
