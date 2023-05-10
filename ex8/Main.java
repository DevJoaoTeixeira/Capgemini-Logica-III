package ex8;
import java.util.Scanner;
import java.util.Locale;
public class Main {
        
    public static void main(String[] args) {
      
        //Como nos usamos virgula para separar a casa decimal, decidi deixar 
        // com  ponto somente na leitura do dolar
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a quantia de U$:");
        double quantia = input.nextDouble();
        System.out.println("Digite o valor do dólar (US$):");
        double dolar = input.nextDouble();

        double br = quantia * dolar;
        System.out.printf("O valor convertido em reais é R$: " +  "%.2f%n",br);

            input.close();
    }
}