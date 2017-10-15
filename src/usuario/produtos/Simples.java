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
public class Simples implements Produto{
    public String nome;
    public Double preco;
      
    public Simples(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    public Double getPreco(){
        return this.preco;
    }
}
