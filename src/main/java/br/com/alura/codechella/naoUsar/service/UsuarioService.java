package br.com.alura.codechella.naoUsar.service;

import br.com.alura.codechella.naoUsar.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
