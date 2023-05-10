package ex12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double custo;
        double veiculo;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do veiculo: ");

        double impostoFabrica = 0.45;
        double distribuidor = 0.28;
        veiculo = input.nextDouble();
        custo = veiculo;
        custo += custo * impostoFabrica;
        total = custo;
        total += distribuidor * total;

        System.out.printf("O valor de custo do veiculo e: " + "%.2f%n",veiculo);
        System.out.printf("O valor total do veiculo é: " + "%.2f%n",total);    
        input.close();
    }
    
}
