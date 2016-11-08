public class PF extends Usuario{
	private String cpf;
	
	protected PF(String nome, Papel papel, String cpf) {
		super(nome, papel);
		this.cpf = cpf;
	}

	@Override
	public void informacao() {
		System.out.println(nome);
		System.out.println(papel);
		System.out.println(cpf);
	}
	
	public void rotinaPF(){
		System.out.println("Rotina de PF");
	}
	
}
