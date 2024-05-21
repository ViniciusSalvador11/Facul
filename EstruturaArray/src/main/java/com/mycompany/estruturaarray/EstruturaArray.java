/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estruturaarray;

import java.io.IOException;

/**
 *Objetivo: Busca Linear
 * @author 821150867
 */
public class EstruturaArray {

    public static void main(String[] args){  //throws IOException{
        
        //int[] vetor = new int [] {1,3,4,7,8};
        
        int[] vetor = new int [10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*10);
            System.out.println(vetor[i]+"-");
        }
        
        for (int i = 0; i < vetor.length;i++) {
            System.out.println(vetor[i]+"-");
        }
        
        int n = buscaLinear(vetor, 8);
        
        if (n == -1){
            System.out.println("Número não encontrado vetor");
        }else
        System.out.println("Achou na posiçao: "+n);
    }//Fechou o metodo main
    
    public static int buscaLinear(int[] vetor, int numeroProcurado){
        
        int n= vetor.length; /* obtendo o tamanho do vetor*/
 
        for (int i = 0; i < n; i++)
            if (vetor[i] == numeroProcurado)
                return i;
 
        return -1; // não achou
        }
}
