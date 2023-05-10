package ex14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Digite dois valores");
        int a = imput.nextInt();
        int b = imput.nextInt();

        if(a > b) {
            System.out.println(a + " é maior que " + b);
            
        } else {
            System.out.println(b + " é maior que " + a);
        }
        
        imput.close();
    }
    
}
