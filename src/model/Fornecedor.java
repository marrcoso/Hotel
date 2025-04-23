package model;

import java.util.Date;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;

    public Fornecedor(String cnpj, String inscricaoEstadual, String contato, int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, Date dataCadastro, String cpf, String rg, String obs, char status) {
        super(id, nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, dataCadastro, cpf, rg, obs, status);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
    }
}
