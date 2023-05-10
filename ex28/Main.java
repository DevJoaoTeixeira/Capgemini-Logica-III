package ex28;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo, salarioAtual, novoSalario, aumento;
        String nomeFuncionario;
        int numFuncionarios = 584;
        double totalAumentoFolha = 0;

        for (int i = 1; i <= numFuncionarios; i++) {
            System.out.println("Funcionario " + i);
            System.out.print("Nome: ");
            nomeFuncionario = input.nextLine();
            System.out.print("Salario atual: ");
            salarioAtual = input.nextDouble();
            System.out.print("Salario mínimo: ");
            salarioMinimo = input.nextDouble();
            input.nextLine(); // limpar o buffer do teclado 

            if (salarioAtual < 3 * salarioMinimo) {
                aumento = 0.5 * salarioAtual;
            } else if (salarioAtual <= 10 * salarioMinimo) {
                aumento = 0.2 * salarioAtual;
            } else if (salarioAtual <= 20 * salarioMinimo) {
                aumento = 0.15 * salarioAtual;
            } else {
                aumento = 0.1 * salarioAtual;
            }

            novoSalario = salarioAtual + aumento;
            totalAumentoFolha = totalAumentoFolha + aumento;

            System.out.println(" Funcionario: " + nomeFuncionario);
            System.out.printf("Reajuste: %.2f\n", aumento);
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.println("--------------------------------");
        }
        
        System.out.printf("Total de aumento na folha: %.2f\n", totalAumentoFolha);

        input.close();
   }
}
