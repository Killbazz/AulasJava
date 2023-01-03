package LacosCondicionais;

import java.util.Scanner;

public class Ex01 {
	/*
     * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre
     * na tela uma mensagem indicando se este número é par ou ímpar e se o número é
     * positivo ou negativo. Veja os exemplos abaixo:
     * 
     * INPUT (ENTRADA) numero inteiro
     * 
     * PROCESSO PAR: NUMERO / 2 = %0 2/2 = 0 SE NAO IMPAR
     * 
     * POSITIVO NUMERO > 0 SE NAO NEGATIVO
     * 
     * OUTPUT (SAÍDA) NUMERO É IMPAR OU PAR POSITIVO OU NEGATIVO
     */
    public static void main(String[] args) {

        System.out.println("Digite um número");
        Scanner leia = new Scanner(System.in);

        int numero = leia.nextInt();

        if (numero == 0) {
            System.out.println("\n O numero:" + numero + " é par");
        } else if (numero > 0) {
            /*
             *  codições de positivo e par ou positivo e impar
             */
            if (numero % 2 == 0) {
                System.out.println("\n O numero:" + numero + " é positivo e par");
            } else {
                System.out.println("\n O numero:" + numero + " é positivo e impar");
            }
        } else {
            if (numero % 2 != 1) {
                System.out.println("\n O numero:" + numero + " é negativo e par");
            } else {
                System.out.println("\nO número: " + numero + " é negativo e ímpar");
            }

        }

    }
}