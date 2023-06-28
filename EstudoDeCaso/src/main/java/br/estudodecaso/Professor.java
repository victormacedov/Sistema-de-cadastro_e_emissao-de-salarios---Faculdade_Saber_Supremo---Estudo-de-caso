package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Funcionario {
    private String formacao;
    private String disciplina;
    
    public Professor(){
    
    }
    
    ArrayList<Professor> cadastroProfessores = new ArrayList<>();
    
    public void cadastrarProfessor(){
        Scanner input = new Scanner(System.in);
        cadastrarFuncionario();
        System.out.println("Digite a formação: ");
        formacao = input.next();
        System.out.println("Digite a disciplina: ");
        disciplina = input.next();
        
        Professor professor = new Professor();
        
        professor.setFormacao(formacao);
        professor.setDisciplina(disciplina);
        
        cadastroProfessores.add(professor);
    }
    
    public void exibirProfessor(){
        System.out.println("------------------------------");
        System.out.println("== Professor ==");
        for (int i = 0; i < cadastroProfessores.size(); i++) {
            System.out.println("Nome: " + cadastroPessoas.get(i).getNome()
            + "\nRG: " + cadastroPessoas.get(i).getRg()
            + "\nCPF: " + cadastroPessoas.get(i).getCpf()
            + "\nData de nascimento: "
            + cadastroPessoas.get(i).getDiaNasc() + "/" + cadastroPessoas.get(i).getMesNasc() + "/" + cadastroPessoas.get(i).getAnoNasc()
            + "\nSexo: " + cadastroPessoas.get(i).getSexo()
            + "\nMatrícula: " + cadastroFuncionario.get(i).getMatricula()
            + "\nSetor: " + cadastroFuncionario.get(i).getSetor()
            + "\nCargo: " + cadastroFuncionario.get(i).getCargo()
            + "\nNível: " + cadastroFuncionario.get(i).getNivel()
            + "\nFormação: " + cadastroProfessores.get(i).getFormacao()
            + "\nDisciplina: " + cadastroProfessores.get(i).getDisciplina());
        }
    }
    
    public void calcularSalario(){
        for (int i = 0; i < cadastroFuncionario.size(); i++) {
            switch (cadastroFuncionario.get(i).getNivel()) {
                case "1" ->                     {
                        double salarioBruto = 6500;
                        double inss = 735.92;
                        double irrf = 700.16;
                        double planoSaude = 125;
                        double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                        System.out.println("Salário - Professor - Nível 1: R$" + salarioLiquido);
                    }
                case "2" ->                     {
                        double salarioBruto = 8325.50;
                        double inss = 991.49;
                        double irrf = 1131.89;
                        double planoSaude = 125;
                        double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                        System.out.println("Salário - Professor - Nível 2: R$" + salarioLiquido);
                    }
                case "3" ->                     {
                        double salarioBruto = 12568.43;
                        double inss = 1585.50;
                        double irrf = 2135.35;
                        double planoSaude = 125;
                        double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                        System.out.println("Salário - Professor - Nível 3: R$" + salarioLiquido);
                    }
                default -> {
                }
            }
        }
    }
    

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
