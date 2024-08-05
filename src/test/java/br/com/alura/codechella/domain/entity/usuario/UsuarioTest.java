package br.com.alura.codechella.domain.entity.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("123456789-99",
                    "felipe",
                    LocalDate.parse("1990-05-26"),
                    "felipe@gmail.com"
                    );
        });
    }

    @Test
    public void deveCriarUsuarioComFabricaDeUsuario(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNacimento(
                "Carla", LocalDate.parse("1996-06-25"), "123.456.789-99");

        //Aqui eu digo que nome eu estou esperando e de onde ele vem no momento da criação de usuário
        Assertions.assertEquals("Carla", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-666", 56, "Rua da saudade");

        Assertions.assertEquals("Rua da saudade", usuario.getEndereco().getComplemento());

    }



}