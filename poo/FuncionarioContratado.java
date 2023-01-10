package poo;

public class FuncionarioContratado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario contratado = new Funcionario ("Marlon Bassoto","Desenvolvedor Júnior",36,"3390");
		contratado.imprimirInfo();
		
		System.out.println("\nFuncionario Promovida");
		
		
		System.out.println("\nVaga da promoção");
		contratado.setSetorAtuacao("Desenvolvedor Full Stack Pleno");
		//contratado.imprimirInfo();
		System.out.println(contratado.getSetorAtuacao());
				
		System.out.println("\nAlteração Sálario ");
		System.out.println();
		contratado.setSalario("10.000");
		//contratado.imprimirInfo();
		System.out.println("Para:R$ "+contratado.getSalario());
		
		contratado.imprimirInfo();

		
		
		
		
	
		
		
		
	
		
		
		
		
		
		
		
	
		

	}

}
