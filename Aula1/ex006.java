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

//Nesse exemplo, o programa lê a idade do usuário em anos e calcula a idade equivalente em meses e dias, exibindo os resultados na tela.
//Lembre-se de fechar o Scanner após o uso para evitar vazamentos de recursos.
//Esse código é um exemplo simples de entrada de dados e operações aritméticas em Java.
//Diferença entre float e double
//O float é um tipo de dado que representa números de ponto flutuante com precisão simples
//(32 bits), enquanto o double representa números de ponto flutuante com precisão dupla (64 bits). O double é mais preciso e é geralmente preferido para cálculos que exigem maior precisão decimal.
//Em resumo, use float para economizar memória quando a precisão não for crítica e use double quando precisar de maior precisão decimal.
//Diferença entre print e println
//O print exibe o texto ou valor na mesma linha, enquanto o println exibe o texto ou valor e move o cursor para a próxima linha, permitindo que a próxima saída comece em uma nova linha.
//Use print quando quiser continuar na mesma linha e println quando quiser iniciar uma nova linha após a saída.
//Exemplo:
//System.out.print("Olá, ");
//System.out.print("mundo!");
//Saída: Olá, mundo!
//System.out.println("Olá, ");
//System.out.println("mundo!");
//Saída:
//Olá,
//mundo!

