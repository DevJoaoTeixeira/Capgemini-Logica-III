package ex19;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int homem = 0; 
        int mulher = 0;

    for (int i = 0; i < 3; i++) {
        System.out.println("Digite o nome e o sexo (M / F)");
        String nome = sc.next();
        char sexo = sc.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println(nome + " Homem");
            homem++;
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println(nome + " Mulher");
             mulher++;
        } 
         else {
            System.out.println("Sexo invalido");
        }    if ( i < 3 ) {
            System.out.println("Total de homens" + homem);
            System.out.println("Total de mulheres" + mulher);
        }
    }
        sc.close();
  }
}