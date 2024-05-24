package atvRoteiro8.parte2;

public class VeiculoPasseio extends Veiculo {
    private int qteMaxdePassageiros;
    //Construtor
    public VeiculoPasseio(String placa, int anoFabricacao, int qteMaxdePassageiros) {
            super(placa, anoFabricacao);
            this.qteMaxdePassageiros = qteMaxdePassageiros;
        }

    //Getters & Setters
    public int getQteMaxdePassageiros() {
        return qteMaxdePassageiros;
    }

    public void setQteMaxdePassageiros(int qteMaxdePassageiros) {
        this.qteMaxdePassageiros = qteMaxdePassageiros;
    }

    @Override
    public double calculaTaxaPedagio(){
        super.taxaPedagio = 5.00 * this.qteMaxdePassageiros;
        return super.taxaPedagio;
    }
    
}
