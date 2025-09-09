package Aula1;

import java.util.Scanner; 

public class ex006 {
    public static void main(String args []){
        int anos;
        float meses;
        double dias;
        Scanner teclado = new Scanner(System.in);

        teclado = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem: ");
        anos = teclado.nextInt();

        meses= anos * 12;
        dias= anos * 365;

        System.out.print("De acordo com a sua idade você tem " + meses + " mesês de idade considerando 12 meses idependente da sua data exata de nascimento");
        System.out.println("Dito a quantidade de meses você teria " + dias + " dias de idade considerando 365 dias ano");
    }
    
}
