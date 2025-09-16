package Aula2;

public class ex002 {

    public static void main ( String arg []){

        int X;
        Double Y,T;

     X= 500;
     Y= 35.0;
     T = X/Y;

     System.out.printf("%.3f", T);

    }
}

//Nesse exemplo, o programa calcula o tempo necessário para percorrer uma distância de 500 km a uma velocidade média de 35 km/h e exibe o resultado com três casas decimais.
//A saída do programa será "14.286", que é o tempo em horas necessário para percorrer a distância especificada.
//Lembre-se de que o operador "/" em Java realiza a divisão, e o resultado é armazenado em uma variável do tipo Double para preservar a precisão decimal.
//O método System.out.printf é usado para formatar a saída, onde "%.3f" indica que queremos exibir um número de ponto flutuante com três casas decimais.
//Esse código é um exemplo simples de operações aritméticas e formatação de saída em Java.
//Diferença entre int e double
//O int é um tipo de dado que representa números inteiros, ou seja, números sem parte decimal. Ele é usado quando você precisa trabalhar com valores inteiros, como contagens, índices de arrays, etc.
//O double, por outro lado, é um tipo de dado que representa números de ponto flutuante, ou seja, números que podem ter uma parte decimal. Ele é usado quando você precisa trabalhar com valores que exigem precisão decimal, como medições, cálculos financeiros, etc.
//Em resumo, use int para números inteiros e double para números com casas decimais