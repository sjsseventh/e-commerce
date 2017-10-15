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
public class Verificar implements Login{

    @Override
    public void Login() {
        System.out.println("Validando os dados... Aguarde...");
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
        System.out.println("Dados validados... Aguarde...");
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
            Requisicao requisicao = new Requisicao();
            requisicao.Login();
    }    
}
