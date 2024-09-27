package Exercicio1;

/* Enunciado:
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */


import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número a ser calculado");
        int limite = ler.nextInt();

        if (getFibonnaci(limite).contains(limite))
            System.out.println("Seu número está presente na lista fibonnaci");
        else {
            System.out.println("Seu número não está presente na lista fibonnaci");
        }

        getFibonnaci(limite);

    }

    public static ArrayList<Integer> getFibonnaci(int limite) {
        ArrayList<Integer>lista = new ArrayList<>();

        int primeiro = 1;
        int segundo = 0;
        int soma = 0;

        while (soma<limite){
            soma = primeiro + segundo;
            lista.add(soma);
            if (soma >= limite)
                break;

            primeiro = segundo;
            segundo = soma;
        }

        return lista;
    }
}