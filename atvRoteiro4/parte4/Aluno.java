package atvRoteiro4.parte4;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private String anoIngresso;
    private int qteMaterias;
    private String situacao;

    Aluno(int matricula, String nome, String curso, String anoIngresso, int qteMaterias){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.qteMaterias = qteMaterias;
       this.situacao =  (qteMaterias >=1)? "Matriculado" : "Não Matriculado" ; 
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public int getQteMaterias() {
        return qteMaterias;
    }
    public void setQteMaterias(int qteMaterias) {
        this.qteMaterias = qteMaterias;
    }
    public String getSituacao() {
        return situacao;
    }
    

}
