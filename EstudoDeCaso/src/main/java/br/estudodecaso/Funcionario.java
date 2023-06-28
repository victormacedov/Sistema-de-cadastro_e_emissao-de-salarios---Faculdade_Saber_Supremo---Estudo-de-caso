package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private String setor;
    String cargo;
    String nivel;
    
    // Trocamos por String, por conta do que a questão pede em relação a funcionário (Nível: A, B, C, D, E)
    
    ArrayList<Funcionario> cadastroFuncionario = new ArrayList<>();
    
    public Funcionario(){
    
    }
    
    public void cadastrarFuncionario(){
        Scanner input = new Scanner(System.in);
        cadastrarPessoa();
        System.out.println("Digite a matrícula: ");
        matricula = input.nextInt();
        System.out.println("Digite o setor: ");
        setor = input.next();
        System.out.println("Digite o cargo: ");
        cargo = input.next();
        System.out.println("Níveis de Funcionario: A, B, C, D e E.");
        System.out.println("Níveis de Professor: 1, 2 e 3.");
        System.out.println("Digite o nível: ");
        nivel = input.next();
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setMatricula(matricula);
        funcionario.setSetor(setor);
        funcionario.setCargo(cargo);
        funcionario.setNivel(nivel);
        
        cadastroFuncionario.add(funcionario);
       
    }
    
    public void exibirFuncionario(){
        System.out.println("------------------------------");
        System.out.println("== Funcionário ==");
        for (int i = 0; i < cadastroFuncionario.size(); i++) {
            System.out.println("Nome: " + cadastroPessoas.get(i).getNome()
            + "\nRG: " + cadastroPessoas.get(i).getRg()
            + "\nCPF: " + cadastroPessoas.get(i).getCpf()
            + "\nData de nascimento: "
            + cadastroPessoas.get(i).getDiaNasc() + "/" + cadastroPessoas.get(i).getMesNasc() + "/" + cadastroPessoas.get(i).getAnoNasc()
            + "\nSexo: " + cadastroPessoas.get(i).getSexo()
            + "\nMatrícula: " + cadastroFuncionario.get(i).getMatricula()
            + "\nSetor: " + cadastroFuncionario.get(i).getSetor()
            + "\nCargo: " + cadastroFuncionario.get(i).getCargo()
            + "\nNível: " + cadastroFuncionario.get(i).getNivel());
        }
    }
    
    public void calcularSalario(){
        System.out.println("------------------------------");
        for (int i = 0; i < cadastroFuncionario.size(); i++) {
            if(cadastroFuncionario.get(i).getNivel().equals("A")){
                double salarioBruto = 1520.25;
                double inss = 117.02;
                double irrf = 0;
                double planoSaude = 125;
                double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                System.out.println("Salário Funcionário - Nível A: R$" + Math.round(salarioLiquido * 100.0)/100.0);
            } else if(cadastroFuncionario.get(i).getNivel().equals("B")){
                double salarioBruto = 2362.67;
                double inss = 192.84;
                double irrf = 4.34;
                double planoSaude = 125;
                double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                System.out.println("Salário Funcionário - Nível B: R$" +  Math.round(salarioLiquido * 100.0)/100.0);
            } else if(cadastroFuncionario.get(i).getNivel().equals("C")){
                double salarioBruto = 2988.92;
                double inss = 261.73;
                double irrf = 46.14;
                double planoSaude = 125;
                double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                System.out.println("Salário Funcionário - Nível C: R$" + Math.round(salarioLiquido * 100.0)/100.0);
            } else if(cadastroFuncionario.get(i).getNivel().equals("D")){
                double salarioBruto = 3572.77;
                double inss = 331.79;
                double irrf = 115.75;
                double planoSaude = 125;
                double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                System.out.println("Salário Funcionário - Nível D: R$" + Math.round(salarioLiquido * 100.0)/100.0);
            } else if(cadastroFuncionario.get(i).getNivel().equals("E")){
                double salarioBruto = 4878.67;
                double inss = 508.94;
                double irrf = 331.46;
                double planoSaude = 125;
                double salarioLiquido = salarioBruto - inss - irrf - planoSaude;
                System.out.println("Salário Funcionário - Nível E: R$" + Math.round(salarioLiquido * 100.0)/100.0);
            }
        }
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    
}
    
