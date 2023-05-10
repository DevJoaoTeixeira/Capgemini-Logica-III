package ex25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    int a;
    int b;
        a = input.nextInt();
        b = input.nextInt();
        
        if ( a == b) {
            System.out.println("Os numeros sao iguais");
        } else if ( a != b && a > b) {
            System.out.println("Os numeros sao diferentes");
            System.out.println(a + " e maior que " + b);
        } else if ( a != b && a < b) {
            System.out.println("Os numeros sao diferentes");
            System.out.println(b + " e maior que " + a);
        } input.close();
    }    
}
