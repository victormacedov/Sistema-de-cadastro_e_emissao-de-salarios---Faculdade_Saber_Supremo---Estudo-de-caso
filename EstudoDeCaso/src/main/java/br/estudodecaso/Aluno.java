package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private int codigo;
    private String interesse;
    private double desconto;

    ArrayList<Aluno> cadastroAlunos = new ArrayList<>();

    public Aluno() {
        
    }

    public void cadastrarAluno(){
        System.out.println("------------------------------");
        System.out.println("== Cadastro -> Aluno ==");
        cadastrarPessoa();
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite o código do aluno: ");
        codigo = input.nextInt();
        System.out.println("Qual o interesse? ");
        interesse = input.next();
        System.out.println("Digite o desconto: ");
        desconto = input.nextDouble();
        
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);
        aluno.setInteresse(interesse);
        aluno.setDesconto(desconto);
        
        cadastroAlunos.add(aluno);
    }
    
    public void exibirAluno(){
        System.out.println("------------------------------");
        System.out.println("== Aluno ==");
        for (int i = 0; i < cadastroAlunos.size(); i++) {
            System.out.println("Nome: " + cadastroPessoas.get(i).getNome()
            + "\nRG: " + cadastroPessoas.get(i).getRg()
            + "\nCPF: " + cadastroPessoas.get(i).getCpf()
            + "\nData de nascimento: "
            + cadastroPessoas.get(i).getDiaNasc() + "/" + cadastroPessoas.get(i).getMesNasc() + "/" + cadastroPessoas.get(i).getAnoNasc()
            + "\nSexo: " + cadastroPessoas.get(i).getSexo()
            + "\nCódigo: " + cadastroAlunos.get(i).getCodigo()
            + "\nInteresse: " + cadastroAlunos.get(i).getInteresse()
            + "\nDesconto: " + cadastroAlunos.get(i).getDesconto());
        }
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ArrayList<Aluno> getCadastroAlunos() {
        return cadastroAlunos;
    }

    public void setCadastroAlunos(ArrayList<Aluno> cadastroAlunos) {
        this.cadastroAlunos = cadastroAlunos;
    }
}