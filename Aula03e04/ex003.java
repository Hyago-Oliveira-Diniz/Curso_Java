package Aula03e04;

import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        System.out.println("Digite o código do produto (1 a 5):");
        codigo = teclado.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = teclado.nextInt();

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                System.out.println("Código inválido!");
                total = 0.0;
                break;
        }

        System.out.println("O total a pagar é: R$" + total);

        teclado.close();
    }
}

//Nesse exemplo, o programa lê o código de um produto e a quantidade desejada, calcula o total a pagar com base no preço unitário do produto e exibe o resultado.
//Foi utilizado o comando switch para selecionar o preço do produto com base no código fornecido.
// O switch é uma estrutura de controle que permite selecionar entre múltiplas opções com base no valor de uma variável.
//Cada case representa uma opção diferente, e o bloco de código correspondente é executado quando o valor da variável corresponde ao case.
//O default é usado para tratar casos em que o valor da variável não corresponde a nenhum dos cases definidos.
//Lembre-se de fechar o Scanner após o uso para evitar vazamentos de recursos.  
//Esse código é um exemplo simples de uso do comando switch em Java.
//Diferença entre switch e if-else
//O switch é usado quando você tem uma variável que pode assumir múltiplos valores discretos e deseja executar diferentes blocos de código com base nesses valores.
//O if-else é mais flexível e pode ser usado para testar condições mais complexas, incluindo intervalos de valores e expressões booleanas.  
//O switch é geralmente mais eficiente e legível quando você está lidando com um número fixo de valores possíveis para uma variável.
//O if-else é mais adequado para condições que envolvem intervalos ou expressões booleanas complexas.
