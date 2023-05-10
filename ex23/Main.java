package ex23;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = input.nextInt();

        if (valor > 80) {
            System.out.println("Maior que 80");
        } else if (valor < 25) { 
            System.out.println("Menor que 25");
        } else if (valor == 40) {
            System.out.println("Igual a 40");
        } else { 
            System.out.println("Valor fora do intervalo");
        } input.close();    }
}