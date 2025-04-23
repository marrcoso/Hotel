package model;

import java.util.Date;

public class Funcionario extends Pessoa{
    private String usuario;
    private String senha;

    public Funcionario(int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, Date dataCadastro, String cpf, String rg, String obs, char status, String usuario, String senha) {
        super(id, nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, dataCadastro, cpf, rg, obs, status);
        this.usuario = usuario;
        this.senha = senha;
    }
}
