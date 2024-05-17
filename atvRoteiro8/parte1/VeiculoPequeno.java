package atvRoteiro8.parte1;

public class VeiculoPequeno extends Veiculo{
    private String modelo; 
    //Contrutor
    public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
        super(placa, anoFabricacao);
        this.modelo = modelo;
    }
    //Getters & Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
