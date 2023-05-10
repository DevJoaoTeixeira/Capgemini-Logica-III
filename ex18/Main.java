package ex18;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    for ( int i = 0; i < 75; i++) {
        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        }
        input.close();
    }
}
