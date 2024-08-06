package br.com.alura.codechella.aplication.gateways;

import br.com.alura.codechella.domain.entity.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
