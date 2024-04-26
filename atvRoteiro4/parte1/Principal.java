package atvRoteiro4.parte1;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        aluno01.matricula = 100;
        aluno01.nome = "Victor";
        aluno01.curso = "Ciência da Computação";
        aluno01.anoIngresso = 2024;

        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
        
        System.out.println("*---*---*--*---*---*--*---*---*---*---*--*---*");
        
        Aluno aluno02 = new Aluno();
        aluno02.matricula = 101;
        aluno02.nome = "Rebeca";
        aluno02.curso = "Direito";
        aluno02.anoIngresso = 2023;
    
        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);

    }
   
}
