package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso extends Professor {
    private String titulo;
    private String descricao;
    private double valor;
    public String sala;

    public Curso() {
    }
    
    ArrayList<Curso> cadastroCursos = new ArrayList<>();
    
    public void cadastrarCurso(){
        System.out.println("------------------------------");
        System.out.println("== Cadastro - Curso ==");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do curso/título: ");
        titulo = input.next();
        System.out.println("Digite a descrição: ");
        descricao = input.next();
        System.out.println("Os cursos custam R$ 865,23");
        System.out.println("Digite a sala: ");
        sala = input.next();
        
        Curso curso = new Curso();
        
        curso.setTitulo(titulo);
        curso.setDescricao(descricao);
        curso.setValor(865.23);
        curso.setSala(sala);
        
        cadastroCursos.add(curso);
    }
    
    public void exibirCurso(){
        System.out.println("------------------------------");
        System.out.println("== Curso ==");
        for (int i = 0; i < cadastroCursos.size(); i++) {
            System.out.println("Curso/Título: " + cadastroCursos.get(i).getTitulo()
            + "\nDescrição: " + cadastroCursos.get(i).getDescricao() + "\nValor: R$" + cadastroCursos.get(i).getValor() + "\nSala: " + cadastroCursos.get(i).getSala());
        }
    }
    
    public void calcularNumMinAluno(Professor professor){
        if(professor.getNivel().equals("1")){
            double alunosPagar1 = 6500 / 865.23;
            System.out.println("Serão necessários " + alunosPagar1 + " alunos para pagarem o salário (bruto) de um professor nível 1.");
        } else if(professor.getNivel().equals("2")){
            double alunosPagar2 = 8325.50 / 865.23;
            System.out.println("Serão necessários " + alunosPagar2 + " alunos para pagarem o salário (bruto) de um professor nível 2.");
        } else if(professor.getNivel().equals("3")){
            double alunosPagar3 = 12568.43 / 865.23;
            System.out.println("Serão necessários " + alunosPagar3 + " alunos para pagarem o salário (bruto) de um professor nível 3.");
        } 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public ArrayList<Curso> getCadastroCursos() {
        return cadastroCursos;
    }

    public void setCadastroCursos(ArrayList<Curso> cadastroCursos) {
        this.cadastroCursos = cadastroCursos;
    }

   
}
