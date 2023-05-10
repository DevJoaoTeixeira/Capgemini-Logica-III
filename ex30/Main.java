
package ex30;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Digite trez valores inteiros:");

      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      int temp;

      if (a < b && a < c) {
          temp = a;
          a = b;
          b = temp;
      }
      if (b < a && b < c) {
          temp = b;
          b = a;
          a = temp;
      }
      if (c < a && c < b) {
          temp = c;
          c = a;
          a = temp;
      }
      
      System.out.println("Os numeros em ordem crescente são: ");
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      input.close();

    }  
}
        