package ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 40; i++) {

            System.out.println("Digite o preco de custo R$:");
            double precoCusto = input.nextDouble();
            System.out.println("Digite o preco de venda R$:");
            double precoVenda = input.nextDouble();
            double diferença = precoVenda - precoCusto;

            if(precoCusto == precoVenda) {
                System.out.println("Empate");
            }   else if(precoCusto < precoVenda) {
                    System.out.println("lucro de R$: " + diferença);
            }   else { 
                    System.out.println("prejuizo de R$: " + diferença);
            }
        }   input.close();
    }
}