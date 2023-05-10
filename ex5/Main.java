package ex5;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do aluno(a):");
        String nome = input.nextLine();
        System.out.println("Digite as ultimas 3 (trez) notas:");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        double media = nota1 + nota2 + nota3 / 3;
        System.out.printf("Aluno(a) " + nome + " - Media: " + "%.1f%n",media);
        
        input.close();
    }
}
