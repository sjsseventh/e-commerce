/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import usuario.Cartao.Credito;
import usuario.Cartao.Debito;
import usuario.Cartao.MododePagar;
import usuario.produtos.Composto;
import usuario.produtos.Produto;
import usuario.produtos.Simples;

/**
 *
 * @author lugan
 */
public class Suub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        MododePagar credito = new Credito();
        MododePagar debito = new Debito();
        usuario.setNome("Fulano");
        usuario.setEmail("fulano@hotmail.com");
        usuario.setSenha("fulandociclano");
        usuario.dadosUsuario();
        System.out.println();
        
        usuario.verificar();
        System.out.println();
        
        Produto calça = new Simples("Calça Jeans Preston Black", 78d);
        Produto  blusa = new Simples("Moletom Adidas Originals Trefoi Preto", 164d);
        
        Produto Combo1 = new Composto(calça,blusa);
        usuario.addProduto(calça);
        usuario.addProduto(blusa);
        usuario.addProduto(Combo1);
        usuario.listaProdutos();
        System.out.println();
        
        usuario.pagarCarrinho();
        System.out.println();
        usuario.setMododePagar(debito);
        usuario.mododepagar();
        
        
        
        System.out.println();  
    }
    
}
