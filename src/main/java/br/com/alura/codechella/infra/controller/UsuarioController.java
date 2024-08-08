package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.aplication.usecases.CriarUsuario;
import br.com.alura.codechella.domain.entity.usuario.Usuario;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // aqui vem o caso de uso

    private final CriarUsuario criarUsuario;

    public UsuarioController(CriarUsuario criarUsuario) {
        this.criarUsuario = criarUsuario;
    }

    public UsuarioDto cadastraUsuario(@RequestBody UsuarioDto dto){
       Usuario salvo = criarUsuario.cadastrarUsuario(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email()));

       return  new UsuarioDto(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
    }

}
