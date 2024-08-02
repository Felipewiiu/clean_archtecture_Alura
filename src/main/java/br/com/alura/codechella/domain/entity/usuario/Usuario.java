package br.com.alura.codechella.domain.entity.usuario;

import br.com.alura.codechella.domain.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Usuario {

    private Long id;

    private String cpf;

    private String nome;

    private LocalDate nascimento;

    private String email;

    private Endereco endereco;

    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {

        if (cpf == null || !cpf.matches("\\d{3}.\\d{3}.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto");
        }
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }
}
