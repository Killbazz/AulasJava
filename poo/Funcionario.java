package poo;

public class Funcionario {
	
	private String funcionarioContratar;
    private String setorAtuacao;
    private int horasMensais;
    private String salario;
	new
    
    // método construtor

	public Funcionario(String funcionarioContratar, String setorAtuacao, int horasMensais, String salario) {
		this.funcionarioContratar = funcionarioContratar;
		this.setorAtuacao = setorAtuacao;
		this.horasMensais = horasMensais;
		this.salario = salario;
	}


	public String getFuncionarioContratar() {
		return funcionarioContratar;
	}


	public void setFuncionarioContratar(String funcionarioContratar) {
		this.funcionarioContratar = funcionarioContratar;
	}


	public String getSetorAtuacao() {
		return setorAtuacao;
	}


	public void setSetorAtuacao(String setorAtuacao) {
		this.setorAtuacao = setorAtuacao;
	}


	public int getHorasMensais() {
		return horasMensais;
	}


	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}
    
	public void imprimirInfo() {
	
		  System.out.println("\nNome: "+funcionarioContratar+" \nProfissão: " +setorAtuacao+" \nHoras trabahadas: "+horasMensais+  " \nhoras Salário: " +salario+"");
	}
    
}

}

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
