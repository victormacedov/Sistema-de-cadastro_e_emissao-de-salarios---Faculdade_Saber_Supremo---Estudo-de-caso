package br.estudodecaso;

import java.util.Scanner;

public class Matricula extends Aluno{
    private int id;
    private int mesMatricula;
    private int anoMatricula;
    
    public Matricula() {
    }
    
    public void matricular(Aluno aluno){
        Scanner input = new Scanner(System.in);
        System.out.println("== Matrícula - Aluno ==");
        System.out.println("Digite o ID: ");
        id = input.nextInt();
        System.out.println("Digite o mês da matrícula: ");
        mesMatricula = input.nextInt();
        System.out.println("Digite o ano da matrícula: ");
        anoMatricula = input.nextInt();
        
        Matricula matricula = new Matricula();
        
        matricula.setId(id);
        matricula.setMesMatricula(mesMatricula);
        matricula.setAnoMatricula(anoMatricula);
        
        cadastroAlunos.add(matricula);
        
        for (int i = 0; i < cadastroAlunos.size(); i++) {
            System.out.println("O aluno " + aluno.getNome() + " foi matriculado!");
        System.out.println("ID: " + id
            + "\nMês da matrícula: " + mesMatricula
            + "\nAno da matrícula: " + anoMatricula);
        }
        
    }    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesMatricula() {
        return mesMatricula;
    }

    public void setMesMatricula(int mesMatricula) {
        this.mesMatricula = mesMatricula;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }
    
}
