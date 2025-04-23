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
}
