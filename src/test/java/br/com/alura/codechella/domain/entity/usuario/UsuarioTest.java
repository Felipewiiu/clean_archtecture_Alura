package br.com.alura.codechella.domain.entity.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

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

}