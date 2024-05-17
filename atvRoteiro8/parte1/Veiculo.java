package atvRoteiro8.parte1;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;

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

}
