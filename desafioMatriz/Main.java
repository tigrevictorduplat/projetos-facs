package desafioMatriz;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        //Inicializando e Declarando Variáveis
        double m[][]= new double[12][12];
        Random numRandom = new Random();
        boolean inputStatus = false;
        int selectedRow = 0;
        String selectedOperation = "";
        
        //Adcionando Valores Aleatórios para M
        int iteratorRow = 0;
        for (double[] num : m) {
            for (int iteratorCol = 0; iteratorCol < num.length; iteratorCol++) {
                m[iteratorRow][iteratorCol] = Math.floor(numRandom.nextDouble() * 20);
            }
            iteratorRow++;
        }
        Scanner sc = new Scanner(System.in);
        
        while (!inputStatus) {
            // Input com Validação
            System.out.println("Selecione uma linha de 0 - 11");
            selectedRow = sc.nextInt();
            if (selectedRow>=0 && selectedRow <=11) {
                sc.nextLine();
                System.out.println("Selecione uma Operação | Soma (S) ou Média (M)");
                 selectedOperation = sc.nextLine();
                switch (selectedOperation) {
                    case "S":
                    case "s":
                        double soma = 0;
                        for (int iteratorCol = 0; iteratorCol < m.length; iteratorCol++) {
                        soma += m[selectedRow][iteratorCol];
                        System.out.println("Linha: "+selectedRow + " Coluna: "+iteratorCol +"\n> "+m[selectedRow][iteratorCol]); 
                        } 
                        System.out.println("A soma dos valores é:"+ soma);
                    //Saída do Loop 
                    inputStatus = true;
                        break;
                    case "M":
                    case "m":
                        double media = 0;
                        for (int iteratorCol = 0; iteratorCol < m.length; iteratorCol++) {
                                media += m[selectedRow][iteratorCol];
                                System.out.println("Linha: "+selectedRow + "Coluna: "+iteratorCol +"\n> "+m[selectedRow][iteratorCol]);
                        } 
                        media = media / m.length; 
                        System.out.println("A média dos valores é: "+ String.format("%.2f", media));
                    //Saída do Loop
                    inputStatus = true;
                    break;
                    default:
                    System.out.println("Operação Inválida!");
                        break;
                }
            } else {
                System.out.println("Linha Inválida!");
            }
        }

        sc.close();
    }
    
}