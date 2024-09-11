package br.com.alura.codechella.aplication.usecases;

import br.com.alura.codechella.aplication.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entity.usuario.Usuario;

import java.util.List;

public class ListarUsuarios {
    // É preciso injetar uma interface no caso de uso, que no caso é o gateway
    private final RepositorioDeUsuario repositorioUsuario;

    public ListarUsuarios(RepositorioDeUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<Usuario> obterTodosUsuarios(){
       return  this.repositorioUsuario.listarTodos();
    }
}
