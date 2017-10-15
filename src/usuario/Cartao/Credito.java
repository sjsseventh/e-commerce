/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.Cartao;

/**
 *
 * @author lugan
 */
public class Credito implements MododePagar{

    @Override
    public void modoDePagar() {
        System.out.println("Pagamento no cartão efetuado no Crédito.");    
    }
    
}
