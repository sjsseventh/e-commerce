/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.Login;

/**
 *
 * @author lugan
 */
public class Requisicao implements Login{
    
    protected Requisicao(){}
    
    @Override
    public void Login() {
        System.out.println("Enviando a Requisição ... Aguarde ...");
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
        System.out.println("Seja Bem Vindo !!");
    }
    
}
