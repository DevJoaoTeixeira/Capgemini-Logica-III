package ex21;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        int aptos = 0, naoAptos = 0;
        
        System.out.print("Quantas pessoas deseja cadastrar? ");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa #" + (i+1));
            System.out.print("Nome: ");
            input.nextLine(); // Consumir o buffer do teclado
            String nome = input.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = input.next().charAt(0);
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Saúde (A/I): ");
            char saude = input.next().charAt(0);
            
            if (sexo == 'M' && idade >= 18 && saude == 'A') {
                aptos++;
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
            } else {
                naoAptos++;
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
            }
        }
        
        System.out.println("Total de pessoas aptas: " + aptos);
        System.out.println("Total de pessoas não aptas: " + naoAptos);
        
        input.close();
    }
}