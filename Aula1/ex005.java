package Aula1;

import java.util.Scanner;

public class ex005 {

    public static void main(String args[]){
        int a;
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Digite um valor");
        a = teclado.nextInt();

        System.out.println("Valor digitado = " + a);
    }
}
