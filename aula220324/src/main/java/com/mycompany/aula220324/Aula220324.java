package com.mycompany.aula220324;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 821150867
 */
public class Aula220324 {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        System.out.println("Aluno: " + aluno.getNome() + " RA: " + aluno.getRa());
        
        Aluno aluno2 = new Aluno();
        System.out.println("Aluno2: " + aluno2.getNome() + " RA: " + aluno2.getRa());
        
        Curso curso = new Curso();
        System.out.println("Curso: " + curso.getNome());
        
        Aluno aluno3 = new Aluno("5454", "Juca da Silva", curso);
        System.out.println("Aluno3: " + aluno3.getRa() + "--"  + aluno3.getNome() + "--" + aluno3.getCurso().getNome());
        
        ArrayList<Aluno> l = new ArrayList<>();
        l.add(aluno);
        l.add(aluno2);
        l.add(aluno3);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nomeDigitado = sc.next();
        buscaLinear(l, nomeDigitado);
                
    }
    
    public static void buscaLinear(ArrayList<Aluno> alunos, String busca) {
        for (Aluno aluno: alunos) {
            if (aluno.getNome().equals(busca)) {
                System.out.println("Achou o aluno: " + aluno.getNome());
            }
            else {
                System.out.println("Não achou");
            }
        }
    }
    
}
