package atvRoteiro6.parte2;

public class Tempo {
    private int hora, minuto, segundo;
//Construtor
    public Tempo (int hora, int minuto, int segundo){
        this.hora= hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
//Getters e Setters
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
//toString
    @Override
    public String toString() {
        return  hora + ":" + minuto + ":" + segundo;
    }


}
