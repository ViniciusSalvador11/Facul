
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//

/**
 *
 * @author 821150867
 */
public class CalculaMedia {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        float media = 0;
        int notaMaior=0,notaMenor=0;
        float[] vetorNotas = new float [10];
        
        for (int i = 0; i < vetorNotas.length; i++){
            System.out.println("Digite uma nota: ");
            vetorNotas[i] = sc.nextFloat();
            media+=vetorNotas[i];
        }
        
        media/= vetorNotas.length;
        
        
        
        for(int i=0; i<vetorNotas.length;i++) {
            if (vetorNotas[i] < media) {
                notaMenor++;
            }else if (vetorNotas[i] > media){
                notaMaior++;
            }
        }
        
        System.out.println("Media: "+media);
        System.out.println("A quantidade de valores acima da média é: " + notaMaior);
        System.out.println("A quantidade de valores abaixo da média é: " + notaMenor);
        
        System.out.println("Qual nota você quer buscar? ");
        float nota = sc.nextFloat();
        float n = buscaLinearNotas(vetorNotas, nota);
        
        if (n == -1){
            System.out.println("Nota não encontrado no vetor");
        }else {
            System.out.println("Achou na posiçao: "+n);
        }
        
        
    }
    
    
    public static int buscaLinearNotas(float[] vetor, float numeroProcurado){  
            for (int i = 0; i < vetor.length; i++)
                if (vetor[i] == numeroProcurado)
                    return i;

            return -1; //
        }
    
    
    
    
}
