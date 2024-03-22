
package br.com.visao;

import br.com.controle.Cliente;
import br.com.controle.ContraCheque;
import br.com.controle.Loja;
import br.com.controle.Contrato;
import br.com.controle.Morador;
import br.com.controle.NotaFiscal;
import br.com.controle.Porteiro;
import br.com.controle.Produto;
import br.com.controle.Vendedor;
import br.com.controle.Visitante;

public class Program {
    public static void main(String[] args) {
        Loja loja1 = 
                new Loja(
                        123456,
                        "Riachuelo",
                        new Cliente(
                                "082.429.551-55",
                                "Kauã Otaviano Teixeira",
                                new NotaFiscal(
                                        987654,
                                        155.69,
                                        new Produto(
                                                159753,
                                                "Queijo",
                                                155.69
                                        )
                                )
                        ),
                        new Vendedor(
                                10.0,
                                "Rogério Cleiton",
                                new ContraCheque(
                                        "17/10/2016",
                                        15.69
                                )
                        ),
                        new Produto(
                                159753,
                                "Queijo",
                                155.69
                        ),
                        new Contrato(
                                357951,
                                "Um contrato muito foda",
                                1000.69
                        )
                );
    }
}
