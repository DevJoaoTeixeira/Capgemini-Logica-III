package ex13;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = input.nextInt();

        if(num == 10) {
            System.out.println("O numero é 10");
            
        } else if (num < 10) {
            System.out.println("O numero é menor que 10");
            
        }   else {
            System.out.println("O numero é maior que 10");
        }
         input.close();
    }
}
        
          
    
