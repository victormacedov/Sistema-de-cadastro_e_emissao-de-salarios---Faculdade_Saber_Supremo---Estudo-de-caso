package br.estudodecaso;

public class Main {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.cadastrarAluno();
        a1.exibirAluno();
  
        
        Funcionario f1 = new Funcionario();
        System.out.println("------------------------------");
        System.out.println("== Cadastro -> Funcionário ==");
        f1.cadastrarFuncionario();
        f1.exibirFuncionario();
        f1.calcularSalario();
        
       
        Professor p1 = new Professor();
        System.out.println("------------------------------");
        System.out.println("== Cadastro -> Professor ==");
        p1.cadastrarProfessor();
        p1.exibirProfessor();
        p1.calcularSalario();
        

        Coordenador c1 = new Coordenador();
        System.out.println("------------------------------");
        System.out.println("== Cadastro -> Coordenador - Professor==");
        c1.cadastrarCoordenadorProf();
        c1.exibirCoordenadorProf();
        c1.calcularSalario();
        c1.calcularPlusSalario();

        
        CoordenadorAdm c2 = new CoordenadorAdm();
        System.out.println("------------------------------");
        System.out.println("== Cadastro -> Coordenador - ADM ==");
        c2.cadastrarCoordenadorAdm();
        c2.exibirCoordenadorAdm();
        c2.calcularSalario();
        c2.calcularPlusSalario();
        
        
        Matricula matricula = new Matricula();
        matricula.matricular(a1);
        
        
        Curso curso = new Curso();
        curso.cadastrarCurso();
        curso.exibirCurso();
        curso.calcularNumMinAluno(p1);

    }
    
}
