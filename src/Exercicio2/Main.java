package Exercicio2;

/*
Enunciado:
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
além de informar a quantidade de vezes em que ela ocorre.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String StringdeA = ler.nextLine();

        getVerificador(StringdeA);

        ler.close();
    }

    private static void getVerificador(String stringdeA) {

        int numerosDeA = 0;

        for (char s : stringdeA.toCharArray()){
            if (s == 'a' || s == 'A'){
                numerosDeA++;
            }
        }

        if (numerosDeA == 0){
            System.out.println("Sua string não possui nenhum 'A' ");
        }else if (numerosDeA == 1) {
            System.out.println("Sua string teve a letra 'A' uma vez ");
        }else {
            System.out.printf("Sua string teve a letra 'A' %s vezes",numerosDeA);
        }
    }
}