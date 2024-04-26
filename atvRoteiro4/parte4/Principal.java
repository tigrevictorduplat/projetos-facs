package atvRoteiro4.parte4;

import java.util.Scanner;

public class Principal {
        
    public static void main(String[] args) {

        int cadMatricula;
        String cadNome;
        String cadCurso;
        String cadAnoIngresso;
        int cadQteMaterias;

        Aluno aluno01 = new Aluno(100, "Victor", "Ciência da Computação", "2024.1", 2);
        aluno01.setNome("Víctor Duplat Tigre");


        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de Matérias : "+aluno01.getQteMaterias() );
        System.out.println("Situação de Matrícula : "+aluno01.getSituacao());
        
        System.out.println("*---*---*--*---*---*--*---*---*---*---*--*---*");
        
        System.out.println(" -------- Cadastro Novo(a) Aluno(a) -------- ");
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Nome" );
        System.out.print("> ");
        cadNome = sc.nextLine();
        System.out.println("Curso");
        System.out.print("> ");
        cadCurso = sc.nextLine();
        System.out.println("Ano Ingresso");
        System.out.print("> ");
        cadAnoIngresso = sc.nextLine();
        System.out.println("Quantidade de Matérias");
        System.out.print("> ");
        cadQteMaterias = sc.nextInt();
        System.out.println("Matricula");
        System.out.print("> ");
        cadMatricula = sc.nextInt();     
        
        
        sc.close();

        Aluno aluno02 = new Aluno(cadMatricula, cadNome, cadCurso, cadAnoIngresso,cadQteMaterias);

        System.out.println("Cadastrado com Sucesso!");

        System.out.println("Matricula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano Ingresso : " + aluno02.getAnoIngresso());
        System.out.println("Quantidade de Matérias : "+aluno02.getQteMaterias() );
        System.out.println("Situação de Matrícula : "+aluno02.getSituacao());

    }
   
}
