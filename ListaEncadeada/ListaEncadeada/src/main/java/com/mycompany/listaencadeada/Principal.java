/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;


public class Principal {
    public static void main(String[] args){
        
        Lista lista = new Lista();
        
        Principal principal = new Principal();
        
        principal.adicionarPessoa(lista);
        
        while(lista.temProximo()){
            System.out.println("Nome: " + lista.getPosicaoAtual().getValor().getNome() + 
                    " Email: " + lista.getPosicaoAtual().getValor().getEmail() +
                    " ID: " + lista.getPosicaoAtual().getValor().getId());
            
        }
        principal.removerPessoa(lista);
        System.out.println("Removeu o último");
        
        while(lista.temProximo()){
            System.out.println(lista.getPosicaoAtual().getValor().getNome());
        }
        
    }
    
    private void adicionarPessoa(Lista lista){
        Pessoa p1 = new Pessoa(1, "João", "jp@email.com");
        Pessoa p2 = new Pessoa(2, "Maria", "maria@gmail.com");
        Pessoa p3 = new Pessoa(3, "Vinicius", "vini@email.com");
        
        lista.adicionar(p1);
        lista.adicionar(p2);
        lista.adicionar(p3);
    }
    
    private void removerPessoa(Lista lista){
        lista.remover();
    }
    
}
