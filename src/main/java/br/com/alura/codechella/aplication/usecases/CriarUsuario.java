package br.com.alura.codechella.aplication.usecases;


import br.com.alura.codechella.aplication.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entity.usuario.Usuario;

public class CriarUsuario {

    // Injeção da interface, quando usamos o final precisamos passar um construtor
    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }


    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}
