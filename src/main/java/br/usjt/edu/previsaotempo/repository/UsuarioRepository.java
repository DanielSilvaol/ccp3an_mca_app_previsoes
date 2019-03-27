package br.usjt.edu.previsaotempo.repository;

import br.usjt.edu.previsaotempo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Usuario findOneByUsernameAndPassword(String username, String password);
    Usuario findOneByUsername(String username);
}
