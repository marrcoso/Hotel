package model;

import java.sql.Timestamp;

public class Caixa {
    private int id;
    private float valorAbertura;
    private float valorFechamento;
    private Timestamp dataHoraAbertura;
    private Timestamp dataHoraFechamento;
    private String obs;
    private char status;
    private Funcionario funcionario;

    public Caixa(int id, float valorAbertura, float valorFechamento, Timestamp dataHoraAbertura, Timestamp dataHoraFechamento, String obs, char status, Funcionario funcionario) {
        this.id = id;
        this.valorAbertura = valorAbertura;
        this.valorFechamento = valorFechamento;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.obs = obs;
        this.status = status;
        this.funcionario = funcionario;
    }
}
