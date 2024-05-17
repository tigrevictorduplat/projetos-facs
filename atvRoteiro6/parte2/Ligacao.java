package atvRoteiro6.parte2;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
//Construtor
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
    }
// To String
    public String getRelatorio() {
        return "Ligação:"+
        "\n| Remetente: " + numOrigem +
        "\n| Origem: " + localOrigem +
        "\n| Destinatário: " + numDestino +
        "\n| Destino: " + localDestino +
        "\n| Hora de Ínicio: " + horaInicio +
        "\n| Hora de Fim: " + horaFim;
    }

//Getters e Setters
    public String getNumOrigem() {
        return numOrigem;
    }
    
    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }
    public String getNumDestino() {
        return numDestino;
    }
    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }
    public String getLocalOrigem() {
        return localOrigem;
    }
    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }
    public String getLocalDestino() {
        return localDestino;
    }
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }
    public String getHoraInicio() {
        return horaInicio.toString();
    }
    public void setHoraInicio(int hora, int minuto, int segundo) {
        this.horaInicio = new Tempo(hora, minuto, segundo);
    }
    public String getHoraFim() {
        return horaFim.toString();
    }
    public void setHoraFim(int hora, int minuto, int segundo) {
        this.horaFim = new Tempo(hora, minuto, segundo);
    }


}
