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
public abstract class Pagamento {
    public void pagarCarrinho(){
        confirmarCarrinho();
        dadosPagamento();
        confirmarPagamento();
    }
    
    public void confirmarCarrinho(){
        System.out.println("Confirmando os Produtos na cesta...");
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
    }
    
    public void dadosPagamento(){
        System.out.println("Inserindo dados do pagamento...");
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
    }
    
    protected abstract void confirmarPagamento();
}
