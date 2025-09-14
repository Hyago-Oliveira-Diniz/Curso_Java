package Aula2;

import java.util.Scanner;

public class ex001 {

    public static void main( String args []){
        double salario, vendido, comissão, total;
        String nome;
        Scanner teclado = new Scanner(System.in);

        teclado= new Scanner(System.in);

        System.out.println("Diga qual é seu nome?");
        nome= teclado.nextLine();

        System.out.println("Diga qual seu salario?");
        salario= teclado.nextDouble();

        System.out.println("Quanto foi que você vendeu esse mês?");
        vendido= teclado.nextDouble();

        comissão= vendido * 0.15;
        total= comissão + salario;

        System.out.println("Olá"+ nome + "seu salario é de " + salario + " e sua comissão desse mês foi de " + comissão + " e o total foi de " + total );
        
    }
}
