package br.com.alura.forumhub.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<br.com.alura.forumhub.domain.usuario.Usuario, Long> {
    UserDetails findByLogin(String login);
}
