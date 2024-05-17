package atvRoteiro6.parte1;

public class Principal {
   public static void main(String[] args) {
    Ligacao call01 = new Ligacao("071993946677", "07133320505", "Salvador", "Feira de Santana", "10:00:32");
    call01.setHoraFim("10:32:02");
    System.out.println(call01.getRelatorio());
    // String  testeOperacao = call01.getHoraFim() - call01.getHoraInicio() ;
    // Error: The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
   }
}
