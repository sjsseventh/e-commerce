/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.pagamento;

/**
 *
 * @author lugan
 */
public class PagamentoBoleto extends Pagamento{

    @Override
    public void confirmarPagamento() {
        System.out.println("O pagamento será feito por boleto.");
    }
}
