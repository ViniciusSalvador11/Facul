package com.mycompany.aula220324;

/**
 *
 * @author 821150867
 */
public class Aluno {
    private String ra;
    private String nome;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Aluno() {
        this.ra = "123";
        this.nome = "Vinicius Salvador";
    }
    
    public Aluno(String ra, String nome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
