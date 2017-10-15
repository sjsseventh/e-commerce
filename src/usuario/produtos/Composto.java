/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.produtos;

/**
 *
 * @author lugan
 */
public class Composto implements Produto{
    private Produto produto1;
    private Produto produto2;
    
    public Produto produto;
    
    public Composto(Produto produto1, Produto produto2){
        this.produto1 = produto1;
        this.produto2 = produto2;
    }
    
    public String getNome(){
        return produto1.getNome() + " + " + produto2.getNome();
    }
    public Double getPreco(){
        return produto1.getPreco() + produto2.getPreco();
    }
}
