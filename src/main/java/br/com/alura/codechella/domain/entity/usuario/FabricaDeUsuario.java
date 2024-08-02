package br.com.alura.codechella.domain.entity.usuario;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;

public class FabricaDeUsuario {

    private Usuario usuario;

    public Usuario comNomeCpfNacimento(String nome, LocalDate nascimento, String cpf) {
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return usuario;
    }

    private Usuario incluiEndereco(String cep,  Integer numero, String complement){
        this.usuario.setEndereco(new Endereco(cep, numero, complement));
        return this.usuario;
    }
}
