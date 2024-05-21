
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 821150867
 */
public class CalculaMediaBinaria {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
            int media = 0;
            int notaMaior=0,notaMenor=0;
            float[] vetorNotas = new float [5];
    
            
    }  
    
    public static int buscaBinaria(float[] vetor, int x) {
        int pos = -1, posInicial = 0, posFinal = vetor.length - 1;
        while(posInicial <= posFinal) {
            pos = (posFinal + posInicial) / 2;
            if(vetor[pos] == x) return pos;
            else if(vetor[pos] > x) posFinal = pos - 1;
            else posInicial = pos + 1;
        };
        return -1;
}

}
