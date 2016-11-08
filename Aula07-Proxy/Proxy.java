public class Proxy extends Controller {
    private Controller c;

    public Proxy(String login, String senha) {
        if (senha == "root" && login == "root")
            c = new UsuarioController();
        else
            c = new VisitanteController();
    }

    public void perfil() {
        c.perfil();
    }
    public void index() {
        c.index();
    }
}
