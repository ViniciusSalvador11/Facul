/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetores;

import java.util.Scanner;

/**
 *
 * @author 821150867
 */
public class Vetores {
    public static void main(String[] args){
        //Definição de variaveis e objetos
        int [] vetor = new int[10];
        int media = 0;
        int cmaior=0,cmenor=0;
        Scanner valor = new Scanner(System.in);
        //Entrada de Dados
        for (int i=0; i<vetor.length;i++) {
            System.out.println("Digite o valor de v["+i+"]");
            vetor[i] = valor.nextInt();
            media+=vetor[i];
        }
        media/= vetor.length;
        for (int i=0; i<vetor.length;i++) {
            if (vetor[i] < media) {cmenor++;}
            else if (vetor[i] > media) {cmaior++;}
        }
        System.out.println("Media " + media);
        System.out.println("A quantidade de valores acima da média:" + cmaior);
        System.out.println("A quantidade de valores abaixo da média:" + cmenor);       
    }
    
}
