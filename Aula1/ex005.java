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

        teclado.close();
    }
}
//Nesse exemplo, o programa lê um valor inteiro digitado pelo usuário e o exibe na tela.
//Lembre-se de fechar o Scanner após o uso para evitar vazamentos de recursos.      
//Esse código é um exemplo simples de entrada e saída de dados em Java.