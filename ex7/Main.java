package ex7;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura C°: ");
        double temperatura = input.nextDouble();

        double f = (9*temperatura + 160) / 5;
        System.out.println("A temperatura de " + temperatura + "ºC corresponde a " + f + "ºF");

        input.close();
     
    }
}
