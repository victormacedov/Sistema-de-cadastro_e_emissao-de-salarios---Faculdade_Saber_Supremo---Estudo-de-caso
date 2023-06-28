package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class CoordenadorAdm extends Funcionario {
    private String area;
    private double plusSalario;

    public CoordenadorAdm(){

    }

    ArrayList<CoordenadorAdm> cadastroCoordenadoresAdm = new ArrayList<>();
    
    public void cadastrarCoordenadorAdm(){
        cadastrarFuncionario();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a área: ");
        area = input.next();

        CoordenadorAdm coordenadorAdm = new CoordenadorAdm();
        coordenadorAdm.setArea(area);
        cadastroCoordenadoresAdm.add(coordenadorAdm);
        }
    
    // Foram descontados todos os impostos (INSS, IRRF e Plano de saúde) direto nos valores.
    public void calcularPlusSalario(){
        double bonus = 0.135;
        for (int i = 0; i < cadastroFuncionario.size(); i++) {
            if(cadastroFuncionario.get(i).getNivel().equals("A")){
                plusSalario = 1278.23 + (1278.23 * bonus);
                System.out.println("Salário - Coordenador ADM - Nível A - Bonificação de 13,5%: R$"+ plusSalario);
            } else if(cadastroFuncionario.get(i).getNivel().equals("B")){
                plusSalario = 2040.49 + (2040.49 * bonus);
                System.out.println("Salário - Coordenador ADM - Nível B - Bonificação de 13,5%: R$"+ plusSalario);
            }else if(cadastroFuncionario.get(i).getNivel().equals("C")){
                plusSalario = 2556.05 + (2556.05 * bonus);
                System.out.println("Salário - Coordenador ADM - Nível C - Bonificação de 13,5%: R$"+ plusSalario);
            }else if(cadastroFuncionario.get(i).getNivel().equals("D")){
                plusSalario = 3000.23 + (3000.23 * bonus);
                System.out.println("Salário - Coordenador ADM - Nível D - Bonificação de 13,5%: R$"+ plusSalario);
            }else if(cadastroFuncionario.get(i).getNivel().equals("E")){
                plusSalario = 3913.27 + (3913.27 * bonus);
                System.out.println("Salário - Coordenador ADM - Nível E - Bonificação de 13,5%: R$"+ plusSalario);
            }
        }
    }
    
    public void exibirCoordenadorAdm(){
        System.out.println("------------------------------");
        System.out.println("== Coordenador - ADM ==");
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
                    + "\nNível: " + cadastroFuncionario.get(i).getNivel()
                    + "\nÁrea: " + cadastroCoordenadoresAdm.get(i).getArea());
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
