
package br.com.controle;

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
        return "\n=== Apartamento ==="
                + "\n Numero:" + getNumero()
                + "\n Torre:" + getTorre()
                + getPorteiro()
                + getContrato()
                + getVisitante()
                + getMorador();
    }
}
