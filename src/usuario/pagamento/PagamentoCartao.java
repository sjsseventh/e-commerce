/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.pagamento;

import usuario.Cartao.MododePagar;


/**
 *
 * @author lugan
 */
public class PagamentoCartao extends Pagamento{
    
    @Override
    public void confirmarPagamento() {
        System.out.println("O pagamento será efetuado no cartão.");
        System.out.println();
        System.out.println("1 - Crédito |  2 - Débito");

    }
}
