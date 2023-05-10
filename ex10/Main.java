package ex10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = input.nextDouble();

        double duas = valor / 2;
        double tres = valor / 3;
        double quatro = valor / 4;
        double cinco = valor / 5;

        System.out.printf("Em duas prestacoes R$: %.2f%n", duas);
        System.out.printf("Em tres prestacoes R$: %.2f%n", tres);
        System.out.printf("Em quatro prestacoes R$: %.2f%n", quatro);
        System.out.printf("Em cinco prestacoes R$: %.2f%n", cinco);

            input.close();
    }
}