package Aula1;


public class ex001{
    public static void main(String args[]){
      int a; // ocupa 32 bits (4 bytes)  - Valores de -2G a 2G 2 bilhões (-2.147.483.647 a 2.147.483.647)
      long b; // ocupa 64 bits (8 bytes) - Valores de -9P a 9P 9 quintilhões (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.808)
      short c; // ocupa 16 bits (2 bytes) - Valores de -32.768 a 32.767
      byte d; // ocupa 8 bits (1 byte) - Valores de -128 a127

      a = 100; 
      b = 1000;
      c = 10;
      d = 1;
      System.out.println("Valor de a " + a); // a utilização de + é para adicionar ao texto
      System.out.println("Valor de b " + b);
      System.out.println("Valor de c " + c);
      System.out.println("Valor de d " + d);
    }
    
}
//Nesse exemplo, o programa declara variáveis de diferentes tipos inteiros (int, long, short e byte) e atribui valores a elas. Em seguida, exibe os valores na tela usando System.out.println.
//Lembre-se de que o tipo int é usado para representar números inteiros que ocupam 32 bits, o tipo long é usado para números inteiros maiores que ocupam 64 bits, o tipo short é usado para números inteiros menores que ocupam 16 bits, e o tipo byte é usado para números inteiros muito pequenos que ocupam 8 bits.
//Esse código é um exemplo simples de declaração e uso de variáveis em Java.  