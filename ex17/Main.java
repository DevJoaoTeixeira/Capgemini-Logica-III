package ex17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade = 0;
        
        for (int i = 0; i < 80; i++) {
            int num = input.nextInt();
            if (num >= 10 && num <= 150) {
                quantidade++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + quantidade);
        input.close();
    }
}
