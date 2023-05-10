package ex27;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            
            while(true) {
                
                System.out.print("Digite o valor do veiculo");

                int veiculo = input.nextInt();
                int x = veiculo;

                double descontoAlcool = x * 0.25;
                double descontoGasolina = x * 0.21;
                double descontoDiesel = x * 0.14;
                double valorAlcool = x - descontoAlcool;
                double valorGasolina = x - descontoGasolina;
                double valorDiesel = x - descontoDiesel;

                if(veiculo > 0) {
                    
                    System.out.println("Carro a alcool:");
                    System.out.printf("Desconto de: R$: " + "%.2f%n",descontoAlcool);
                    System.out.printf("Valor Final de R$: " + "%.2f%n",valorAlcool);

                    System.out.println("Carro a gasolina:");
                    System.out.printf("Desconto de: R$: " + "%.2f%n",descontoGasolina);
                    System.out.printf("Valor Final de R$: " + "%.2f%n",valorGasolina);

                    System.out.println("Carro a diesel:");
                    System.out.printf("Desconto de: R$: " + "%.2f%n",descontoDiesel);
                    System.out.printf("Valor Final de R$: " + "%.2f%n",valorDiesel);     
                } else {
                } break;
            }  input.close();          
    }
}