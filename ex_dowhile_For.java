package LacosRepeticao;

import java.util.Scanner;

public class ex05_dowhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        int numero,positivo=0,soma=0;
        System.out.println("\nDigite um número: ");
        numero = ler.nextInt();
        do
        {
            if(numero>=1) {
                soma = numero + soma;
                positivo++;
            }
            System.out.println("Digite um número: ");
            numero = ler.nextInt();
        }while(numero!=0);
        System.out.println("A soma dos números positivos é: "+soma);
        

	}

}

package LacosRepeticao;

import java.util.Scanner;

public class Ex2_repeticao {
	
	  public static void main(String[] args) {
	        // Ler se o numero é impar ou par

		  Scanner ler = new Scanner(System.in);
	        int somaPar=0, somaImpar=0, x, num;

	        for(x=1;x<=10;x++) {
	            System.out.println("Escreva o número: ");
	            num = ler.nextInt();
	            if(num % 2 == 0) {
	                somaPar++;
	            }
	            else {
	                somaImpar++;
	            }
	        }
	        System.out.println("\nTotal de números pares: "+somaPar);
	        System.out.println("\nTotal de números ímpares: "+somaImpar);
	  }
}
