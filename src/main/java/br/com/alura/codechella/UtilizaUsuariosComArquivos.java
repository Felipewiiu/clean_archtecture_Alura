package br.com.alura.codechella;

import br.com.alura.codechella.domain.entity.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario("156-156-156-12", "joana", LocalDate.parse("1993-05-12"),"joana@gmail.com"));
        repositorio.cadastrarUsuario(new Usuario("156-156-156-12", "joão", LocalDate.parse("1993-05-12"),"joao@gmail.com"));
        repositorio.cadastrarUsuario(new Usuario("156-156-156-12", "maria", LocalDate.parse("1993-05-12"),"maria@gmail.com"));

        var dados = repositorio.listarTodos();

        System.out.println(dados);

        repositorio.gravaEmArquivo("usuarios.txt");
    }
}
