package LacosRepeticao;

import java.util.Scanner;

public class ex03_While {
	/*
	 * 	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
        int idade,maiores=0,menores=0;
        System.out.println("\nDigite uma idade: ");
        idade = ler.nextInt();

        while(idade>=1) {

            if(idade<=21) {
                menores++;
            }
            else if(idade>=50) {
                maiores++;
            }
            System.out.println("Digite uma idade: ");
            idade = ler.nextInt();
        }
        System.out.println("\nTotal de pessoas menores de 21 anos: "+menores);
        System.out.println("\nTotal de pessoas maiores de 50 anos: "+maiores);
        Do
	}
}
