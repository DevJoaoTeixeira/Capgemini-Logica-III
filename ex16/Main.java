package ex16;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o nome do aluno:");
        String nome = imput.nextLine();

        System.out.println("Digite as ultimas 3 notas:");
        double nota1 = imput.nextDouble();
        double nota2 = imput.nextDouble();
        double nota3 = imput.nextDouble();

        double media = nota1 + nota2 + nota3 / 3;

        if(media >= 7 ) {
            System.out.println("Aluno " + nome + " aprovado");
        } else if(media <= 5) {
            System.out.println("Aluno " + nome + " reprovado");
        } else if(media >= 5.1 && media <= 6.9) {
            System.out.println("Aluno " + nome + " em recuperacao");
        }
        imput.close();
    }
}
