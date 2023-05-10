package ex20;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char desejaContinuar = 's';
        int carroMenor = 0;
        int totalCarros = 0;
            
            while(desejaContinuar == 'S' || desejaContinuar == 's') {
                
                System.out.print("Digite o valor do veiculo e o ano: ");

                int veiculo = input.nextInt();
                int ano = input.nextInt();
                int x = veiculo;
                double valorDesconto1 = x * 0.12;
                double valorDesconto2 = x * 0.07;
                double valorFinal1 = x - valorDesconto1;
                double valorFinal2 = x - valorDesconto2;

                if(ano <= 2000) {
                    System.out.printf("Desconto de: R$: " + "%.2f%n",valorDesconto1);
                    System.out.printf("Valor Final de R$: " + "%.2f%n", valorFinal1); 
                    System.out.println("Total de Carros: " + totalCarros);
                    System.out.println("Carros ate ano 2000: " + carroMenor);
                    totalCarros ++;
                    carroMenor ++;

                    System.out.println("Deseja continuar (S/N)?");
                    desejaContinuar = input.next().charAt(0);
                  
                } else if(ano > 2000) {
                    System.out.printf("Desconto de: R$: " + "%.2f%n",valorDesconto2);
                    System.out.printf("Valor Final de R$: " + "%.2f%n", valorFinal2);
                    System.out.println("Total de Carros: " + totalCarros);
                    System.out.println("Carros ate ano 2000: " + carroMenor);
                    totalCarros ++;

                    System.out.println("Deseja continuar (S/N)?");
                    desejaContinuar = input.next().charAt(0);
                }  input.close();
            }         
    }
}