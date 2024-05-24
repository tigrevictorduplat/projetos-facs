package atvRoteiro8.parte2;

public class Principal {
    public static void main(String[] args) {
        VeiculoCarga caminhao01 = new VeiculoCarga("ABC0202", 2016, 55.25);
        VeiculoPasseio fiatUno = new VeiculoPasseio("GFDS2423", 2020, 5);
        VeiculoPequeno motocicelta = new VeiculoPequeno("AGCD1587", 2022, "CG160");

        System.out.println(
        "| Relatório Veículo |"+
        "\n| Placa: "+ caminhao01.getPlaca()+     
        "\n| Ano: " + caminhao01.getAnoFabricacao()+
        "\n| Peso Max: " + caminhao01.getPesoMax()
        );
        System.out.println("Sua taxa é de: "+caminhao01.calculaTaxaPedagio()+"\n");
        System.out.println(
            "| Relatório Veículo |"+
            "\n| Placa: "+ fiatUno.getPlaca()+     
            "\n| Ano: " + fiatUno.getAnoFabricacao()+
            "\n| Máximo de Passageiros: " + fiatUno.getQteMaxdePassageiros()
            );
        System.out.println("Sua taxa é de: "+fiatUno.calculaTaxaPedagio()+"\n");
        System.out.println(
            "| Relatório Veículo |"+
            "\n| Placa: "+ motocicelta.getPlaca()+     
            "\n| Ano: " + motocicelta.getAnoFabricacao()+
            "\n| Modelo: " + motocicelta.getModelo()
            );
        System.out.println("Sua taxa é de: "+motocicelta.calculaTaxaPedagio()+"\n");


    }
}
