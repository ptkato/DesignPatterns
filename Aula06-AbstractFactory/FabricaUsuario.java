public enum FabricaUsuario {
	FABRICA_COMUM {
		@Override
		public Usuario criarPF() {
			//VIRIA COISAS DO MODEL/BD
			//HENRIQUE E O CPF VEM DO MODEL/BD
			//PARA O BD, SERA NECESSARIO
			//UM PARAMETRO id INTEIRO.
			return new PF("Henrique",Papel.COMUM,"123.456.789-06");
		}

		@Override
		public Usuario criarPJ() {
			return new PJ("FATEC",Papel.COMUM,"02.012345/0001-15");
		}
	}, FABRICA_ADMIN {
		@Override
		public Usuario criarPF() {
			return new PF("root",Papel.ADMIN,"120.154.177-96");
		}

		@Override
		public Usuario criarPJ() {
			return new PJ("CPS",Papel.ADMIN,"01.123456/0001-22");
		}
	};
    public abstract Usuario criarPF();
    public abstract Usuario criarPJ();
}
