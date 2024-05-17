package atvRoteiro6.parte2;

public class Principal {
   public static void main(String[] args) {
    Ligacao call01 = new Ligacao("071993946677", "07133320505", "Salvador", "Feira de Santana");
    call01.setHoraInicio(10, 30, 0);
    call01.setHoraFim(10,32,02);
    
    System.out.println(call01.getRelatorio());
    
   }
}
