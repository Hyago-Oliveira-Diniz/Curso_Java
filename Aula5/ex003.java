package Aula5;

import java.util.Scanner; 

public class ex003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, contador;
        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println("Contando de 10 até chegar no valor-----");
        for (contador = 10; contador <= valor; contador++) {
            System.out.println("Valor do contador = " + contador); 
        
        }
    }
}

//  for é usado quando sabemos o número exato de iterações que queremos executar, é ideal para loops com um número fixo de repetições.