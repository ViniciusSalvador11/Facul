package com.mycompany.projetopilha;

/**
 *
 * @author 821150867
 */
public class ProjetoPilha {

    public static void main(String[] args) {
        
        ArrayStack pilha = new ArrayStack(5);
        
        
        /*pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        
        System.out.println("pilha");
        
        pilha.push(6);
        
        pilha.pop();
        
        System.out.println(pilha);
        
        pilha.push(6);
        System.out.println(pilha);*/
        
        pilha.push(5);
        
        pilha.push(3);
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        pilha.push(7);
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        System.out.println(pilha.peek());
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        pilha.pop();
        System.out.println(pilha.isEmpty());
        
        pilha.push(9);
        pilha.push(7);
        pilha.push(3);
        pilha.push(5);
        
        System.out.println(pilha.size());
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        pilha.push(8);
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        System.out.println(pilha.peek());
        pilha.pop();
        
        System.out.println(pilha);
    }
}
