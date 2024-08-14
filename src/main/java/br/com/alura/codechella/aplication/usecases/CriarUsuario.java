package br.com.alura.codechella.aplication.usecases;


import br.com.alura.codechella.aplication.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entity.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        //usando a interface
        return repositorio.cadastrarUsuario(usuario);
    }

}
