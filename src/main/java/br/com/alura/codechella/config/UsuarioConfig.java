package br.com.alura.codechella.config;

import br.com.alura.codechella.aplication.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.aplication.usecases.CriarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        return new CriarUsuario(repositorioDeUsuario);
    }
}
