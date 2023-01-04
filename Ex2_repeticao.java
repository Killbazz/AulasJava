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