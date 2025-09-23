package Aula5;

import java.util.Scanner;

@SuppressWarnings("unused")
public class ex001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor,contador;
        System.out.print("Digite um valor: ");  
        valor = teclado.nextInt();
        System.out.println("Contando de até chegar no valor-----");
        contador = 1;
        while (contador <= valor) {
            System.out.println("Valor do contador = " + contador);
            contador++;

        }

    }
}

//  while verifica a condição antes de executar o bloco de código, se a condição for falsa, o bloco não é executado nenhuma vez.
