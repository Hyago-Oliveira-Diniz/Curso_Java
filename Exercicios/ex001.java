package Exercicios;

import java.util.Scanner;

public class ex001 {

    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int X1, X2, Y1, Y2;
        int x,y;
   

       System.out.println("Digite os valores de X1, Y1, X2, Y2");
        X1 = teclado.nextInt();
        Y1 = teclado.nextInt();
        X2 = teclado.nextInt();
        Y2 = teclado.nextInt();

        System.out.println("Digite os valores de x e y");   
        x = teclado.nextInt();
        y = teclado.nextInt();  

        if (x >= X1 && x <= X2 && y >= Y2 && y <= Y1) {
            System.out.println("Atingido");
        }
        else {
            System.out.println("Não atingido");
        }

        teclado.close();
        
       

    }
    
}
