package ex2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores:");
        int a = input.nextInt();
        int b = input.nextInt();
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double)a / b;

        System.out.println("Soma : " + soma);
        System.out.println("Subtracao : " + subtracao);
        System.out.println("Multiplicacao : " + multiplicacao);
        System.out.printf("Divisao : " + "%.2f",divisao);

        input.close();
    }
}
