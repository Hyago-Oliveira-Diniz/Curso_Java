package Aula03;

import java.util.Scanner;

public class ex001 {

    public static void main( String args []){
       Scanner teclado = new Scanner (System.in);
       int valor;
       System.out.println("Digite um valor");
       valor = teclado.nextInt();
        if (valor >10) {
            System.out.println("O valor é maior que 10");
        } else{
            System.out.println("O valor é menor que 10");
         }
         teclado.close();
        }
    }

    //Nesse exemplo, o programa lê um valor inteiro do usuário e verifica se ele é maior ou menor que 10, exibindo a mensagem correspondente.
    //Lembre-se de fechar o Scanner após o uso para evitar vazamentos de recursos.
    //Esse código é um exemplo simples de uso de estruturas condicionais em Java.
    //Difereça entre if e else if
    //O if é usado para testar uma condição específica e executar um bloco de código se essa condição for verdadeira.
    //O else é usado para testar múltiplas condições em sequência, permitindo que você verifique várias possibilidades diferentes.
    //Se a primeira condição do if for falsa, o programa verifica a próxima condição do else if, e assim por diante.