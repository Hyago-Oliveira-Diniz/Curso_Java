package Aula5;

import java.util.Scanner;               

public class ex002 {
    
    public static void main(String [] arg){

        Scanner teclado = new Scanner (System.in);
        int valor,contador;
        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println("Contando de 10 até chegar no valor-----");
        contador = 10;
        do{
            System.out.println("Valor do contador = " + contador);
            contador++;
        }
        while (contador <= valor);
    }
}

//  do while executa o bloco de código pelo menos uma vez, mesmo que a condição seja falsa.
