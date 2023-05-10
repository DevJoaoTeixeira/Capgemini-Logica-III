package ex6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        // Criei uma variavel chamada "aux" para armazenar temporariamente o valor de "a"
        //e efetuei a troca do valor de a recebe b, e "b" recebe a auxliar que tem valor de "a"
        int aux = a;
        a = b;
        b = aux;
        
        System.out.println("Valores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        input.close();
    }
}
