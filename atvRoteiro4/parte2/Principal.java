package atvRoteiro4.parte2;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(100, "Victor", "Ciência da Computação", 2024);
        Aluno aluno02 = new Aluno(101, "Rebeca","Direito", 2024);


        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
        
        System.out.println("*---*---*--*---*---*--*---*---*---*---*--*---*");
    
        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);

    }
   
}
