package ex3;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distancia e total gasto de combustivel");
        double distancia = input.nextDouble();
        double combustivel = input.nextDouble();

            double comsumoMedio = distancia  / combustivel;
          System.out.printf("O consumo médio foi de : " + "%2f",comsumoMedio);

          input.close();
    
    }
}
