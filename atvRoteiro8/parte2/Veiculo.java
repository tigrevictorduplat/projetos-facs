package atvRoteiro8.parte2;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;
    protected double  taxaPedagio = 6.00F;

    //Construtor
    public Veiculo(String placa, int anoFabricacao){
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }
//Getters & Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double calculaTaxaPedagio(){
        return this.taxaPedagio;
    }

}
