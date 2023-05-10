import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores:");

        int a = input.nextInt();
        int b = input.nextInt();
        int resultado = a + b;
        System.out.println("O resultado da soma é : " + resultado);

        input.close();
    }
}
