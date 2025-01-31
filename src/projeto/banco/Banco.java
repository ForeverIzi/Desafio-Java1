package projeto.banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Usuario> usuarios;

    public Banco() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(int numero, String agencia, String nomeCliente, double saldo) {
        Usuario usuario = new Usuario(numero, agencia, nomeCliente, saldo);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso");
    }

    public void exibirUsuario(String agencia) {
        for (Usuario usuario: usuarios) {
            if (usuario.getAgencia().equals(agencia)) {
                System.out.println(usuario);
                return;
            }
        }
        System.out.println("Usuário não encontrado");
    }
    

}
