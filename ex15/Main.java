package ex15;
import java.util.Scanner; 
public class Main {
    
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = imput.nextInt();


        if (num >= 100 && num <= 200) {
            System.out.println(num + " O numero está no intervalo");
        } else {
            System.out.println(num + " O numero não está no intervalo");
        }
        imput.close();
    }
}
