/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import usuario.Cartao.MododePagar;
import usuario.Login.*;
import usuario.pagamento.Pagamento;
import usuario.pagamento.PagamentoCartao;
import usuario.produtos.*;

/**
 *
 * @author lugan
 */
public class Usuario{
    private String nome;
    private String email;
    private String senha;
    private Login verificar;
    private Carrinho carrinho;
    private Pagamento pagamento;
    private MododePagar mododepagar;

    public Usuario(){
        verificar = new Verificar();
        carrinho = new Carrinho();
        pagamento = new PagamentoCartao();
    }
    
    public void pagarCarrinho(){
        this.pagamento.pagarCarrinho();
    }
    
    
    public void mododepagar(){
        mododepagar.modoDePagar();
    }
    
    public void setMododePagar(MododePagar novoModo){
        mododepagar = novoModo;
    }
    
    public void addProduto(Produto produto){
        this.carrinho.addProduto(produto);
    }
    
    public void listaProdutos(){
        this.carrinho.listaProdutos();
    }
    
    public void verificar(){
        this.verificar.Login();
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void dadosUsuario(){
        System.out.println("Nome: " + getNome() + " | Email: " + getEmail() + " | Senha: " + getSenha());
    }
}