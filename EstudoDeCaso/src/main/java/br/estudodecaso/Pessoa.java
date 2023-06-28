package br.estudodecaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private int anoNasc;
    private int mesNasc;
    private int diaNasc;
    private String sexo;

    ArrayList <Pessoa> cadastroPessoas = new ArrayList<>();

    public Pessoa() {
        
    }
    
    public void cadastrarPessoa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = input.next();
        System.out.println("Digite o RG: ");
        rg = input.next();
        System.out.println("Digite o CPF: ");
        cpf = input.next();
        System.out.println("Digite o ano do nascimento: ");
        anoNasc = input.nextInt();
        System.out.println("Digite o mês do nascimento: ");
        mesNasc = input.nextInt();
        System.out.println("Digite o dia do nascimento: ");
        diaNasc = input.nextInt();
        System.out.println("Digite o sexo: ");
        sexo = input.next();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setRg(rg);
        pessoa.setCpf(cpf);
        pessoa.setAnoNasc(anoNasc);
        pessoa.setMesNasc(mesNasc);
        pessoa.setDiaNasc(diaNasc);
        pessoa.setSexo(sexo);
        
        cadastroPessoas.add(pessoa);
    }
    
    public void exibirPessoa(){
        for (int i = 0; i < cadastroPessoas.size(); i++) {
            System.out.println("Nome: " + cadastroPessoas.get(i).getNome()
            + "\nRG: " + cadastroPessoas.get(i).getRg()
            + "\nCPF: " + cadastroPessoas.get(i).getCpf()
            + "\nData de nascimento: "
            + cadastroPessoas.get(i).getDiaNasc() + "/" + cadastroPessoas.get(i).getMesNasc() + "/" + cadastroPessoas.get(i).getAnoNasc()
            + "\nSexo: " + cadastroPessoas.get(i).getSexo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
