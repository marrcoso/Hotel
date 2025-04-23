package model;

public class Modelo {
    private int id;
    private String descricao;
    private char status;
    private Marca marca;

    public Modelo(int id, String descricao, char status, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.marca = marca;
    }
}
