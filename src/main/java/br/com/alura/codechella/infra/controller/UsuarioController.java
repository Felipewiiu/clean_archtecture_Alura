package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.aplication.usecases.CriarUsuario;
import br.com.alura.codechella.aplication.usecases.ListarUsuarios;
import br.com.alura.codechella.domain.entity.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // aqui o controlador chama os casos de usos

    private final CriarUsuario criarUsuario;
    private final ListarUsuarios listarUsuarios;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuarios listarUsuarios) {
        this.criarUsuario = criarUsuario;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    public UsuarioDto cadastraUsuario(@RequestBody UsuarioDto dto){
       Usuario salvo = criarUsuario.cadastrarUsuario(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email()));

       return  new UsuarioDto(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
    }

    @GetMapping
    public List<UsuarioDto> listarUsuarios(){
        return listarUsuarios.obterTodosUsuarios()
                .stream()
                .map(u -> new UsuarioDto(u.getCpf(),
                        u.getNome(),
                        u.getNascimento(),
                        u.getEmail()))
                .collect(Collectors.toList());
    }


}
