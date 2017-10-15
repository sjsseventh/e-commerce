/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;
import java.util.List;
import usuario.produtos.Produto;

/**
 *
 * @author lugan
 */
public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();
    
    
    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public void listaProdutos(){
        System.out.println("Os produtos que estão no carrinho são: ");
        for(Produto e:produtos){
            System.out.println("Descrição Produto: " + e.getNome() + " | Preço Produto: " + e.getPreco());
        }
    }
}
