public class Teste {

	public static void main(String[] args) {
		Usuario u = FabricaUsuario.FABRICA_ADMIN.criarPF();
		u.informacao();
	}

}
