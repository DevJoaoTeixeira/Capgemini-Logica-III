package ex24;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //uso do try ja que o exercicio pede loop infinito.
    try (Scanner input = new Scanner(System.in)) {
        while(true) {
            
        System.out.print("Entre com um valor: ");
        int valor;
        valor = input.nextInt();
        if(valor > 0) {
            System.out.println("O valor e positivo");
        } else if (valor == 0) {
            System.out.println("O valor e zero");
        } else {
            System.out.println("O valor e negativo");
        }
    }
    }
    }
}
