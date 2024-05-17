package atvRoteiro8.parte1;

public class VeiculoCarga extends Veiculo {
    private double pesoMax;

//Construtor
    public VeiculoCarga(String placa, int anoFabricacao, double pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
    }

//Getters & Setters
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

}