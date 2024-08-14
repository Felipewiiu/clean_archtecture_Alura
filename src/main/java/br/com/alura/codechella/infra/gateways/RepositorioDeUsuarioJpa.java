package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.aplication.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entity.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper mapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository usuarioRepository, UsuarioEntityMapper mapper) {
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        usuarioRepository.save(entity);
        return mapper.toDomain(entity);

    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
