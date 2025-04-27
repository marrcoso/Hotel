package model;

import java.sql.Timestamp;

public class MovimentoCaixa {
    Caixa caixa;
    private int id;
    private Timestamp dataHoraMovimento;
    private float valor;
    private String descricao;
    private String obs;
    private char status;

    public MovimentoCaixa(Caixa caixa, int id, Timestamp dataHoraMovimento, float valor, String descricao, String obs, char status) {
        this.caixa = caixa;
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.valor = valor;
        this.descricao = descricao;
        this.obs = obs;
        this.status = status;
    }
}
