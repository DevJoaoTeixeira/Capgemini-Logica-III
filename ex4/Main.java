package ex4;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite seu salario:");
        double salario = input.nextDouble();
        System.out.println("Digite seu total de vendas: ");
        double totalVendas = input.nextDouble();

        double comissao = (salario + totalVendas) * 0.15;
        double salarioTotal = salario + totalVendas + comissao;

        System.out.println("Sr(a) " + nome + " aqui está seu holerite:");
        System.out.printf("Salario fixo: R$ " + "%.2f%n",salario);
        System.out.printf("total Vendas: R$ " + "%.2f%n",totalVendas);
        System.out.printf("Comissao: R$ " + "%.2f%n",comissao);
        System.out.printf("Salario total: R$ " + "%.2f%n",salarioTotal);

        input.close();
    }
    
}
