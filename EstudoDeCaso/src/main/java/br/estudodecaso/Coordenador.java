package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordenador extends Professor {
    private String area;
    private double plusSalario;

    public Coordenador() {
        
    }
    
    ArrayList<Coordenador> cadastroCoordenadores = new ArrayList<>();

    public void cadastrarCoordenadorProf(){
        Scanner input = new Scanner(System.in);
        cadastrarProfessor();
        System.out.println("Digite a área: ");
        area = input.next();

        Coordenador coordenador = new Coordenador();
        coordenador.setArea(area);
        cadastroCoordenadores.add(coordenador);

    }
    
    // Foram descontados todos os impostos (INSS, IRRF e Plano de saúde) direto nos valores.
    public void calcularPlusSalario(){
        double bonus = 0.15;
        for (int i = 0; i < cadastroFuncionario.size(); i++) {
            if (cadastroFuncionario.get(i).getNivel().equals("1")) {
                plusSalario = 4938.92 + (4938.92 * bonus);
                System.out.println("Salário - Coordenador = Professor - Nível 1: R$"+ plusSalario);
            }else if(cadastroFuncionario.get(i).getNivel().equals("2")){
                plusSalario = 6077.12 + (6077.12 * bonus);
                System.out.println("Salário - Coordenador = Professor - Nível 2: R$"+ plusSalario);
            }else if(cadastroFuncionario.get(i).getNivel().equals("3")){
                plusSalario = 8722.58 + (8722.58 * bonus);
                System.out.println("Salário - Coordenador = Professor - Nível 3: R$"+ plusSalario);
            }
        }
    }


    public void exibirCoordenadorProf(){
        System.out.println("------------------------------");
        System.out.println("== Coordenador - Professor==");
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
            + "\nDisciplina: " + cadastroProfessores.get(i).getDisciplina()
            + "\nÁrea: " + cadastroCoordenadores.get(i).getArea());
        }
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPlusSalario() {
        return plusSalario;
    }

    public void setPlusSalario(double plusSalario) {
        this.plusSalario = plusSalario;
    }
    
    
}
