package LacosCondicionais;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			{
				int codigo;
				float valor_total,quantidade=0;
		
			System.out.println("\n\t\tMenu de Lanches");
			System.out.println("\n 1 - Dogão: R$10,00");
			System.out.println("\n 2 - X-salada: R$15,00");
			System.out.println("\n 3 - X-bacon: R$18,00");
			System.out.println("\n 4 - Bauru: R$12,00");
			System.out.println("\n 5 - Refrigerante: R$8,00");
			System.out.println("\n 6 - Suco de Laranja: R$13,00 ");
			System.out.println("\n\tDigite o código do produto: ");
			{
				codigo = leia.nextInt();
			}
			System.out.println("\n\t\tDigite a quantidade do produto: ");
			{
				codigo = leia.nextInt();
			}
			
			switch(codigo)
			{
			case 1: valor_total= (float) (quantidade * 10);
				System.out.println("\n Você comprou"+quantidade+"X-Salada e vai pagar:"+valor_total);
				break;
			case 2 : valor_total= quantidade * 15;
				System.out.println("\n Você comprou"+ quantidade+ "X-Salada e vai pagar:"+valor_total);
				break;
			case 3: valor_total= quantidade * 18;
				System.out.println("\n Você comprou"+ quantidade+ "X-Bacon e vai pagar:"+valor_total);
				break;
			case 4: valor_total= quantidade * 12;
				System.out.println("\n Você comprou"+ quantidade+ "Bauru e vai pagar:"+valor_total);
				break;
			case 5:valor_total= quantidade * 8;
				System.out.println("\n Você comprou"+ quantidade+ "Bauru e vai pagar:"+valor_total);
				break;
			case 6:valor_total= quantidade * 13;
				System.out.println("\n Você comprou"+ quantidade+ "Suco de Laranja e vai pagar:"+valor_total);
				break;
			default:
				System.out.println("\n Código Inválido!!!");
				
			}
			
			}
		}
		
		



		
		
	
	}

}
