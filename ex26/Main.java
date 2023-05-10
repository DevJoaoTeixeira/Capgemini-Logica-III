package ex26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 5:");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Um");
        } else if (num == 2) {
            System.out.println("Dois");
        } else if (num == 3) {
            System.out.println("Trez");
        } else if (num == 4) {
            System.out.println("Quatro");
        } else if (num == 5) {
            System.out.println("Cinco");
        } else {
            System.out.println("Numeo invalido");
        } input.close();

    }
    
}
