package ex9;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor:");
        double valor = input.nextDouble();
        double rendimento = valor * 0.0007; // No caso em questão, a taxa de juros é de 0,07% ao mês
        // o que equivale a 0,0007 na forma decimal.
        double saldoTotal = valor + rendimento;

        System.out.printf("Rendimento: " + "%.2f%n",rendimento);
        System.out.printf("Saldo total: " + "%.2f%n",saldoTotal);

        input.close();
    }
}
