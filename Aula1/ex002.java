package Aula1;


public class ex002{
    
    public static void main( String args[]){

        float x; // é necessario declarar uma variavel antes de usar 
        double y; // a varios modos de declarar uma variavel um 
        double z; // pode se usar exemplo:
        int idade;       // vai guardar inteiros
        double altura;   // vai guardar números decimais
        String nome;     // vai guardar textos

        x = 1;
        y = 2;
        z = x+y;
        idade = 21;
        altura = 1.75;
        nome = "Hyago";

       System.out.println("Valor de " +x);
       System.out.println(" Valor de y " +y);
       System.out.println("Valor da soma entre x + y = " +z);
       System.out.println("Meu nome é " + nome + " tenho " + altura + " metros de altura e tenho " + idade + " anos.");
    }
}