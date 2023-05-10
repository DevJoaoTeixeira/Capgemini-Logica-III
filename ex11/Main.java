package ex11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preco de custo:");
        double custo = input.nextDouble();
        System.out.print("Digite a margem de lucro esperado:");
        double margem = input.nextDouble();
        //variavel quoeficiente criada para converter para decimal
        double quoeficiente = margem / 100;

        double lucro = custo  * quoeficiente;
        double precoVenda = custo + lucro;

        System.out.printf("O preço de venda é: " + "%.2f%n",precoVenda);
        System.out.printf("E o lucro é: " + "%.2f%n",lucro);

            input.close();
    }
}