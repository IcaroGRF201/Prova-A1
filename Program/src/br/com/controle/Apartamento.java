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
public class Apartamento {

    public int Numero;
    public int Torre;
    public Porteiro Porteiro;
    public Contrato Contrato;
    public Visitante Visitante;
    public Morador Morador;

    public Apartamento(int Numero, int Torre, Porteiro Porteiro, Contrato Contrato, Visitante Visitante, Morador Morador) {
        this.Numero = Numero;
        this.Torre = Torre;
        this.Porteiro = Porteiro;
        this.Contrato = Contrato;
        this.Visitante = Visitante;
        this.Morador = Morador;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getTorre() {
        return Torre;
    }

    public void setTorre(int Torre) {
        this.Torre = Torre;
    }

    public Porteiro getPorteiro() {
        return Porteiro;
    }

    public void setPorteiro(Porteiro Porteiro) {
        this.Porteiro = Porteiro;
    }

    public Contrato getContrato() {
        return Contrato;
    }

    public void setContrato(Contrato Contrato) {
        this.Contrato = Contrato;
    }

    public Visitante getVisitante() {
        return Visitante;
    }

    public void setVisitante(Visitante Visitante) {
        this.Visitante = Visitante;
    }

    public Morador getMorador() {
        return Morador;
    }

    public void setMorador(Morador Morador) {
        this.Morador = Morador;
    }

    @Override
    public String toString() {
        return "\n Apartamento"
                + "\n Numero:" + getNumero()
                + "\n Torre:" + getTorre()
                + "\n Porteiro" + getPorteiro()
                + "\n Contrato:" + getContrato()
                + "\n Visitante:" + getVisitante()
                + "\n Morador:" + getMorador();
    }
}
