package atvRoteiro4.parte3;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(100, "Victor", "Ciência da Computação", 2024);
        Aluno aluno02 = new Aluno(101, "Rebeca","Direito", 2024);

        aluno01.setNome("Víctor Duplat Tigre");
        aluno02.setNome("Rebeca de Jesus dos Santos");
        aluno02.setAnoIngresso(2023);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        
        System.out.println("*---*---*--*---*---*--*---*---*---*---*--*---*");
    
        System.out.println("Matricula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano Ingresso : " + aluno02.getAnoIngresso());

    }
   
}
