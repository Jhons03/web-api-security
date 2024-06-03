package dio.webapi.repository;

import dio.webapi.handler.BusinessException;
import dio.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin() == null)
            throw new BusinessException("O Campo de login é obrigatório");


        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio ");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        if(id == null)
            throw new BusinessException("O id não pode ser nulo");

        System.out.println("DELETE/id - Recebendo o usuario na camada de repositorio");
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("FIND ALL - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Edson", "180208"));
        usuarios.add(new Usuario("Shirley", "454613"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.printf("FIND/ID - Recebendo o id: %d para localizar um usuario%n", id);
        return new Usuario("Edson", "180208");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("Find/username - Recebendo o username: %s", username));
        return new Usuario("Edson", "180208");
    }

}
