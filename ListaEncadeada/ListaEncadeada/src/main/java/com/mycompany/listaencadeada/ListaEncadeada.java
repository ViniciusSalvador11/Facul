package com.mycompany.listaencadeada;

import java.util.LinkedList;


public class ListaEncadeada {
    
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    
    // cabeça global
    public static Node head;
    
    // Pega uma lista e um valor de dados, cria um novo link com o dado
    // dados e os empurra para a frente da lista.
    public static Node push(int data) {
        // aloca um novo nó em um heap e configura seus dados
        Node newNode = new Node();
        newNode.data = data;
        
        // define o próximo campo do novo nó para apontar para o atual
        // nó principal da lista.
        newNode.next = head;
        
        // muda a cabeça para apontar para o novo nó, então é
        // agora o primeiro nó na lista.
        
        return newNode;
    }
    
    // Função para implementação de lista encadeada do conjunto de chaves fornecido
    public static void constructList(int[] keys) {
        
        //começa do final do array
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }


    public static void main(String[] args) {
        // teclas de entrada
        int[] keys = { 7, 22, 34, 42 };
        System.out.println("O tamanho desta lista é de: " + keys.length);
        
        // aponta para o nó principal da lista encadeada
        constructList(keys);
        
        // imprime lista encadeada
        printList(head);
        // Lista encadeada Java
        System.out.println("Outra lista de Nomes com LinkedList");
        LinkedList<String> nome = new LinkedList<String>();   
        nome.add("Vinicius");
        System.out.println(nome.size());
        System.out.println(nome);
    }
}

