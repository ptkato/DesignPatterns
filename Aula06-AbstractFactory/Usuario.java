public abstract class Usuario {
	protected String nome;
	protected Papel papel;
	
	protected Usuario(String nome, Papel papel){
		this.nome = nome;
		this.papel = papel;
	}
	
	public abstract void informacao();
	
}
