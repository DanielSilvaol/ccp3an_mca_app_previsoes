package br.usjt.edu.previsaotempo.service;

import br.usjt.edu.previsaotempo.model.Usuario;
import br.usjt.edu.previsaotempo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public LoginService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodosUsers(){
        return usuarioRepository.findAll();
    }

    public Usuario detalhesUser(Usuario usuario){
        return usuarioRepository.findOneByUsernameAndPassword(usuario.getUsername(),usuario.getPassword());
    }

    private boolean existeNome(String username){
        return usuarioRepository.findOneByUsername(username) == null;
    }


}
