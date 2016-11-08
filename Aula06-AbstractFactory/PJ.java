public class PJ extends Usuario{
    private String cnpj;
	
	protected PJ(String nome, Papel papel, String cnpj) {
		super(nome, papel);
		this.cnpj = cnpj;
	}

	@Override
	public void informacao() {
		System.out.println(nome);
		System.out.println(papel);
		System.out.println(cnpj);
	}
	
	public void rotinaPJ(){
		System.out.println("Rotina de PJ");
	}
	
}
